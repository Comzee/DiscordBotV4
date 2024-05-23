package com.bot.discordbotv4.options;

import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

public class RoleOptions {
    public static OptionData handleRoleOptions(){
        return new OptionData(OptionType.STRING, "rolerequest", "Allows you to request a role", true)
                .addChoice("Strawberry", "656942762901635095")
                .addChoice("Emoji Sauce", "717458408227340411")
                .addChoice("IRL", "717459083690770462")
                .addChoice("Cyan Name", "717459143018938470")
                .addChoice("Audio Friend", "1227047509931720836")
                .addChoice("Rando", "941817816712089680");
    }
}
