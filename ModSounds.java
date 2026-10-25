package com.voidforge.enderkatana.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public final class KatanaConfig {
    public static final ModConfigSpec SPEC;

    public static final ModConfigSpec.DoubleValue BASE_ATTACK_DAMAGE;
    public static final ModConfigSpec.DoubleValue ABSOLUTE_ATTACK_DAMAGE;
    public static final ModConfigSpec.DoubleValue BASE_ATTACK_SPEED;
    public static final ModConfigSpec.DoubleValue ABSOLUTE_ATTACK_SPEED;
    public static final ModConfigSpec.IntValue DURABILITY;
    public static final ModConfigSpec.DoubleValue SLASH_DAMAGE;
    public static final ModConfigSpec.DoubleValue SECONDARY_SLASH_DAMAGE;
    public static final ModConfigSpec.DoubleValue DASH_BONUS_DAMAGE;
    public static final ModConfigSpec.DoubleValue ULTIMATE_DAMAGE;
    public static final ModConfigSpec.DoubleValue BOSS_ULTIMATE_DAMAGE;
    public static final ModConfigSpec.DoubleValue ULTIMATE_RADIUS;
    public static final ModConfigSpec.DoubleValue SLASH_RANGE;
    public static final ModConfigSpec.DoubleValue DASH_DISTANCE;
    public static final ModConfigSpec.IntValue DASH_COOLDOWN_TICKS;
    public static final ModConfigSpec.IntValue SLASH_COOLDOWN_TICKS;
    public static final ModConfigSpec.IntValue MARK_DURATION_TICKS;
    public static final ModConfigSpec.IntValue RETURN_DURATION_TICKS;
    public static final ModConfigSpec.IntValue HIT_ENERGY;
    public static final ModConfigSpec.IntValue COMBO_ENERGY;
    public static final ModConfigSpec.IntValue DASH_ENERGY_COST;
    public static final ModConfigSpec.IntValue SLASH_ENERGY_COST;
    public static final ModConfigSpec.IntValue RETURN_ENERGY_COST;
    public static final ModConfigSpec.IntValue EMPOWERED_MODE_COST;
    public static final ModConfigSpec.IntValue ULTIMATE_ENERGY_COST;
    public static final ModConfigSpec.IntValue ULTIMATE_WINDUP_TICKS;
    public static final ModConfigSpec.IntValue ULTIMATE_COOLDOWN_TICKS;

    static {
        ModConfigSpec.Builder b = new ModConfigSpec.Builder();
        b.push("weapon");
        BASE_ATTACK_DAMAGE = b.defineInRange("baseAttackDamage", 11.0, 1.0, 100.0);
        ABSOLUTE_ATTACK_DAMAGE = b.defineInRange("absoluteAttackDamage", 14.0, 1.0, 200.0);
        BASE_ATTACK_SPEED = b.defineInRange("baseAttackSpeed", 1.8, 0.1, 10.0);
        ABSOLUTE_ATTACK_SPEED = b.defineInRange("absoluteAttackSpeed", 2.0, 0.1, 10.0);
        DURABILITY = b.defineInRange("durability", 2500, 100, 100000);
        b.pop();

        b.push("combat");
        SLASH_DAMAGE = b.defineInRange("slashDamage", 14.0, 1.0, 100.0);
        SECONDARY_SLASH_DAMAGE = b.defineInRange("secondarySlashDamage", 6.0, 1.0, 100.0);
        DASH_BONUS_DAMAGE = b.defineInRange("dashBonusDamage", 3.0, 0.0, 50.0);
        ULTIMATE_DAMAGE = b.defineInRange("ultimateDamage", 22.0, 1.0, 200.0);
        BOSS_ULTIMATE_DAMAGE = b.defineInRange("bossUltimateDamage", 9.0, 1.0, 100.0);
        ULTIMATE_RADIUS = b.defineInRange("ultimateRadius", 10.0, 2.0, 30.0);
        SLASH_RANGE = b.defineInRange("slashRange", 7.0, 2.0, 14.0);
        DASH_DISTANCE = b.defineInRange("dashDistance", 8.0, 2.0, 12.0);
        b.pop();

        b.push("cooldowns_and_energy");
        DASH_COOLDOWN_TICKS = b.defineInRange("dashCooldownTicks", 80, 1, 1200);
        SLASH_COOLDOWN_TICKS = b.defineInRange("slashCooldownTicks", 160, 1, 2400);
        MARK_DURATION_TICKS = b.defineInRange("markDurationTicks", 100, 20, 1200);
        RETURN_DURATION_TICKS = b.defineInRange("returnDurationTicks", 600, 20, 2400);
        HIT_ENERGY = b.defineInRange("energyPerHit", 8, 1, 50);
        COMBO_ENERGY = b.defineInRange("comboEnergyBonus", 5, 0, 50);
        DASH_ENERGY_COST = b.defineInRange("dashEnergyCost", 0, 0, 100);
        SLASH_ENERGY_COST = b.defineInRange("slashEnergyCost", 25, 0, 100);
        RETURN_ENERGY_COST = b.defineInRange("returnEnergyCost", 50, 0, 100);
        EMPOWERED_MODE_COST = b.defineInRange("empoweredModeCost", 60, 1, 100);
        ULTIMATE_ENERGY_COST = b.defineInRange("ultimateEnergyCost", 100, 1, 100);
        ULTIMATE_WINDUP_TICKS = b.defineInRange("ultimateWindupTicks", 20, 5, 100);
        ULTIMATE_COOLDOWN_TICKS = b.defineInRange("ultimateCooldownTicks", 600, 100, 6000);
        b.pop();
        SPEC = b.build();
    }

    private KatanaConfig() {}
}
