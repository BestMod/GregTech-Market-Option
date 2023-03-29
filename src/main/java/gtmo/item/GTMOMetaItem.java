package gtmo.item;

import gregtech.api.items.metaitem.FoodUseManager;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.items.metaitem.stats.IItemContainerItemProvider;
import gtmo.GTMOValues;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;

public class GTMOMetaItem extends StandardMetaItem {
    /*Example
        public static MetaItem<?>.MetaValueItem NULL_NULL;

        @Override
        public void registerSubItems() {
            NULL_NULL = addItem(metaValue, "unlocalizedName");
        }
    */
    public static MetaItem<?>.MetaValueItem CREDIT;

    public GTMOMetaItem() {
        super();
    }

    @Override
    public void registerSubItems() {
        IItemContainerItemProvider selfContainerItemProvider = itemStack -> itemStack;

        CREDIT = addItem(1, "credit");
    }
    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        return stack.copy();
    }

    protected String formatModelPath(MetaItem<?>.MetaValueItem metaValueItem) {
        return "metaitems/" + metaValueItem.unlocalizedName.replace('.', '/');
    }

    @Override
    public boolean getHasSubtypes() {
        return true;
    }

    @Nonnull
    public CreativeTabs[] getCreativeTabs() {
        return new CreativeTabs[]{GTMOValues.TAB_GTMO};
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(@Nonnull CreativeTabs tab, @Nonnull NonNullList<ItemStack> subItems) {
        if (tab == GTMOValues.TAB_GTMO) {
            for (MetaItem.MetaValueItem item : this.getAllItems()) {
                if (item.isVisible() && ((!(item.getUseManager() instanceof FoodUseManager) && tab == GTMOValues.TAB_GTMO) || tab == CreativeTabs.SEARCH)) {
                    ItemStack itemStack = item.getStackForm();
                    item.getSubItemHandler().getSubItems(itemStack, tab, subItems);
                }
            }
        }
    }
}
