package com.P90_Rush_B.tastyfood.item;
import com.P90_Rush_B.tastyfood.TastyFood;
import com.P90_Rush_B.tastyfood.item.cunstom.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TastyFood.MOD_ID);
    public static final RegistryObject<Item> SNOW = ITEMS.register("snow",
            () ->new Item(new Item.Properties().tab(ModCreativeModeTab.TASTYFOOD_TAB).food(ModFoods.SNOW)));
    public static final RegistryObject<Item> SAUCE = ITEMS.register("sauce",
            () ->new Item(new Item.Properties().tab(ModCreativeModeTab.TASTYFOOD_TAB).food(ModFoods.SAUCE)));
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () ->new Item(new Item.Properties().tab(ModCreativeModeTab.TASTYFOOD_TAB)));
    public static final RegistryObject<Item> SAUCE_CARROT = ITEMS.register("sauce_carrot",
            () ->new Item(new Item.Properties().tab(ModCreativeModeTab.TASTYFOOD_TAB).food(ModFoods.SAUCE_CARROT)));
    public static final RegistryObject<Item> NOODLES = ITEMS.register("noodles",
            () ->new Item(new Item.Properties().tab(ModCreativeModeTab.TASTYFOOD_TAB)));
    public static final RegistryObject<Item> SAUCE_NOODLES = ITEMS.register("sauce_noodles",
            () ->new Item(new Item.Properties().tab(ModCreativeModeTab.TASTYFOOD_TAB).food(ModFoods.SAUCE_NOODLES)));
    public static final RegistryObject<Item> WELCOME_WINE = ITEMS.register("welcome_wine",
            () ->new Item(new Item.Properties().tab(ModCreativeModeTab.TASTYFOOD_TAB).food(ModFoods.WELCOME_WINE)));
    public static final RegistryObject<Item> TASTY_IRON_SWORD = ITEMS.register("tasty_iron_sword",
            () ->new TastyIronSword(ModTiers.SAUCE_IRON,4,-2.4F,new Item.Properties().tab(ModCreativeModeTab.TASTYFOOD_TAB)));
    public static final RegistryObject<Item> TASTY_GOLDEN_SWORD = ITEMS.register("tasty_golden_sword",
            () ->new TastyGoldenSword(ModTiers.SAUCE_GOLDEN,2,-2.4F,new Item.Properties().tab(ModCreativeModeTab.TASTYFOOD_TAB)));
    public static final RegistryObject<Item> TASTY_DIAMOND_SWORD = ITEMS.register("tasty_diamond_sword",
            () ->new TastyDiamondSword(ModTiers.SAUCE_DIAMOND,5,-2.4F,new Item.Properties().tab(ModCreativeModeTab.TASTYFOOD_TAB)));
    public static final RegistryObject<Item> TASTY_NETHERITE_SWORD = ITEMS.register("tasty_netherite_sword",
            () ->new TastyNetheriteSword(ModTiers.SAUCE_NETHERITE,6,-2.4F,new Item.Properties().tab(ModCreativeModeTab.TASTYFOOD_TAB)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
