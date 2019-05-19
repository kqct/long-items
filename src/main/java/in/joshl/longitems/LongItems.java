package in.joshl.longitems;

import in.joshl.longitems.item.ModItems;
import in.joshl.longitems.proxy.CommonProxy;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = LongItems.modId, name = LongItems.name, version = LongItems.version)
public class LongItems {

    public static final String modId = "longitems";
    public static final String name = "Long Items";
    public static final String version = "4.20.69";

    @Mod.Instance
    public static LongItems instance;

    @SidedProxy(serverSide = "in.joshl.longitems.proxy.CommonProxy", clientSide = "in.joshl.longitems.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event) {
            ModItems.registerModels();
        }

    }

    public static final Item.ToolMaterial longDiamondToolMaterial = EnumHelper.addToolMaterial(
            "LONG_DIAMOND", 3, 3122, 7.0f, 4.0f, 20);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}