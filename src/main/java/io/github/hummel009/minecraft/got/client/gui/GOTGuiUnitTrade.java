package io.github.hummel009.minecraft.got.client.gui;

import io.github.hummel009.minecraft.got.common.entity.other.iface.GOTUnitTradeable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GOTGuiUnitTrade extends GOTGuiHireBase {
	public GOTGuiUnitTrade(EntityPlayer entityplayer, GOTUnitTradeable trader, World world) {
		super(entityplayer, trader, world);
		setTrades(trader.getUnits());
	}
}