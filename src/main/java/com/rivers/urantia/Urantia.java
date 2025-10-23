package com.rivers.urantia;

import com.rivers.urantia.commands.SaveSettings;
import com.rivers.urantia.commands.SetWebhookURL;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "urantia", useMetadata=true)
public class Urantia {

    public static Minecraft mc = Minecraft.getMinecraft();
    public static boolean active = false;
    public static boolean isHooked = false;
    public static String webhook_url;
    public static String api_key;
    public static int minimumProfitMargin = 1000000;

    public void registerCommands(Object... commands) {
        for(Object command : commands) {
            MinecraftForge.EVENT_BUS.register(command);
        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        registerCommands(new SaveSettings(), new SetWebhookURL());
    }
}
