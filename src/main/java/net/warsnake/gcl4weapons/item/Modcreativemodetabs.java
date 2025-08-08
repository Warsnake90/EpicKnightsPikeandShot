package net.warsnake.gcl4weapons.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.warsnake.gcl4weapons.GCL4weapons;
import net.warsnake.gcl4weapons.block.ModBlocks;

public class Modcreativemodetabs {
    public static final DeferredRegister<CreativeModeTab> Creativemodetabs =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GCL4weapons.MOD_ID);

    public static final RegistryObject<CreativeModeTab> gcl4_tab = Creativemodetabs.register("gcl4_tab",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.debug.get()))
            .title(Component.translatable("creativetab.gcl4_tab"))
            .displayItems((itemDisplayParameters, output) -> {

                // debug items
                output.accept(ModItems.debug.get());
                output.accept(ModBlocks.debug_block.get());

                // swords
                output.accept(ModItems.steel_smallsword.get());
                output.accept(ModItems.steel_spadroon.get());
                output.accept(ModItems.steel_basket_hilted_sword.get());
                output.accept(ModItems.steel_pallasch.get());
                output.accept(ModItems.steel_plug_bayonet.get());
                output.accept(ModItems.steel_walloon_sword.get());
                output.accept(ModItems.steel_spontoon.get());
                output.accept(ModItems.steel_long_pike.get());

                // armours
            })
            .build());

    public static void register(IEventBus eventBus){
        Creativemodetabs.register(eventBus);
    }
}
