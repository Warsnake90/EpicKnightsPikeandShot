package net.warsnake.gcl4weapons.item.custom;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.warsnake.gcl4weapons.GCL4weapons;
import net.warsnake.gcl4weapons.item.ModItems;
import net.warsnake.gcl4weapons.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier gclsmallsword = TierSortingRegistry.registerTier(
            new ForgeTier(1, 500, 1, 0, 10,
                    ModTags.Blocks.gcl_smallsword_tier,
                    () -> Ingredient.of(ModItems.debug.get())
            ),
            new ResourceLocation(GCL4weapons.MOD_ID, "smallsword"), List.of(Tiers.IRON), List.of());

}
