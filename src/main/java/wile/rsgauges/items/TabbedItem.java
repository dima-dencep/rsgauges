package wile.rsgauges.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.ItemLike;

public interface TabbedItem {
    CreativeModeTab getCreativeTab();
    ItemLike getItemLike();
}
