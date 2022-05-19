package com.leprofi.addon.shopdesignrevived;

import de.marcely.bedwars.api.BedwarsAPI;
import de.marcely.bedwars.api.GameAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShopdesignRevived extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        final int supportedAPIVersion = 11; // find the correct number in the tab "Table of API Versions"
        final String supportedVersionName = "5.0.10"; // update this accordingly to the number, otherwise the error will be wrong

        try {
            Class apiClass = Class.forName("de.marcely.bedwars.api.BedwarsAPI");
            int apiVersion = (int) apiClass.getMethod("getAPIVersion").invoke(null);

            if (apiVersion < supportedAPIVersion)
                throw new IllegalStateException();
        } catch(Exception e) {
            getLogger().warning("Sorry, your installed version of MBedwars is not supported. Please install at least v" + supportedVersionName);
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }

        BedwarsAPI.onReady(() -> {
            GameAPI.get().registerLobbyItemHandler(new SelectShopDesignItemHandler("selectshopdesign", this));
        });
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
