package in.joshl.longitems.item.tool;

import in.joshl.longitems.LongItems;
import net.minecraft.creativetab.CreativeTabs;

public class ItemSword extends net.minecraft.item.ItemSword {

    private String name;

    public ItemSword(ToolMaterial material, String name) {
        super(material);

        setRegistryName(name);
        setTranslationKey(name);
        this.name = name;
    }

    @Override
    public ItemSword setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    public void registerItemModel() {
        LongItems.proxy.registerItemRenderer(this, 0, name);
    }

}
