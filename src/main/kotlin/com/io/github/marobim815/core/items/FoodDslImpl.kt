package com.io.github.marobim815.core.items

import com.io.github.marobim815.core.entries.KustomDsl
import com.io.github.marobim815.core.interfaces.FoodDsl
import net.minecraft.component.type.FoodComponent

@KustomDsl
class FoodDslImpl : FoodDsl {
    override var nutrition: Int = 0
    override var saturation: Float = 0f
    override var alwaysEdible: Boolean = false

    fun toFoodComponent(): FoodComponent {
        val builder = FoodComponent.Builder()
            .nutrition(nutrition)
            .saturationModifier(saturation)
        if (alwaysEdible) builder.alwaysEdible()
        println("[FoodDsl.toFoodComponent()] 실행 완료")
        return builder.build()
    }
}