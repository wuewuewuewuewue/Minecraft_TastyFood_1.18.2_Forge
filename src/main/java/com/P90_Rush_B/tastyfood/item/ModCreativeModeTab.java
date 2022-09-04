package com.P90_Rush_B.tastyfood.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TASTYFOOD_TAB = new CreativeModeTab("tastyfoodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SNOW.get());
        }
    };
}
