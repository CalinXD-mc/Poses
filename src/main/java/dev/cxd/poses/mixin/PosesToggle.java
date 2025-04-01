package dev.cxd.poses.mixin;

import dev.cxd.poses.client.PosesClient;
import dev.cxd.poses.index.PosesTags;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntityRenderer.class)
public class PosesToggle {
    @Inject(method = "getArmPose", at = @At("HEAD"), cancellable = true)

    private static void MODID$getArmPoseDR(AbstractClientPlayerEntity player, Hand hand, CallbackInfoReturnable<BipedEntityModel.ArmPose> cir) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (!itemStack.isIn(PosesTags.ARMAMENT_COMPAT_TAG)) {
            if (PosesClient.emptyPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.EMPTY);
            }
        }
        if (!itemStack.isIn(PosesTags.ARMAMENT_COMPAT_TAG)) {
            if (PosesClient.itemPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.ITEM);
            }
        }
        if (!itemStack.isIn(PosesTags.ARMAMENT_COMPAT_TAG)) {
            if (PosesClient.blockPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.BLOCK);
            }
        }
        if (!itemStack.isIn(PosesTags.ARMAMENT_COMPAT_TAG)) {
            if (PosesClient.bowAndArrowPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.BOW_AND_ARROW);
            }
        }
        if (!itemStack.isIn(PosesTags.ARMAMENT_COMPAT_TAG)) {
            if (PosesClient.throwSpearPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.THROW_SPEAR);
            }
        }
        if (!itemStack.isIn(PosesTags.ARMAMENT_COMPAT_TAG)) {
            if (PosesClient.crossbowChargePose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.CROSSBOW_CHARGE);
            }
        }
        if (!itemStack.isIn(PosesTags.ARMAMENT_COMPAT_TAG)) {
            if (PosesClient.crossbowHoldPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.CROSSBOW_HOLD);
            }
        }
        if (!itemStack.isIn(PosesTags.ARMAMENT_COMPAT_TAG)) {
            if (PosesClient.spyglassPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.SPYGLASS);
            }
        }
        if (!itemStack.isIn(PosesTags.ARMAMENT_COMPAT_TAG)) {
            if (PosesClient.tootHornPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.TOOT_HORN);
            }
        }
        if (!itemStack.isIn(PosesTags.ARMAMENT_COMPAT_TAG)) {
            if (PosesClient.brushPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.BRUSH);
            }
        }
    }
}