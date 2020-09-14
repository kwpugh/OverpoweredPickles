package com.kwpugh.overpowered_pickles.utils;

import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class PlayerSpecialAbilities
{
	//Set player health beyond normal max health
	public static void giveNewMaxHealth(World world, PlayerEntity player, ItemStack itemstack, float newMax)
	{
		if(!world.isRemote)
		{
			ServerPlayerEntity serverPlayer = (ServerPlayerEntity)player;
	
			serverPlayer.getAttribute(Attributes.MAX_HEALTH).setBaseValue(newMax);
			player.setHealth(newMax);
		}
	
		return;
	}

	//Set player extra abroption hearts
	public static void giveYellowHearts(World world, PlayerEntity player, ItemStack itemstack, float newAbsorption)
	{		
		player.setAbsorptionAmount(newAbsorption);
		
		return;
	}
}
