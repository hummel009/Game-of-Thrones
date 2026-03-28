package io.github.hummel009.minecraft.got.common;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import io.github.hummel009.minecraft.got.common.faction.GOTFactionRank;
import io.github.hummel009.minecraft.got.common.faction.GOTReputationValues;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.event.HoverEvent;
import net.minecraft.util.*;

public class GOTAchievementRank extends GOTAchievement {
	private final GOTFactionRank theRank;
	private final GOTFaction theFac;

	public GOTAchievementRank(GOTFactionRank rank) {
		super(GOTAchievement.Category.TITLES, GOTAchievement.Category.TITLES.getNextRankAchID(), GOTItems.gregorCleganeSword, "reputation_" + rank.getFaction().codeName() + '_' + rank.getReputation());
		theRank = rank;
		theFac = theRank.getFaction();
		isSpecial = true;
		setRequiresAlly(theFac);
	}

	@Override
	public boolean canPlayerEarn(EntityPlayer entityplayer) {
		GOTPlayerData pd = GOTLevelData.getData(entityplayer);
		float rep = pd.getReputation(theFac);
		return !(rep < 0.0f);
	}

	@Override
	public IChatComponent getAchievementChatComponent(EntityPlayer entityplayer) {
		GOTPlayerData pd = GOTLevelData.getData(entityplayer);
		IChatComponent component = new ChatComponentTranslation(theRank.getCodeFullNameWithGender(pd)).appendText(" ").appendSibling(new ChatComponentTranslation(theRank.getAffiliationCodeName())).createCopy();
		component.getChatStyle().setColor(EnumChatFormatting.YELLOW);
		component.getChatStyle().setChatHoverEvent(new HoverEvent(GOTChatEvents.showGotAchievement, new ChatComponentText(getCategory().name() + '$' + getId())));
		return component;
	}

	@Override
	public String getDescription() {
		return StatCollector.translateToLocalFormatted("got.faction.achieveRank", GOTReputationValues.formatRepForDisplay(theRank.getReputation()));
	}

	@Override
	public String getTitle(EntityPlayer entityplayer) {
		return theRank.getFullNameWithGender(GOTLevelData.getData(entityplayer));
	}

	@Override
	public String getUntranslatedTitle(EntityPlayer entityplayer) {
		return theRank.getCodeFullNameWithGender(GOTLevelData.getData(entityplayer));
	}

	public boolean isPlayerRequiredRank(EntityPlayer entityplayer) {
		GOTPlayerData pd = GOTLevelData.getData(entityplayer);
		float rep = pd.getReputation(theFac);
		float rankRep = theRank.getReputation();
		return rep >= rankRep;
	}
}