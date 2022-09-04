package com.P90_Rush_B.tastyfood.item.cunstom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SNOW = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.1F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,15*20,2),1.0F)
            .build();

    public static final FoodProperties SAUCE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION,10*20,0),0.5F)
            .effect(new MobEffectInstance(MobEffects.POISON,10*20,0),0.5F)
            .effect(new MobEffectInstance(MobEffects.POISON,10*20,0),0.5F)
            .build();
    public static final FoodProperties WELCOME_WINE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.5F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION,10*20,0),0.2F)
            .effect(new MobEffectInstance(MobEffects.BLINDNESS,3*20,0),0.2F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION,30*20,4),1.0F)
            .build();
    public static final FoodProperties SAUCE_CARROT = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.3F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION,10*20,0),0.2F)
            .effect(new MobEffectInstance(MobEffects.POISON,5*20,0),0.2F)
            .effect(new MobEffectInstance(MobEffects.BLINDNESS,3*20,0),0.2F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION,5*60*20,0),1.0F)
            .build();

    public static final FoodProperties SAUCE_NOODLES = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.5F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION,10*20,0),0.2F)
            .effect(new MobEffectInstance(MobEffects.HEAL,5*20,2),1.0F)
            .effect(new MobEffectInstance(MobEffects.BLINDNESS,3*20,0),0.2F)
            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST,30*20,4),1.0F)
            .build();

}
