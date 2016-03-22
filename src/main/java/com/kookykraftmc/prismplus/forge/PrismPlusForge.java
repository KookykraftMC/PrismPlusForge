package com.kookykraftmc.prismplus.forge;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = ModInfo.ID, version = ModInfo.VERSION, name =  ModInfo.NAME, acceptableRemoteVersions = "*")
public class PrismPlusForge {

    @Mod.Instance
    public static PrismPlusForge instance;
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new EventHookListener());
    }
}
