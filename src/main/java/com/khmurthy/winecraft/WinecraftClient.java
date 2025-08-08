package com.khmurthy.winecraft;

import com.khmurthy.winecraft.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class WinecraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addBefore(Items.BONE, new ItemStack(ModItems.DOUGH));
            content.addBefore(Items.BONE, new ItemStack(ModItems.COOKIE_DOUGH));
            content.addBefore(Items.BONE, new ItemStack(ModItems.CAKE_BATTER));
            content.addBefore(Items.BONE, new ItemStack(ModItems.UNCOOKED_PUMPKIN_PIE));
        });
    }
}
