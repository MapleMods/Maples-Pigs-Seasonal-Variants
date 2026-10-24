package io.github.maplemods.maplespigsseasonalvariants;


import io.github.maplemods.maplespigsseasonalvariants.data.Constants;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class NeoForgeMod {

    public NeoForgeMod(IEventBus eventBus) {
        CommonMod.init();
    }
}