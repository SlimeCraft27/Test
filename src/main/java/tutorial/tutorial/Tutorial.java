package tutorial.tutorial;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import tutorial.tutorial.client.ClientHandler;
import tutorial.tutorial.init.ModEntities;
import tutorial.tutorial.init.ModItems;

@Mod(Reference.MOD_ID)
public class Tutorial {

    public Tutorial(){
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntities.register();
        ModItems.REGISTER.register(bus);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);

    }

    private void onClientSetup(FMLClientSetupEvent event){

        ClientHandler.setup();
    }

    private void onCommonSetup(FMLCommonSetupEvent event){}



}
