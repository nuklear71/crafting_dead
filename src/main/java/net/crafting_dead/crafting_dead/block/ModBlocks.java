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
    //black_white_tiles_small
    public static final RegistryObject<Block> BLACK_WHITE_TILES_SMALL = registerBlock("black_white_tiles_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BLACK_WHITE_TILES_SMALL_SLAB = registerBlock("black_white_tiles_small_slab",
            () -> new   SlabBlock(BlockBehaviour.Properties.copy(BLACK_WHITE_TILES_SMALL.get())));
    public static final  RegistryObject<Block> BLACK_WHITE_TILES_SMALL_STAIRS = registerBlock("black_white_tiles_small_stairs",
            () -> new  StairBlock( BLACK_WHITE_TILES_SMALL.get().defaultBlockState(),BlockBehaviour.Properties.copy(BLACK_WHITE_TILES_SMALL.get())));

    //black_white_tiles_small_crack
    public static final RegistryObject<Block> CRACKED_BLACK_WHITE_TILES_SMALL = registerBlock("cracked_black_white_tiles_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_BLACK_WHITE_TILES_SMALL_SLAB = registerBlock("cracked_black_white_tiles_small_slab",
            () -> new   SlabBlock(BlockBehaviour.Properties.copy(CRACKED_BLACK_WHITE_TILES_SMALL.get())));
    public static final  RegistryObject<Block> CRACKED_BLACK_WHITE_TILES_SMALL_STAIRS = registerBlock("cracked_black_white_tiles_small_stairs",
            () -> new  StairBlock( CRACKED_BLACK_WHITE_TILES_SMALL.get().defaultBlockState(),BlockBehaviour.Properties.copy(CRACKED_BLACK_WHITE_TILES_SMALL.get())));

    //random blocks
    public static final RegistryObject<Block> DIRT = registerBlock("dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_SLAB = registerBlock("dirt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> ROCKY_DIRT = registerBlock("rocky_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> ROCKY_DIRT_SLAB = registerBlock("rocky_dirt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    //stone

    //sotne1
    public static final RegistryObject<Block> STONE_1 = registerBlock("stone_1",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> STONE_1_SLAB = registerBlock("stone_1_slab",
            () -> new   SlabBlock(BlockBehaviour.Properties.copy(STONE_1.get())));
    public static final  RegistryObject<Block> STONE_1_STAIRS = registerBlock("stone_1_stairs",
            () -> new  StairBlock( STONE_1.get().defaultBlockState(),BlockBehaviour.Properties.copy(STONE_1.get())));
    //sotne2
    public static final RegistryObject<Block> STONE_2 = registerBlock("stone_2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> STONE_2_SLAB = registerBlock("stone_2_slab",
            () -> new   SlabBlock(BlockBehaviour.Properties.copy(STONE_2.get())));
    public static final  RegistryObject<Block> STONE_2_STAIRS = registerBlock("stone_2_stairs",
            () -> new  StairBlock( STONE_2.get().defaultBlockState(),BlockBehaviour.Properties.copy(STONE_2.get())));
    //sotne3
    public static final RegistryObject<Block> STONE_3 = registerBlock("stone_3",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> STONE_3_SLAB = registerBlock("stone_3_slab",
            () -> new   SlabBlock(BlockBehaviour.Properties.copy(STONE_3.get())));
    public static final  RegistryObject<Block> STONE_3_STAIRS = registerBlock("stone_3_stairs",
            () -> new  StairBlock( STONE_3.get().defaultBlockState(),BlockBehaviour.Properties.copy(STONE_3.get())));

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
