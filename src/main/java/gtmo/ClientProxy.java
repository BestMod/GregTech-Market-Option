package gtmo;

import gtmo.block.GTMOMetaBlocks;
import gtmo.entity.GTMOEntities;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy{
    @Override
    public void preLoad() {
        super.preLoad();
        if (!Minecraft.getMinecraft().getFramebuffer().isStencilEnabled()) {
            Minecraft.getMinecraft().getFramebuffer().enableStencil();
        }
        GTMOEntities.registerRenders();
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        GTMOMetaBlocks.registerItemModels();
    }

    @SubscribeEvent
    public static void onPlayerRender(RenderPlayerEvent.Pre event) {
        AbstractClientPlayer clientPlayer = (AbstractClientPlayer) event.getEntityPlayer();
    }
}
