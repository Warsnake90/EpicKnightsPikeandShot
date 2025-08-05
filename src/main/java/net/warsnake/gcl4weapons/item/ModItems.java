package net.warsnake.gcl4weapons.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.warsnake.gcl4weapons.GCL4weapons;
import net.warsnake.gcl4weapons.item.custom.DebugItem;
import net.warsnake.gcl4weapons.item.custom.ModToolTiers;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GCL4weapons.MOD_ID);

    public static final RegistryObject<Item> debug = ITEMS.register("debug",
            () -> new DebugItem(new Item.Properties()));


    // diamond sword is pAttackSpeedModifier -2.6

    public static final RegistryObject<Item> steel_smallsword = ITEMS.register("steel_smallsword",
            () -> new SwordItem(ModToolTiers.gclsmallsword, 4, -2.5f,new Item.Properties()));

    public static final RegistryObject<Item> steel_spadroon = ITEMS.register("steel_spadroon",
            () -> new SwordItem(ModToolTiers.gclsmallsword, 4, -2.5f,new Item.Properties()));

    public static final RegistryObject<Item> steel_basket_hilted_sword = ITEMS.register("steel_basket_hilted_sword",
            () -> new SwordItem(ModToolTiers.gclsmallsword, 4, -2.5f,new Item.Properties()));

    public static final RegistryObject<Item> steel_pallasch = ITEMS.register("steel_pallasch",
            () -> new SwordItem(ModToolTiers.gclsmallsword, 4, -2.5f,new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
