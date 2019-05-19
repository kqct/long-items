package in.joshl.longitems.item;

import in.joshl.longitems.LongItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import in.joshl.longitems.item.tool.ItemSword;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemSword longDiamondSword = new ItemSword(LongItems.longDiamondToolMaterial, "long_diamond_sword").setCreativeTab(CreativeTabs.COMBAT);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                longDiamondSword
        );
    }

    public static void registerModels() {
        longDiamondSword.registerItemModel();
    }
}
