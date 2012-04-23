 package net.meepcraft.alexdgr8r.potionprotect;

/*Meepcraft Potion Project, Copyright 2012 Alexdgr8r and Kedalion*/

import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.entity.Entity

public class PotionListener implements Listener {
	
	@EventHandler(priority = EventPriority.NORMAL)
	 private double damage = 2.0D; /*We're probably going to need this in the future, used Double because 
	 it's more tightley nit.*/
	public void potionSplash(PotionSplashEvent event) {
		ThrownPotion potion = event.getPotion();
		for (PotionEffect effect : potion.getEffects()) {
			effect.getType().getId();
			if(potion.inGround) //Just found away to find the exact location
			{ 
			float findloc = potion.getLocation(); /*Now that we can play with this, it makes it a lot
			easier to count plots etc.*/
			
			
			return findloc; /*I just returned this for debugging purposes. 
			Nobody will see it in the acual plugin*/
				
				}
			}
		}
	}
}
