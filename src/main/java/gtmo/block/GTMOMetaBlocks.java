package gtmo.block;

import com.google.common.collect.ImmutableMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static gregtech.common.blocks.MetaBlocks.statePropertiesToString;

public class GTMOMetaBlocks {
    public static GTMOBlockCasing GTMO_CASING;
    public static GTMOMetalCasing GTMO_METAL_CASING;
    public static GTMOGlassCasing GTMO_GLASS_CASING;
    public static void init(){
        GTMO_CASING = new GTMOBlockCasing();
        GTMO_CASING.setRegistryName("gtmo_casing");

        GTMO_METAL_CASING = new GTMOMetalCasing();
        GTMO_METAL_CASING.setRegistryName("gtmo_metal_casing");

        GTMO_GLASS_CASING = new GTMOGlassCasing();
        GTMO_GLASS_CASING.setRegistryName("gtmo_glass_casing");

    }
    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(GTMO_CASING);
        registerItemModel(GTMO_METAL_CASING);
        registerItemModel(GTMO_GLASS_CASING);
    }
    @SideOnly(Side.CLIENT)
    private static void registerItemModel(Block block) {
        for (IBlockState state : block.getBlockState().getValidStates()) {
            //noinspection ConstantConditions
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),
                    block.getMetaFromState(state),
                    new ModelResourceLocation(block.getRegistryName(),
                            statePropertiesToString(state.getProperties())));
        }
    }
}
