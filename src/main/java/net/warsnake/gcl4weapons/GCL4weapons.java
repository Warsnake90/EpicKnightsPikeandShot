package net.warsnake.gcl4weapons;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.warsnake.gcl4weapons.block.ModBlocks;
import net.warsnake.gcl4weapons.client.render.model.PikeShotModels;
import net.warsnake.gcl4weapons.item.ModItems;
import net.warsnake.gcl4weapons.item.Modcreativemodetabs;
import org.slf4j.Logger;

import static net.minecraftforge.api.distmarker.Dist.CLIENT;

@Mod(GCL4weapons.MOD_ID)
public class GCL4weapons
{
    public static final String MOD_ID = "gcl4weaponsnstuff";
    private static final Logger LOGGER = LogUtils.getLogger();


    public GCL4weapons(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        Modcreativemodetabs.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        ModItems.INSTANCE.init();
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("Pike & Shot Loading");
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
           PikeShotModels.INSTANCE.init(ModItems.INSTANCE);
        }
    }

}
