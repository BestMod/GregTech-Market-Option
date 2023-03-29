package gtmo;

import gregtech.api.block.VariantItemBlock;
import gtmo.block.GTMOMetaBlocks;
import gtmo.item.GTMOMetaItem;
import gtmo.item.GTMOMetaItems;
import gtmo.recipe.GTMORecipeHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Objects;
import java.util.function.Function;

public class CommonProxy {
    public void preLoad() {
        GTMOMetaItems.init();
        GTMOMetaBlocks.init();

        GTMORecipeHandler.register();
    }

    private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer) {
        ItemBlock itemBlock = producer.apply(block);
        itemBlock.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
        return itemBlock;
    }
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(GTMOMetaBlocks.GTMO_CASING);
        registry.register(GTMOMetaBlocks.GTMO_METAL_CASING);
        registry.register(GTMOMetaBlocks.GTMO_GLASS_CASING);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(createItemBlock(GTMOMetaBlocks.GTMO_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(GTMOMetaBlocks.GTMO_METAL_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(GTMOMetaBlocks.GTMO_GLASS_CASING, VariantItemBlock::new));
    }
}
