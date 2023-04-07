package com.livmas.alloyage.init;

import com.livmas.alloyage.Alloyage;
import com.livmas.alloyage.block.NickelOreBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AlloyageModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Alloyage.MODID);
    public static final RegistryObject<Block> NICKELORE = REGISTRY.register("nickel_ore", NickelOreBlock::new);
}
