package wile.rsgauges.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import wile.rsgauges.ModConfig;
import wile.rsgauges.libmc.detail.Registries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class ModBlockItem extends BlockItem implements TabbedItem {
  public ModBlockItem(Block blockIn, Item.Properties builder) {
    super(blockIn, builder);
  }

  @Override
  public CreativeModeTab getCreativeTab() {
    return ModConfig.isOptedOut(this) ? null : Registries.getCreativeModeTab();
  }

  @Override
  public ItemLike getItemLike() {
    return this;
  }
}
