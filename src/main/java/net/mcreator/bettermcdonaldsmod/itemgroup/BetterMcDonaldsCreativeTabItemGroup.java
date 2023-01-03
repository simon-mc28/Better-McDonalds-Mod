
package net.mcreator.bettermcdonaldsmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.bettermcdonaldsmod.item.HappyMealItem;
import net.mcreator.bettermcdonaldsmod.BetterMcdonaldsModModElements;

@BetterMcdonaldsModModElements.ModElement.Tag
public class BetterMcDonaldsCreativeTabItemGroup extends BetterMcdonaldsModModElements.ModElement {
	public BetterMcDonaldsCreativeTabItemGroup(BetterMcdonaldsModModElements instance) {
		super(instance, 63);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbetter_mc_donalds_creative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(HappyMealItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
