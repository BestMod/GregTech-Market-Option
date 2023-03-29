package gtmo.entity;

import gtmo.GregTechMarketOption;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScavenger extends RenderLiving<EntityScavenger> {
    private static final ResourceLocation SCAVENGER_TEXTURES = new ResourceLocation(GregTechMarketOption.MODID, "textures/entity/scavenger/scavenger.png");
    public RenderScavenger(RenderManager manager) {
        super(manager, new ModelPlayer(0.0F, false), 0.5F);
    }

    protected ResourceLocation getEntityTexture(EntityScavenger entity) {
        return SCAVENGER_TEXTURES;
    }
}
