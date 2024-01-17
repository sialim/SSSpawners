package me.sialim.sialimsilkspawners;

import me.sialim.sialimsilkspawners.listeners.BlockBreakListener;
import me.sialim.sialimsilkspawners.listeners.CustomListeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SialimSilkSpawners extends JavaPlugin {
    @Override
    public void onEnable()
    {
        Bukkit.getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new CustomListeners(), this);
    }
}
