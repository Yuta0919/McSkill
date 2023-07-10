package yuta0919.mcskill;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import yuta0919.mcskill.Listener.Mining.MineBlockDig;

public final class McSkill extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new MineBlockDig(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
