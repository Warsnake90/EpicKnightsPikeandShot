package net.warsnake.gcl4weapons.item.custom;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.warsnake.gcl4weapons.GCL4weapons;

@Mod.EventBusSubscriber(modid = GCL4weapons.MOD_ID)
public class ReachExtender {

    @SubscribeEvent
    public static void onPlayerAttack(TickEvent.PlayerTickEvent event) {

        Player player = event.player;
        if (player.level().isClientSide) return;

        if (player.getMainHandItem().getItem() instanceof ExtraReachSwordItem) {
            if (player.swinging && player.swingTime == 0) {
                float reach = 10.0f;
                Vec3 eyePos = player.getEyePosition(1.0F);
                Vec3 lookVec = player.getLookAngle();
                Vec3 reachVec = eyePos.add(lookVec.scale(reach));

                AABB aabb = player.getBoundingBox().expandTowards(lookVec.scale(reach)).inflate(1.0D, 1.0D, 1.0D);

                EntityHitResult hitResult = ProjectileUtil.getEntityHitResult(
                        player.level(), player, eyePos, reachVec, aabb,
                        (entity) -> !entity.isSpectator() && entity.isPickable() && entity != player
                );

                if (hitResult != null) {
                    Entity target = hitResult.getEntity();
                    target.hurt(player.damageSources().playerAttack(player), 7.0f);
                }
            }
        }
    }
}