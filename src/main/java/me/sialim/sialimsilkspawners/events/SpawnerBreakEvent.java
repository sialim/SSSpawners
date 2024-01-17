package me.sialim.sialimsilkspawners.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class SpawnerBreakEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    Player p;
    Block spawner;

    public SpawnerBreakEvent(Player p, Block spawner)
    {
        this.p = p;
        this.spawner = spawner;
    }

    public Player getPlayer()
    {
        return p;
    }

    public Block getSpawner()
    {
        return spawner;
    }

    public HandlerList getHandlers()
    {
        return handlers;
    }

    public static HandlerList getHandlerList()
    {
        return handlers;
    }
}
