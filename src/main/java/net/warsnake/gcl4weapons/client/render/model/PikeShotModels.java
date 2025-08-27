package net.warsnake.gcl4weapons.client.render.model;

import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.client.render.ModRender;
import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.DeferredRegister;
import net.warsnake.gcl4weapons.GCL4weapons;
import net.warsnake.gcl4weapons.client.render.model.decorations.*;
import com.magistuarmory.api.client.render.model.ModModelsProvider;
import net.minecraft.client.model.geom.ModelLayerLocation;

@OnlyIn(Dist.CLIENT)
public class PikeShotModels extends ModModelsProvider {
    public static PikeShotModels INSTANCE = new PikeShotModels(GCL4weapons.MOD_ID);
    public static final ModelLayerLocation DEBUG_DECORATION_LOCATION;

    static {
        DEBUG_DECORATION_LOCATION = INSTANCE.addDecorationModel("debug_decoration", DebugDecorationModel::createLayer);
    }

    public PikeShotModels(String modId) {
        super(modId);
    }

}





