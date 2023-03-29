package gtmo.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Biomes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import java.util.HashSet;
import java.util.Set;

public class EntityScavenger extends EntityVillager {
    public static final Biome[] POSSIBLE_BIOME_SPAWNS = {Biomes.SWAMPLAND, Biomes.BEACH, Biomes.COLD_BEACH, Biomes.FOREST, Biomes.PLAINS, Biomes.ROOFED_FOREST, Biomes.EXTREME_HILLS};

    public EntityScavenger(World worldIn) {
        super(worldIn);
    }


    @Override
    public boolean getCanSpawnHere() {
        out:
        for(byte biomeByte : world.getChunk(this.chunkCoordX, this.chunkCoordZ).getBiomeArray()) {
            for (Biome currentBiome : POSSIBLE_BIOME_SPAWNS) {
                if (currentBiome.equals(Biome.getBiome(biomeByte)))
                    break out;
            }
        }
        return false;
    }
    public boolean processInteract(EntityPlayer player, EnumHand hand) {

        return super.processInteract(player, hand);
    }
}
