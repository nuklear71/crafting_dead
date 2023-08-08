package net.crafting_dead.crafting_dead.item;

import net.crafting_dead.crafting_dead.CaftingDead;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CaftingDead.MOD_ID);

    //resursi

    public static final RegistryObject<Item> ROCK = ITEMS.register("rock",
            ()-> new Item(new Item.Properties().stacksTo(25)));

    public static final RegistryObject<Item> WOOD = ITEMS.register("wood",
            ()-> new Item(new Item.Properties().stacksTo(25)));

    public static final RegistryObject<Item> MERAL_FRAGMENTS = ITEMS.register("metal_fragments",
            ()-> new Item(new Item.Properties().stacksTo(50)));

    public static final RegistryObject<Item> METAL_SCRAP = ITEMS.register("metal_scrap",
            ()-> new Item(new Item.Properties().stacksTo(25)));


    //brown chip

    public static final RegistryObject<Item> BROWN_CHIP = ITEMS.register("brown_chip",
            ()-> new Item(new Item.Properties().stacksTo(6)));

    public static final RegistryObject<Item> BROWN_CHIP_EMPTY = ITEMS.register("brown_chip_empty",
            ()-> new Item(new Item.Properties().stacksTo(6)));

    public static final RegistryObject<Item> BROWN_CHIP_DESTROY = ITEMS.register("brown_chip_destroy",
            ()-> new Item(new Item.Properties().stacksTo(6)));


    //green chip

    public static final RegistryObject<Item> GREEN_CHIP = ITEMS.register("green_chip",
            ()-> new Item(new Item.Properties().stacksTo(6)));

    public static final RegistryObject<Item> GREEN_CHIP_EMPTY = ITEMS.register("green_chip_empty",
            ()-> new Item(new Item.Properties().stacksTo(6)));

    public static final RegistryObject<Item> GREEN_CHIP_DESTROY = ITEMS.register("green_chip_destroy",
            ()-> new Item(new Item.Properties().stacksTo(6)));


    //blue chip

    public static final RegistryObject<Item> BLUE_CHIP = ITEMS.register("blue_chip",
            ()-> new Item(new Item.Properties().stacksTo(6)));

    public static final RegistryObject<Item> BLUE_CHIP_EMPTY = ITEMS.register("blue_chip_empty",
            ()-> new Item(new Item.Properties().stacksTo(6)));

    public static final RegistryObject<Item> BLUE_CHIP_DESTROY = ITEMS.register("blue_chip_destroy",
            ()-> new Item(new Item.Properties().stacksTo(6)));


    //red chip

    public static final RegistryObject<Item> RED_CHIP = ITEMS.register("red_chip",
            ()-> new Item(new Item.Properties().stacksTo(6)));

    public static final RegistryObject<Item> RED_CHIP_EMPTY = ITEMS.register("red_chip_empty",
            ()-> new Item(new Item.Properties().stacksTo(6)));

    public static final RegistryObject<Item> RED_CHIP_DESTROY = ITEMS.register("red_chip_destroy",
            ()-> new Item(new Item.Properties().stacksTo(6)));

    //keycard

    public static final RegistryObject<Item> KEYCARD_LEVEL_1 = ITEMS.register("keycard_level_1",
            ()-> new Item(new Item.Properties().stacksTo(1).durability(3)));

    public static final RegistryObject<Item> KEYCARD_LEVEL_2 = ITEMS.register("keycard_level_2",
            ()-> new Item(new Item.Properties().stacksTo(1).durability(3)));

    public static final RegistryObject<Item> KEYCARD_LEVEL_3 = ITEMS.register("keycard_level_3",
            ()-> new Item(new Item.Properties().stacksTo(1).durability(3)));

    public static final RegistryObject<Item> KEYCARD_LEVEL_4 = ITEMS.register("keycard_level_4",
            ()-> new Item(new Item.Properties().stacksTo(1).durability(3)));

    public static final RegistryObject<Item> KEYCARD_LEVEL_5 = ITEMS.register("keycard_level_5",
            ()-> new Item(new Item.Properties().stacksTo(1).durability(3)));

    public static final RegistryObject<Item> KEYCARD_ADMIN = ITEMS.register("keycard_admin",
            ()-> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> KEYCARD_EMPTY = ITEMS.register("keycard_empty",
            ()-> new Item(new Item.Properties().stacksTo(1).durability(3)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

