package com.kookykraftmc.prismplus.forge;

import com.kookykraftmc.prismplus.customevents.TestEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * Created by TimeTheCat on 3/21/2016.
 */
public class EventHookListener {
    @SubscribeEvent
    public void onTest(PlayerEvent.PlayerLoggedInEvent event) {
        Player p = (Player) event.player;
        Bukkit.getServer().getPluginManager().callEvent(new TestEvent((p)));
    }
}
