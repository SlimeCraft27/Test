package tutorial.tutorial.client.renderer.entity.model;

import net.minecraft.client.renderer.entity.model.SlimeModel;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TestModel<T extends Entity> extends SlimeModel<T> {



    public TestModel(int slimeBodyTexOffY) {
        super(slimeBodyTexOffY);
    }
}