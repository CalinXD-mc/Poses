package dev.cxd.poses;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Poses implements ModInitializer {
	public static final String MOD_ID = "poses";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier id(String path) {
		return new Identifier("armament", path);
	}

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}