
package net.complete.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.complete.itemgroup.CompleteItemGroup;
import net.complete.CompleteModElements;

@CompleteModElements.ModElement.Tag
public class SingularityIngotItem extends CompleteModElements.ModElement {
	@ObjectHolder("complete:singularity_ingot")
	public static final Item block = null;

	public SingularityIngotItem(CompleteModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CompleteItemGroup.tab).maxStackSize(9).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("singularity_ingot");
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
