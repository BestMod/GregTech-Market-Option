package gtmo.entity.scavenger;

import gtmo.entity.ScavengerTrades;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityScavenger extends EntityLiving {
    private ScavengerTrades scavengerTrades;
    public EntityScavenger(World world) {
        super(world);

        // Initialize the NPC's attributes, such as its health and speed.
        this.setSize(0.6F, 1.8F);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);

        // Initialize the custom trades
        this.scavengerTrades = new ScavengerTrades();
    }

    // Override the updateAITasks method to define the NPC's behavior.
    @Override
    public void updateAITasks() {
        super.updateAITasks();

        // Define the NPC's patrol behavior.
        if (this.getAttackTarget() == null && this.getNavigator().noPath()) {
            // Define the NPC's patrol path.
            Path path = this.getNavigator().getPath();
            if (path == null || path.isFinished()) {
                BlockPos newPos = this.getPosition().add(
                        this.rand.nextInt(8) - 4,
                        this.rand.nextInt(8) - 4,
                        this.rand.nextInt(8) - 4
                );
                this.getNavigator().tryMoveToXYZ(newPos.getX(), newPos.getY(), newPos.getZ(), 1.0D);
            }
        }
    }
}
