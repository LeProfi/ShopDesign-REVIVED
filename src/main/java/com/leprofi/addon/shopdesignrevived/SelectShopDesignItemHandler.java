package com.leprofi.addon.shopdesignrevived;

import de.marcely.bedwars.api.arena.Arena;
import de.marcely.bedwars.api.game.lobby.LobbyItem;
import de.marcely.bedwars.api.game.lobby.LobbyItemHandler;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class SelectShopDesignItemHandler extends LobbyItemHandler {
    public SelectShopDesignItemHandler(String id, Plugin plugin) {
        super(id, plugin);
    }

    @Override
    public void handleUse(Player player, Arena arena, LobbyItem lobbyItem) {
        //TODO
    }

    @Override
    public boolean isVisible(Player player, Arena arena, LobbyItem lobbyItem) {
        return true;
    }
}
