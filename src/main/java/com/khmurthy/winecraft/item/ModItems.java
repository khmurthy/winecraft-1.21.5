package com.khmurthy.winecraft.item;

import com.khmurthy.winecraft.Winecraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DOUGH = registerItem("dough", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Winecraft.MOD_ID,"dough")))));
    public static final Item COOKIE_DOUGH = registerItem("cookie_dough", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Winecraft.MOD_ID,"cookie_dough")))));
    public static final Item CAKE_BATTER = registerItem("cake_batter", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Winecraft.MOD_ID,"cake_batter")))));
    public static final Item UNCOOKED_PUMPKIN_PIE = registerItem("uncooked_pumpkin_pie", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Winecraft.MOD_ID,"uncooked_pumpkin_pie")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Winecraft.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Winecraft.LOGGER.info("Registering mod items for " + Winecraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(DOUGH);
            fabricItemGroupEntries.add(COOKIE_DOUGH);
            fabricItemGroupEntries.add(CAKE_BATTER);
            fabricItemGroupEntries.add(UNCOOKED_PUMPKIN_PIE);
        });
    }
}
