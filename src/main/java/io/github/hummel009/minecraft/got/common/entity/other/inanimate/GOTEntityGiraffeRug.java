package io.github.hummel009.minecraft.got.common.entity.other.inanimate;

import io.github.hummel009.minecraft.got.common.data.GOTItems;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityGiraffeRug extends GOTEntityRugBase {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityGiraffeRug(World world) {
		super(world);
		setSize(2.0f, 0.3f);
	}

	@Override
	public ItemStack getRugItem() {
		return new ItemStack(GOTItems.giraffeRug);
	}
}