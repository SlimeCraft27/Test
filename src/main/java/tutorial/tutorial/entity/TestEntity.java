package tutorial.tutorial.entity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

@SuppressWarnings("ALL")
public class TestEntity<T extends MobRenderer> extends MonsterEntity {


    public TestEntity(EntityType<? extends TestEntity<MobRenderer>> type, World worldIn) {
        super(type, worldIn);
    }

}
