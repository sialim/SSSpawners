package me.sialim.sialimsilkspawners.listeners;

import me.sialim.sialimsilkspawners.events.SpawnerBreakEvent;
import org.bukkit.Material;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;

public class CustomListeners implements Listener
{
    @EventHandler
    public void onSpawnerBreak(SpawnerBreakEvent e)
    {
        CreatureSpawner cs = (CreatureSpawner) e.getSpawner().getState();
        ItemStack spawnerItem = new ItemStack(Material.SPAWNER);
        BlockStateMeta meta = (BlockStateMeta) spawnerItem.getItemMeta();
        CreatureSpawner css = (CreatureSpawner) meta.getBlockState();
        css.setSpawnedType(cs.getSpawnedType());
        meta.setBlockState(css);
        spawnerItem.setItemMeta(meta);
        e.getPlayer().getInventory().addItem(spawnerItem);
    }
}
