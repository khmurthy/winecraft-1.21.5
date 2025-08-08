package com.khmurthy.winecraft.mixin;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponents;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(FoodComponents.class)
public class FoodComponentsMixin {
    @Shadow @Final @Mutable
    public static final FoodComponent BAKED_POTATO = (new FoodComponent.Builder()).nutrition(4).saturationModifier(0.6F).build();
    @Shadow @Final @Mutable
    public static final FoodComponent COOKED_BEEF = (new FoodComponent.Builder()).nutrition(6).saturationModifier(0.6F).build();
    @Shadow @Final @Mutable
    public static final FoodComponent COOKED_MUTTON = (new FoodComponent.Builder()).nutrition(6).saturationModifier(0.6F).build();
    @Shadow @Final @Mutable
    public static final FoodComponent COOKED_PORKCHOP = (new FoodComponent.Builder()).nutrition(6).saturationModifier(0.6F).build();
    @Shadow @Final @Mutable
    public static final FoodComponent COOKED_RABBIT = (new FoodComponent.Builder()).nutrition(6).saturationModifier(0.6F).build();
    @Shadow @Final @Mutable
    public static final FoodComponent COOKED_SALMON = (new FoodComponent.Builder()).nutrition(6).saturationModifier(0.6F).build();
    @Shadow @Final @Mutable
    public static final FoodComponent COOKED_CHICKEN = (new FoodComponent.Builder()).nutrition(6).saturationModifier(0.6F).build();
    @Shadow @Final @Mutable
    public static final FoodComponent PUMPKIN_PIE = (new FoodComponent.Builder()).nutrition(8).saturationModifier(0.6F).build();

}
