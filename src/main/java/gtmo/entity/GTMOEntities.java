package gtmo.entity;

import gtmo.GregTechMarketOption;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderSnowMan;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = GregTechMarketOption.MODID)
public class GTMOEntities {
    @SubscribeEvent
    public static void onEntityRegistry(RegistryEvent.Register<EntityEntry> event)
    {
    }
    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
    }
}
