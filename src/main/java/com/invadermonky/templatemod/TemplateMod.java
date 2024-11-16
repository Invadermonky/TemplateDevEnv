package com.invadermonky.templatemod;

import com.invadermonky.templatemod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = TemplateMod.MOD_ID,
        name = TemplateMod.MOD_NAME,
        version = TemplateMod.VERSION,
        acceptedMinecraftVersions = TemplateMod.MC_VERSION,
        dependencies = TemplateMod.DEPENDENCIES
)
public class TemplateMod {
    public static final String MOD_ID = "templatemod";
    public static final String MOD_NAME = "Template Mod";
    public static final String VERSION = "1.12.2-1.0.0";
    public static final String MC_VERSION = "[1.12.2]";
    public static final String DEPENDENCIES = "";

    public static final String ProxyClientClass = "com.invadermonky." + MOD_ID + ".proxy.ClientProxy";
    public static final String ProxyServerClass = "com.invadermonky." + MOD_ID + ".proxy.CommonProxy";

    @Mod.Instance(MOD_ID)
    public static TemplateMod instance;

    @SidedProxy(clientSide = ProxyClientClass, serverSide = ProxyServerClass)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {
        proxy.loadComplete(event);
    }
}
