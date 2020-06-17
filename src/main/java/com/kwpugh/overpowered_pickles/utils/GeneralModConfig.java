package com.kwpugh.overpowered_pickles.utils;

import net.minecraftforge.common.ForgeConfigSpec;

public class GeneralModConfig
{  
    
    
    public static void init(ForgeConfigSpec.Builder SERVER_BUILDER)
    {      
        SERVER_BUILDER.comment("Settings").push("settings");
        
        
        SERVER_BUILDER.pop();
    }
}