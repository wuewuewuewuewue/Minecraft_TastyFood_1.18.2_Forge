package com.P90_Rush_B.tastyfood.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier SAUCE_IRON = new ForgeTier(2,250,6.0f,2f,
            14, BlockTags.NEEDS_IRON_TOOL,
            ()-> Ingredient.of(ModItems.SAUCE.get()));
    public static final ForgeTier SAUCE_GOLDEN = new ForgeTier(0,32,12.0f,2f,
            22, BlockTags.NEEDS_IRON_TOOL,
            ()-> Ingredient.of(ModItems.SAUCE.get()));
    public static final ForgeTier SAUCE_DIAMOND = new ForgeTier(3,1561,8.0f,2f,
            10, BlockTags.NEEDS_DIAMOND_TOOL,
            ()-> Ingredient.of(ModItems.SAUCE.get()));
    public static final ForgeTier SAUCE_NETHERITE = new ForgeTier(4,2031,9.0f,2f,
            15, BlockTags.NEEDS_DIAMOND_TOOL,
            ()-> Ingredient.of(ModItems.SAUCE.get()));
}
