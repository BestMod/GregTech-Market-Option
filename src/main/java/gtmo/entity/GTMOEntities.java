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
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityRaider.class)
                .id(new ResourceLocation(GregTechMarketOption.MODID, "raider"), 28)
                .name("raider")
                .tracker(80, 3, true)
                .spawn(EnumCreatureType.CREATURE, 2, 1, 3, EntityRaider.POSSIBLE_BIOME_SPAWNS)
                .egg(0x3d352f, 0xf0ded1).build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityScavenger.class)
                .id(new ResourceLocation(GregTechMarketOption.MODID, "scavenger"), 28)
                .name("scavenger")
                .tracker(80, 3, true)
                .egg(0x3d352f, 0xf0ded1).build());
    }
    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityRaider.class, RenderRaider::new);
    }
}
