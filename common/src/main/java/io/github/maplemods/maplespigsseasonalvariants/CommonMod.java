package io.github.maplemods.maplespigsseasonalvariants;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplespigsseasonalvariants.data.Constants;
import net.minecraft.world.entity.EntityTypes;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerCategory(Constants.MOD_ID, "spring", "season", 3, 1, 5, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "summer", "season", 6, 1, 8, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "autumn", "season", 9, 1, 11, 30);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "winter", "season", 12, 1, 2, 28);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "autumn", "flannel_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "autumn", "flannel_pig", "*", "flannel_pig");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "autumn", "flannel_pig", "entity/pig/pig_cold_baby", "flannel_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "autumn", "flannel_pig", "entity/pig/pig_temperate_baby", "flannel_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "autumn", "flannel_pig", "entity/pig/pig_warm_baby", "flannel_pig_any_baby");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "autumn", "pumpkin_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "autumn", "pumpkin_pig", "*", "pumpkin_pig");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "autumn", "pumpkin_pig", "entity/pig/pig_cold_baby", "pumpkin_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "autumn", "pumpkin_pig", "entity/pig/pig_temperate_baby", "pumpkin_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "autumn", "pumpkin_pig", "entity/pig/pig_warm_baby", "pumpkin_pig_any_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "spring", "cherry_blossom_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "spring", "cherry_blossom_pig", "*", "cherry_blossom_pig");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "spring", "cherry_blossom_pig", "entity/pig/pig_cold_baby", "cherry_blossom_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "spring", "cherry_blossom_pig", "entity/pig/pig_temperate_baby", "cherry_blossom_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "spring", "cherry_blossom_pig", "entity/pig/pig_warm_baby", "cherry_blossom_pig_any_baby");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "spring", "flower_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "spring", "flower_pig", "*", "flower_pig");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "spring", "flower_pig", "entity/pig/pig_cold_baby", "flower_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "spring", "flower_pig", "entity/pig/pig_temperate_baby", "flower_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "spring", "flower_pig", "entity/pig/pig_warm_baby", "flower_pig_any_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "summer", "midsommar_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "summer", "midsommar_pig", "*", "midsommar_pig");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "summer", "midsommar_pig", "entity/pig/pig_cold_baby", "midsommar_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "summer", "midsommar_pig", "entity/pig/pig_temperate_baby", "midsommar_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "summer", "midsommar_pig", "entity/pig/pig_warm_baby", "midsommar_pig_any_baby");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "summer", "watermelon_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "summer", "watermelon_pig", "*", "watermelon_pig");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "summer", "watermelon_pig", "entity/pig/pig_cold_baby", "watermelon_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "summer", "watermelon_pig", "entity/pig/pig_temperate_baby", "watermelon_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "summer", "watermelon_pig", "entity/pig/pig_warm_baby", "watermelon_pig_any_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "winter", "frozen_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "winter", "frozen_pig", "*", "frozen_pig");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "winter", "frozen_pig", "entity/pig/pig_cold_baby", "frozen_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "winter", "frozen_pig", "entity/pig/pig_temperate_baby", "frozen_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "winter", "frozen_pig", "entity/pig/pig_warm_baby", "frozen_pig_any_baby");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "winter", "snow_covered_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "winter", "snow_covered_pig", "*", "snow_covered_pig");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "winter", "snow_covered_pig", "entity/pig/pig_cold_baby", "snow_covered_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "winter", "snow_covered_pig", "entity/pig/pig_temperate_baby", "snow_covered_pig_any_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "winter", "snow_covered_pig", "entity/pig/pig_warm_baby", "snow_covered_pig_any_baby");
    }
}
