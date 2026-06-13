package io.github.maplemods.maplespigcollection;


import io.github.maplemods.maplespigcollection.data.Constants;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class NeoForgeMod {

    public NeoForgeMod(IEventBus eventBus) {
        CommonMod.init();
    }
}