package com.P90_Rush_B.tastyfood.events;

import com.P90_Rush_B.tastyfood.TastyFood;
import com.P90_Rush_B.tastyfood.item.ModItems;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber(modid = TastyFood.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void eatFoodEvent(LivingEntityUseItemEvent.Finish event){
        Random random = new Random();
        int r = random.nextInt(100)+1;
        if (r <= 10){
            Player player = (Player)event.getEntityLiving();
            Vec3 vec = player.getLookAngle();
            double dx = player.getX() - (vec.x() * 2);
            double dz = player.getZ() - (vec.z() * 2);
            ItemEntity IE = new ItemEntity(event.getEntity().level, dx, player.getY(), dz, new ItemStack(ModItems.SNOW.get(), 1));
            event.getEntity().level.addFreshEntity(IE);
            String s = "噗叽啪";
            player.sendMessage(new TranslatableComponent(s),player.getUUID());
        }
    }
    @SubscribeEvent
    public static void livingAttackEvent(LivingAttackEvent event){
        Random random = new Random();
        int r = random.nextInt(100)+1;
        if (r<=5){
            ItemEntity snow = new ItemEntity(event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), new ItemStack(ModItems.SNOW.get(), 1));
            event.getEntity().level.addFreshEntity(snow);
        }
    }
    @SubscribeEvent
    public static void livingDeadEvent(LivingDeathEvent event) {
        if (!event.getEntity().level.isClientSide()) {

            if (event.getSource().getDirectEntity() instanceof Player) {
                Player player = ((Player) event.getSource().getDirectEntity());

                if (event.getEntity().getType() == EntityType.CHICKEN) {
                    String s = "你干嘛啊~哎哟";
                    player.sendMessage(new TranslatableComponent(s),
                            player.getUUID());

                }
            }
        }
    }
}
