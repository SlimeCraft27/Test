package tutorial.tutorial.init;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;
import tutorial.tutorial.Reference;
import tutorial.tutorial.entity.TestEntity;

public enum ModEntities {
        INSTANCE;

        public static EntityType<TestEntity> TEST;

        public static void register() {

            TEST = register("test", EntityType.Builder.create(TestEntity::new, EntityClassification.MONSTER).size(0.5f, 2.5f));

            ForgeRegistries.ENTITIES.registerAll(
                    TEST
            );
        }

        private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
            ResourceLocation regName = new ResourceLocation(Reference.MOD_ID, name);
            return (EntityType<T>) builder.build(name).setRegistryName(regName);
        }

        public static void initializeAttributes() {

            GlobalEntityTypeAttributes.put(TEST, TestEntity.registerAttributes().create());
        }
}
