package com.livmas.alloyage.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class NickelIngot extends Item {
    public NickelIngot() {
        super(new Item.Properties().rarity(Rarity.COMMON).stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS));
    }
}
