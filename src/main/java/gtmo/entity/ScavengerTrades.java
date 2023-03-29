package gtmo.entity;

import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

import java.util.Random;

public class ScavengerTrades implements EntityVillager.ITradeList{
    private Random random = new Random();

    @Override
    public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random) {
        // Define the trades that the NPC can offer
        // You can define up to 7 trades by adding items and/or emeralds to the trades

        // Trade 1
        recipeList.add(new MerchantRecipe(
                new ItemStack(Items.DIAMOND, random.nextInt(3) + 1),
                new ItemStack(Items.EMERALD, random.nextInt(4) + 1)));

        // Trade 2
        recipeList.add(new MerchantRecipe(
                new ItemStack(Items.GOLD_INGOT, random.nextInt(3) + 1),
                new ItemStack(Items.DIAMOND, random.nextInt(2) + 1)));

        // Trade 3
        recipeList.add(new MerchantRecipe(
                new ItemStack(Items.APPLE, random.nextInt(16) + 1),
                new ItemStack(Items.ENDER_PEARL, random.nextInt(2) + 1)));

        // Trade 4
        recipeList.add(new MerchantRecipe(
                new ItemStack(Items.IRON_INGOT, random.nextInt(4) + 1),
                new ItemStack(Items.GOLD_INGOT, random.nextInt(2) + 1)));

        // Trade 5
        recipeList.add(new MerchantRecipe(
                new ItemStack(Items.REDSTONE, random.nextInt(16) + 1),
                new ItemStack(Items.IRON_INGOT, random.nextInt(2) + 1)));

        // Trade 6
        recipeList.add(new MerchantRecipe(
                new ItemStack(Items.COAL, random.nextInt(16) + 1),
                new ItemStack(Items.REDSTONE, random.nextInt(2) + 1)));

        // Trade 7
        recipeList.add(new MerchantRecipe(
                new ItemStack(Items.EMERALD, random.nextInt(3) + 1),
                new ItemStack(Items.COAL, random.nextInt(4) + 1)));
    }
}
