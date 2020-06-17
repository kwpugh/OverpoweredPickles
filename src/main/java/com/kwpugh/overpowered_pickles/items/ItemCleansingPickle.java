package com.kwpugh.overpowered_pickles.items;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.overpowered_pickles.utils.PlayerSpecialAbilities;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemCleansingPickle extends Item
{

	public ItemCleansingPickle(Properties properties)
	{
		super(properties);
	}

	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
	{
		PlayerEntity player = (PlayerEntity) (entityLiving);
		
		ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);

		PlayerSpecialAbilities.giveNewMaxHealth(worldIn, player, stack, 20.0F);
		PlayerSpecialAbilities.giveYellowHearts(worldIn, player, stack, 0.0F);
		
		return itemstack;
	}	   

	public UseAction getUseAction(ItemStack stack)
	{
		return UseAction.EAT;
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.overpowered_pickles.cleansing_pickle.line1").applyTextStyle(TextFormatting.GREEN)));
	}
}
