package com.maxim.meincoolermod; // <-- KORRIGIERTES PAKET

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// KORRIGIERTER KLASSENNAME
public class MeinCoolerMod implements ModInitializer { 
	
    // KORRIGIERTE MOD_ID
	public static final String MOD_ID = "meincoolermod"; 
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world! " + MOD_ID + " wird geladen!");
	}
}