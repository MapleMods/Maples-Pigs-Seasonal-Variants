package io.github.maplemods.maplespigcollection;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplespigcollection.data.Constants;
import net.minecraft.world.entity.EntityTypes;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "autumn", "flannel_pig", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "autumn", "pumpkin_pig", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "spring", "cherry_blossom_pig", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "spring", "flower_pig", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "summer", "midsommar_pig", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "summer", "watermelon_pig", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "winter", "frozen_pig", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "winter", "snow_covered_pig", 1);
    }
}
