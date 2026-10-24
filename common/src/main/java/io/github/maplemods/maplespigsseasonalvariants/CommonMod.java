package io.github.maplemods.maplespigsseasonalvariants;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplespigsseasonalvariants.data.Constants;
import net.minecraft.world.entity.EntityType;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerCategory(Constants.MOD_ID, "spring", "season", 3, 1, 5, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "summer", "season", 6, 1, 8, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "autumn", "season", 9, 1, 11, 30);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "winter", "season", 12, 1, 2, 28);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PIG, "autumn", "flannel_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PIG, "autumn", "flannel_pig", "*", "flannel_pig");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PIG, "autumn", "pumpkin_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PIG, "autumn", "pumpkin_pig", "*", "pumpkin_pig");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PIG, "spring", "cherry_blossom_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PIG, "spring", "cherry_blossom_pig", "*", "cherry_blossom_pig");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PIG, "spring", "flower_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PIG, "spring", "flower_pig", "*", "flower_pig");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PIG, "summer", "midsommar_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PIG, "summer", "midsommar_pig", "*", "midsommar_pig");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PIG, "summer", "watermelon_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PIG, "summer", "watermelon_pig", "*", "watermelon_pig");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PIG, "winter", "frozen_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PIG, "winter", "frozen_pig", "*", "frozen_pig");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PIG, "winter", "snow_covered_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PIG, "winter", "snow_covered_pig", "*", "snow_covered_pig");
    }
}
