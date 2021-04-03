package tutorial.tutorial.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import tutorial.tutorial.client.renderer.entity.RenderTest;
import tutorial.tutorial.init.ModEntities;

@OnlyIn(Dist.CLIENT)
public class ClientHandler {

    public static void setup() {
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.TEST, RenderTest::new);
    }
}
