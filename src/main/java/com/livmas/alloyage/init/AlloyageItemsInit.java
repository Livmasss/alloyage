package com.livmas.alloyage.init;

import com.livmas.alloyage.Alloyage;
import com.livmas.alloyage.item.NickelIngot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AlloyageItemsInit {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Alloyage.MODID);
    public static final RegistryObject<Item> NICKELINGOT = REGISTRY.register("nickelingot", NickelIngot::new);
    public static final RegistryObject<Item> NICKELORE = registerBlock(AlloyageModBlocks.NICKELORE, CreativeModeTab.TAB_BUILDING_BLOCKS);

    private static RegistryObject<Item> registerBlock(RegistryObject<Block> block, CreativeModeTab cTab) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(cTab)));
    }
}
