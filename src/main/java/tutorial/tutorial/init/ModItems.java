package tutorial.tutorial.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tutorial.tutorial.Reference;

public class ModItems {

    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> TEST_SPAWN_EGG = REGISTER.register("test_spawn_egg", () -> new SpawnEggItem(ModEntities.TEST, 0x4da744, 0x316f5d, new Item.Properties().group(ItemGroup.MISC)));
}
