package gtmo;

import gtmo.block.GTMOMetaBlocks;
import gtmo.client.GTMOClientHandler;
import gtmo.entity.GTMOEntities;
import gtmo.machines.GTMOTileEntities;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GregTechMarketOption.MODID, name = GregTechMarketOption.NAME, version = GregTechMarketOption.VERSION,
        dependencies = "required-after:gregtech@(2.3.4,);" + "after:gcy_science")
public class GregTechMarketOption {
    public static final String MODID = "gtmo";
    public static final String NAME = "GregTech Market Option";
    public static final String VERSION = "@VERSION@";

    @Mod.Instance
    public static GregTechMarketOption instance;


    @SidedProxy(modId = MODID, clientSide = "gtmo.ClientProxy", serverSide = "gtmo.CommonProxy")
    public static CommonProxy proxy;


    @Mod.EventHandler
    public void onStartup(FMLConstructionEvent event) {
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preLoad();

        GTMOMetaBlocks.init();
        GTMOTileEntities.init();

        MinecraftForge.EVENT_BUS.register(new GTMOEntities()); // For entity registration through EntityEntries!

        GTMOClientHandler.registerSounds();

        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
