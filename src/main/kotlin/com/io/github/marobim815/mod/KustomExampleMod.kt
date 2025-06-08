package com.io.github.marobim815.mod

import com.io.github.marobim815.core.entries.kustom
import net.fabricmc.api.ModInitializer
import net.minecraft.util.Rarity
import org.slf4j.LoggerFactory

object KustomExampleMod : ModInitializer {
    private val logger = LoggerFactory.getLogger("kustom_example_mod")

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Hello Fabric world!")
		kustom("kustom_example_mod") {
			items {
				item("test_item") {
					displayName = "Test Item"
					itemSettings.fireproof()
					itemSettings.rarity(Rarity.RARE)
				}
			}
		}

	}
}