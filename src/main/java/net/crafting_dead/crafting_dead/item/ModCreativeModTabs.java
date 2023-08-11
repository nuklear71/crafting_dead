package net.crafting_dead.crafting_dead.item;

import net.crafting_dead.crafting_dead.CaftingDead;
import net.crafting_dead.crafting_dead.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CaftingDead.MOD_ID);
//tabs add here
    public static final RegistryObject<CreativeModeTab> CRAFTING_DEAD_ITEM_TAB = CREATIVE_MODE_TABS.register("crafting_dead_item_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ROCK.get()))
                    .title(Component.translatable("creativetab.crafting_dead_item_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //item in tabs add here
                        //resrsi
                        pOutput.accept(ModItems.ROCK.get());
                        pOutput.accept(ModItems.WOOD.get());
                        pOutput.accept(ModItems.MERAL_FRAGMENTS.get());
                        pOutput.accept(ModItems.METAL_SCRAP.get());
                        //chip brown
                        pOutput.accept(ModItems.BROWN_CHIP.get());
                        pOutput.accept(ModItems.BROWN_CHIP_EMPTY.get());
                        pOutput.accept(ModItems.BROWN_CHIP_DESTROY.get());
                        //chip green
                        pOutput.accept(ModItems.GREEN_CHIP.get());
                        pOutput.accept(ModItems.GREEN_CHIP_EMPTY.get());
                        pOutput.accept(ModItems.GREEN_CHIP_DESTROY.get());
                        //chip blue
                        pOutput.accept(ModItems.BLUE_CHIP.get());
                        pOutput.accept(ModItems.BLUE_CHIP_EMPTY.get());
                        pOutput.accept(ModItems.BLUE_CHIP_DESTROY.get());
                        //chip red
                        pOutput.accept(ModItems.RED_CHIP.get());
                        pOutput.accept(ModItems.RED_CHIP_EMPTY.get());
                        pOutput.accept(ModItems.RED_CHIP_DESTROY.get());
                        //keycard
                        pOutput.accept(ModItems.KEYCARD_LEVEL_1.get());
                        pOutput.accept(ModItems.KEYCARD_LEVEL_2.get());
                        pOutput.accept(ModItems.KEYCARD_LEVEL_3.get());
                        pOutput.accept(ModItems.KEYCARD_LEVEL_4.get());
                        pOutput.accept(ModItems.KEYCARD_LEVEL_5.get());
                        pOutput.accept(ModItems.KEYCARD_ADMIN.get());
                        pOutput.accept(ModItems.KEYCARD_EMPTY.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> CRAFTING_DEAD_BLOCK_TAB = CREATIVE_MODE_TABS.register("crafting_dead_block_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLACK_WHITE_TILES_SMALL.get()))
                    .title(Component.translatable("creativetab.crafting_dead_block_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //item in tabs add here
                        pOutput.accept(ModBlocks.BLACK_WHITE_TILES_SMALL.get());
                        pOutput.accept(ModBlocks.BLACK_WHITE_TILES_SMALL_SLAB.get());
                        pOutput.accept(ModBlocks.BLACK_WHITE_TILES_SMALL_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_BLACK_WHITE_TILES_SMALL.get());
                        pOutput.accept(ModBlocks.CRACKED_BLACK_WHITE_TILES_SMALL_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_BLACK_WHITE_TILES_SMALL_STAIRS.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
