package me.ThaH3lper.com;
import me.ThaH3lper.com.party.Party;

import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public class DungeonAPI {
	public static boolean canhit(EntityDamageByEntityEvent event){
		boolean canhit = me.ThaH3lper.com.party.PartyListener.canHit(event); 
		return canhit;
	}
}
