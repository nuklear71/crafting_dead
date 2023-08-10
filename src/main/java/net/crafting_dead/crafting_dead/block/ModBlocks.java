package net.crafting_dead.crafting_dead.block;

import net.crafting_dead.crafting_dead.CaftingDead;
import net.crafting_dead.crafting_dead.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CaftingDead.MOD_ID);
    //blocks add here
    public static final RegistryObject<Block> BLACK_WHITE_TILES_SMALL = registerBlock("black_white_tiles_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BLACK_WHITE_TILES_SMALL_SLAB = registerBlock("black_white_tiles_small_slab",
            () -> new   SlabBlock(BlockBehaviour.Properties.copy(BLACK_WHITE_TILES_SMALL.get())));

    public static final  RegistryObject<Block> BLACK_WHITE_TILES_SMALL_STAIRS = registerBlock("black_white_tiles_small_stairs",
            () -> new  StairBlock( BLACK_WHITE_TILES_SMALL.get().defaultBlockState(),BlockBehaviour.Properties.copy(BLACK_WHITE_TILES_SMALL.get())));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register (IEventBus eventBus ) {
        BLOCKS.register(eventBus);
    }
}
