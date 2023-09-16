package net.monstertrex.rethinkingores.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {

    COPPER(1, 120, 7.0f, 1f, 15, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    COPPER_PLATED(2, 160, 10.0f, 1f, 18, () -> Ingredient.ofItems(ModItems.COPPER_PLATED_INGOT)),
    STEEL(2, 400, 7.0f, 2.5f, 16, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    PLATINUM(3, 650, 12.0f, 3f, 26, () -> Ingredient.ofItems(ModItems.PLATINUM_INGOT)),
    TITANIUM(4, 800, 9f, 3.5f, 16, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT));



    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage,
                            int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
