package com.rivers.urantia.commands;

import com.rivers.urantia.Urantia;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class SaveSettings extends CommandBase {
    @Override
    public String getCommandName() {
        return "save";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/save";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        String webhook_url = Urantia.webhook_url;
        boolean hooked = Urantia.isHooked;
        int mpm = Urantia.minimumProfitMargin;
        String api = Urantia.api_key;
    }
}
