package gtmo.entity;

import gtmo.GregTechMarketOption;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRaider extends RenderLiving<EntityRaider> {
    private static final ResourceLocation RAIDER_TEXTURES = new ResourceLocation(GregTechMarketOption.MODID, "textures/entity/raider/raider.png");
    public RenderRaider(RenderManager manager) {
        super(manager, new ModelPlayer(0.0F, true), 0.5F);
    }

    protected ResourceLocation getEntityTexture(EntityRaider entity) {
        return RAIDER_TEXTURES;
    }
}
