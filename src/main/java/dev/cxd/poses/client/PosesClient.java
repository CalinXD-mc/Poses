package dev.cxd.poses.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class PosesClient implements ClientModInitializer {
    public static KeyBinding emptyPose;
    public static KeyBinding itemPose;
    public static KeyBinding blockPose;
    public static KeyBinding bowAndArrowPose;
    public static KeyBinding throwSpearPose;
    public static KeyBinding crossbowChargePose;
    public static KeyBinding crossbowHoldPose;
    public static KeyBinding spyglassPose;
    public static KeyBinding tootHornPose;
    public static KeyBinding brushPose;


    @Override
    public void onInitializeClient() {
        emptyPose = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.poses.empty_pose",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_UNKNOWN,
                "keybinds.poses"
        ));
        itemPose = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.poses.item_pose",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_UNKNOWN,
                "keybinds.poses"
        ));
        blockPose = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.poses.block_pose",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_UNKNOWN,
                "keybinds.poses"
        ));
        bowAndArrowPose = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.poses.bow_and_arrow_pose",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_UNKNOWN,
                "keybinds.poses"
        ));
        throwSpearPose = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.poses.throw_spear_pose",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_UNKNOWN,
                "keybinds.poses"
        ));

        crossbowChargePose = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.poses.crossbow_charge_pose",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_UNKNOWN,
                "keybinds.poses"
        ));
        crossbowHoldPose = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.poses.crossbow_hold_pose",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_UNKNOWN,
                "keybinds.poses"
        ));
        spyglassPose = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.poses.spyglass_pose",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_UNKNOWN,
                "keybinds.poses"
        ));
        tootHornPose = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.poses.toot_horn_pose",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_UNKNOWN,
                "keybinds.poses"
        ));
        brushPose = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.poses.brush_pose",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_UNKNOWN,
                "keybinds.poses"
        ));
    }
}
