
package net.mcreator.bettermcdonaldsmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.block.BlockState;

import net.mcreator.bettermcdonaldsmod.itemgroup.BetterMcDonaldsCreativeTabItemGroup;
import net.mcreator.bettermcdonaldsmod.BetterMcdonaldsModModElements;

@BetterMcdonaldsModModElements.ModElement.Tag
public class MayoItem extends BetterMcdonaldsModModElements.ModElement {
	@ObjectHolder("better_mcdonalds_mod:mayo")
	public static final Item block = null;

	public MayoItem(BetterMcdonaldsModModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BetterMcDonaldsCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(1).saturation(1f)

							.build()));
			setRegistryName("mayo");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
