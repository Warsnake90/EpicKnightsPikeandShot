package net.warsnake.gcl4weapons.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.warsnake.gcl4weapons.item.custom.ReachExtender;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ExtraReachSwordItem extends SwordItem {
    public ExtraReachSwordItem(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.gcl4weaponsnstuff.pike_tooltip"));

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
