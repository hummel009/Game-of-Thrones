package io.github.hummel009.minecraft.got.common.command;

import io.github.hummel009.minecraft.got.common.GOTConfig;
import net.minecraft.command.server.CommandMessage;

public class GOTCommandMessageFixed extends CommandMessage {
	@Override
	public boolean isUsernameIndex(String[] args, int i) {
		return !GOTConfig.preventMessageExploit && super.isUsernameIndex(args, i);
	}
}