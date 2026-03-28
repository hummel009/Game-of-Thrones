package io.github.hummel009.minecraft.got.common.command;

import io.github.hummel009.minecraft.got.common.entity.GOTEntityRegistry;
import net.minecraft.command.server.CommandSummon;

public class GOTCommandSummon extends CommandSummon {
	@Override
	public String[] func_147182_d() {
		return GOTEntityRegistry.getAllEntityNames().toArray(new String[0]);
	}

	@Override
	public String getCommandName() {
		return "got_summon";
	}
}