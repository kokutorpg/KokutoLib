package net.kokutorpg.kokutolib;

import net.kokutorpg.kokutolib.classes.ClassManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {

    public static ClassManager classManager;

    @Override
    public void onEnable() {
        getLogger().info("KokutoLib enabled");


    }

    @Override
    public void onDisable() {

    }
}
