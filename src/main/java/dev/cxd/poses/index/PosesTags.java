package dev.cxd.poses.index;

import dev.cxd.poses.Poses;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class PosesTags {
    public static final TagKey<Item> UNUSABLE_TAG = create("non_usable_tag");
    private static TagKey<Item> create(String id) {
        return TagKey.of(RegistryKeys.ITEM, Poses.id(id));
    }
}