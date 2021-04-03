package tutorial.tutorial.client.renderer.entity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tutorial.tutorial.Reference;
import tutorial.tutorial.client.renderer.entity.model.TestModel;
import tutorial.tutorial.entity.TestEntity;

@OnlyIn(Dist.CLIENT)
public class RenderTest extends MobRenderer<TestEntity<MobRenderer>, TestModel<TestEntity<MobRenderer>>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/test.png");

    public RenderTest(EntityRendererManager manager) {
        super(manager, new TestModel<>(1), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(TestEntity<MobRenderer> entity) {
        return TEXTURE;
    }

    @Override
    protected boolean isVisible(TestEntity<MobRenderer> entity) {
        return false;
    }

}
