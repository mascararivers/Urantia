package com.rivers.urantia.commands;

import com.rivers.urantia.Urantia;
import com.rivers.urantia.utils.ChatUtils;
import com.rivers.urantia.utils.NetworkUtils;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

import java.io.IOException;

public class SetWebhookURL extends CommandBase {
    @Override
    public String getCommandName() {
        return "hook";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/hook";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        try {
            if(NetworkUtils.isWebhookValid(args[0])) {
                Urantia.webhook_url = args[0];
                Urantia.isHooked = true;
                ChatUtils.urantiaMessage("Set Discord Webhook Successfully!");
            } else {
                ChatUtils.urantiaMessage("Invalid Discord Webhook URL.");
            }
        } catch (IOException e) {
            ChatUtils.urantiaMessage("Unknown error occured.");
            throw new RuntimeException(e);
        }
    }
}
