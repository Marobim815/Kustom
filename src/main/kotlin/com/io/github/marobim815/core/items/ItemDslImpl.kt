package com.io.github.marobim815.core.items

import com.io.github.marobim815.core.dataclasses.KustomData
import com.io.github.marobim815.core.entries.KustomConfig
import com.io.github.marobim815.core.entries.KustomDsl
import com.io.github.marobim815.core.interfaces.ItemDsl
import com.io.github.marobim815.core.interfaces.KustomDslElement
import net.minecraft.item.Item
import net.minecraft.util.Identifier

@KustomDsl @Suppress("MemberVisibilityCanBePrivate")
class ItemDslImpl(
    override val name: String,
    private val config: KustomConfig
) : AbstractImpl(), KustomDslElement, ItemDsl {

    override val itemSettings = Item.Settings()
    var displayName: String = name.replaceFirstChar { it.uppercase() }
    var texture: String = "items/$name"
    private var foodDsl: FoodDslImpl? = null

    @Suppress("unused")
    fun food(block: FoodDslImpl.() -> Unit) {
        foodDsl = FoodDslImpl().apply(block)
    }

    override fun build(): List<KustomData> {
        val identifier = Identifier.of(config.modId, name)

        val item = Item(
            if (foodDsl != null) {
                println("[ItemDslImpel.build()] foodDsl == null")
                itemSettings.food(foodDsl!!.toFoodComponent())
            } else {
                println("[ItemDslImpel.build()] foodDsl != null")
                itemSettings
            }
        )

        return listOf(
            KustomData.ItemData(
                id = identifier,
                item = item,
                modelJson = """
                    {
                        "parent": "item/generated",
                        "textures": {
                            "layer0": "${config.modId}:$texture"
                        }
                    }
                """.trimIndent(),
                langKey = "item.${config.modId}.$name",
                displayName = displayName,
            )
        )

    }
}
