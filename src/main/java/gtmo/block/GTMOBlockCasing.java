package gtmo.block;

import gregtech.api.block.VariantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class GTMOBlockCasing extends VariantBlock<GTMOBlockCasing.CasingType> {
    public GTMOBlockCasing() {
        super(Material.IRON);
        setTranslationKey("gtmo_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.STONE);
        setHarvestLevel("wrench", 2);
        setDefaultState(getState(CasingType.ADOBE_BRICKS));
    }

    @Override
    public boolean canCreatureSpawn(IBlockState state, IBlockAccess world, BlockPos pos, EntityLiving.SpawnPlacementType type) {
        return false;
    }

    @Override
    public IBlockState getState(CasingType variant) {
        return super.getState(variant);
    }

    public enum CasingType implements IStringSerializable {

        ADOBE_BRICKS("adobe_bricks");


        private final String name;

        CasingType(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return this.name;
        }

    }
}
