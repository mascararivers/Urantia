package com.rivers.urantia.utils;

import com.rivers.urantia.Urantia;
import net.minecraft.util.ChatComponentText;

public class ChatUtils {
    public static String skyblockCommand = "/play skyblock";

    public static void openAuction(String id) {
        if(Urantia.mc.thePlayer.openContainer == null) {
            Urantia.mc.thePlayer.sendChatMessage("/auction " + id);
        }
    }

    public static void urantiaMessage(String message) {
        Urantia.mc.thePlayer.addChatMessage(new ChatComponentText("§c[§7Urantia§c] §d" + message));
    }
}
