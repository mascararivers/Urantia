package com.rivers.urantia.events;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class TickEvent {
    @SubscribeEvent
    public void tick(PlayerTickEvent event) {
        Minecraft mc = Minecraft.getMinecraft();

    }
}
