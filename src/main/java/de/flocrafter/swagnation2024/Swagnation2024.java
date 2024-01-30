package de.flocrafter.swagnation2024;

import de.flocrafter.swagnation2024.Commands.Test;
import org.bukkit.plugin.java.JavaPlugin;

public final class Swagnation2024 extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("Test").setExecutor(new Test());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
