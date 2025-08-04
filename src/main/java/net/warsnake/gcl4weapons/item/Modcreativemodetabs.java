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
                output.accept(ModItems.debug.get());

                output.accept(ModBlocks.debug_block.get());
            })
            .build());

    public static void register(IEventBus eventBus){
        Creativemodetabs.register(eventBus);
    }
}
