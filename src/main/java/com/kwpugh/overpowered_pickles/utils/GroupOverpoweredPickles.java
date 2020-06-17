package com.kwpugh.overpowered_pickles.utils;

import com.kwpugh.overpowered_pickles.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GroupOverpoweredPickles extends ItemGroup
{
	public GroupOverpoweredPickles() 
	{
		super("overpowered_pickles");
	}

	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(ItemInit.ABSURD_PICKLE.get());
	}	
}
