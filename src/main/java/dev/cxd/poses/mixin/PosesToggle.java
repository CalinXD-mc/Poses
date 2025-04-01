package dev.cxd.poses.mixin;

import dev.cxd.poses.client.PosesClient;
import dev.cxd.poses.index.PosesTags;
import net.minecraft.client.MinecraftClient;
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
        // Ensure this only applies to the local player
        if (player != MinecraftClient.getInstance().player) {
            return;
        }

        ItemStack itemStack = player.getStackInHand(hand);

        if (!itemStack.isIn(PosesTags.UNUSABLE_TAG)) {
            if (PosesClient.emptyPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.EMPTY);
            } else if (PosesClient.itemPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.ITEM);
            } else if (PosesClient.blockPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.BLOCK);
            } else if (PosesClient.bowAndArrowPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.BOW_AND_ARROW);
            } else if (PosesClient.throwSpearPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.THROW_SPEAR);
            } else if (PosesClient.crossbowChargePose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.CROSSBOW_CHARGE);
            } else if (PosesClient.crossbowHoldPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.CROSSBOW_HOLD);
            } else if (PosesClient.spyglassPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.SPYGLASS);
            } else if (PosesClient.tootHornPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.TOOT_HORN);
            } else if (PosesClient.brushPose.isPressed()) {
                cir.setReturnValue(BipedEntityModel.ArmPose.BRUSH);
            }
        }
    }
}