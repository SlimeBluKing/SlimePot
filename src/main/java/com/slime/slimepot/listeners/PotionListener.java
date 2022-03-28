package com.slime.slimepot.listeners;

import com.slime.slimepot.Slimepot;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionType;
import org.bukkit.util.Vector;
import org.bukkit.plugin.Plugin;

public class PotionListener implements Listener {
    private Plugin plugin = Slimepot.getPlugin(Slimepot.class);

    //----------------------------------------All potions------------------------------------------------------
    boolean vAWKWARD = plugin.getConfig().getBoolean("AWKWARD");
    boolean vFIRE_RESISTANCE = plugin.getConfig().getBoolean("FIRE_RESISTANCE");
    boolean vINSTANT_DAMAGE = plugin.getConfig().getBoolean("INSTANT_DAMAGE");
    boolean vINSTANT_HEAL = plugin.getConfig().getBoolean("INSTANT_HEAL");
    boolean vINVISIBILITY = plugin.getConfig().getBoolean("INVISIBILITY");
    boolean vJUMP = plugin.getConfig().getBoolean("JUMP");
    boolean vLUCK = plugin.getConfig().getBoolean("LUCK");
    boolean vMUNDANE = plugin.getConfig().getBoolean("MUNDANE");
    boolean vNIGHT_VISION = plugin.getConfig().getBoolean("NIGHT_VISION");
    boolean vPOISON = plugin.getConfig().getBoolean("POISON");
    boolean vREGEN = plugin.getConfig().getBoolean("REGEN");
    boolean vSLOW_FALLING = plugin.getConfig().getBoolean("SLOW_FALLING");
    boolean vSLOWNESS = plugin.getConfig().getBoolean("SLOWNESS");
    boolean vSPEED = plugin.getConfig().getBoolean("SPEED");
    boolean vSTRENGTH = plugin.getConfig().getBoolean("STRENGTH");
    boolean vTHICK = plugin.getConfig().getBoolean("THICK");
    boolean vTURTLE_MASTER = plugin.getConfig().getBoolean("TURTLE_MASTER");
    boolean vUNCRAFTABLE = plugin.getConfig().getBoolean("UNCRAFTABLE");
    boolean vWATER = plugin.getConfig().getBoolean("WATER");
    boolean vWATER_BREATHING = plugin.getConfig().getBoolean("WATER_BREATHING");
    boolean vWEAKNESS = plugin.getConfig().getBoolean("WEAKNESS");
    //------------------------------------------------------------------------------------------------------------

    @EventHandler
    public void onPotThrow(ProjectileLaunchEvent e) {
        ThrownPotion thrown = (e.getEntity().getType() == EntityType.SPLASH_POTION) ? (ThrownPotion)e.getEntity() : null;
        if (thrown == null) {
            return;
        }
        PotionMeta meta = (PotionMeta)thrown.getItem().getItemMeta();
        if (meta.getBasePotionData().getType() == PotionType.AWKWARD && thrown.getShooter() instanceof Player && vAWKWARD) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.FIRE_RESISTANCE && thrown.getShooter() instanceof Player && vFIRE_RESISTANCE) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.INSTANT_DAMAGE && thrown.getShooter() instanceof Player && vINSTANT_DAMAGE) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.INSTANT_HEAL && thrown.getShooter() instanceof Player && vINSTANT_HEAL) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.INVISIBILITY && thrown.getShooter() instanceof Player && vINVISIBILITY) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.JUMP && thrown.getShooter() instanceof Player && vJUMP) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.LUCK && thrown.getShooter() instanceof Player && vLUCK) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.MUNDANE && thrown.getShooter() instanceof Player && vMUNDANE) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.NIGHT_VISION && thrown.getShooter() instanceof Player && vNIGHT_VISION ) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.POISON && thrown.getShooter() instanceof Player && vPOISON ) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.SLOW_FALLING && thrown.getShooter() instanceof Player && vSLOW_FALLING) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.SPEED && thrown.getShooter() instanceof Player && vSPEED) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.STRENGTH && thrown.getShooter() instanceof Player && vSTRENGTH) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.TURTLE_MASTER && thrown.getShooter() instanceof Player && vTURTLE_MASTER) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.UNCRAFTABLE && thrown.getShooter() instanceof Player && vUNCRAFTABLE) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.WATER && thrown.getShooter() instanceof Player && vWATER) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.WATER_BREATHING && thrown.getShooter() instanceof Player && vWATER_BREATHING) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.WEAKNESS && thrown.getShooter() instanceof Player && vWEAKNESS) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.REGEN && thrown.getShooter() instanceof Player && vREGEN) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.SLOWNESS && thrown.getShooter() instanceof Player && vSLOWNESS) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
        if (meta.getBasePotionData().getType() == PotionType.THICK && thrown.getShooter() instanceof Player && vTHICK) {
            Vector velocity = thrown.getVelocity();
            velocity.setY(velocity.getY() - 4.0D);
            thrown.setVelocity(velocity);
        }
    }

    @EventHandler
    public void onPotSplash(PotionSplashEvent e) {
        PotionMeta pm = (PotionMeta)e.getPotion().getItem().getItemMeta();
        if (pm.getBasePotionData().getType() == PotionType.AWKWARD && e.getEntity().getShooter() instanceof Player && vAWKWARD) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.FIRE_RESISTANCE && e.getEntity().getShooter() instanceof Player && vFIRE_RESISTANCE) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.INSTANT_DAMAGE && e.getEntity().getShooter() instanceof Player && vINSTANT_DAMAGE) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.INSTANT_HEAL && e.getEntity().getShooter() instanceof Player && vINSTANT_HEAL) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.INVISIBILITY && e.getEntity().getShooter() instanceof Player && vINVISIBILITY) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.JUMP && e.getEntity().getShooter() instanceof Player && vJUMP) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.LUCK && e.getEntity().getShooter() instanceof Player && vLUCK) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.MUNDANE && e.getEntity().getShooter() instanceof Player && vMUNDANE) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.NIGHT_VISION && e.getEntity().getShooter() instanceof Player && vNIGHT_VISION) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.POISON && e.getEntity().getShooter() instanceof Player && vPOISON) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.REGEN && e.getEntity().getShooter() instanceof Player && vREGEN) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.SLOW_FALLING && e.getEntity().getShooter() instanceof Player && vSLOW_FALLING) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.SLOWNESS && e.getEntity().getShooter() instanceof Player && vSLOWNESS) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.SPEED && e.getEntity().getShooter() instanceof Player && vSPEED) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.STRENGTH && e.getEntity().getShooter() instanceof Player && vSTRENGTH) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.THICK && e.getEntity().getShooter() instanceof Player && vTHICK) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.TURTLE_MASTER && e.getEntity().getShooter() instanceof Player && vTURTLE_MASTER) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.UNCRAFTABLE && e.getEntity().getShooter() instanceof Player && vUNCRAFTABLE) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.WATER && e.getEntity().getShooter() instanceof Player && vWATER) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.WATER_BREATHING && e.getEntity().getShooter() instanceof Player && vWATER_BREATHING) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
        if (pm.getBasePotionData().getType() == PotionType.WEAKNESS  && e.getEntity().getShooter() instanceof Player && vWEAKNESS) {
            Player player = (Player)e.getEntity().getShooter();
            e.setIntensity((LivingEntity)player, 1.0D);
        }
    }
}