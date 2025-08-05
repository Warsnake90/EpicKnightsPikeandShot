package net.warsnake.gcl4weapons.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.warsnake.gcl4weapons.GCL4weapons;
import org.jetbrains.annotations.NotNull;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> gcl_smallsword_tier = tag("gcl_smallsword_tier");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(GCL4weapons.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> gcl_smallsword_tiers = tag("gcl_smallsword_tier");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(GCL4weapons.MOD_ID, name));
        }
    }
}
