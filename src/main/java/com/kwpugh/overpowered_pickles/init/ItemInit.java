package com.kwpugh.overpowered_pickles.init;

import com.kwpugh.overpowered_pickles.OverpoweredPickles;
import com.kwpugh.overpowered_pickles.items.ItemAbsurdPickle;
import com.kwpugh.overpowered_pickles.items.ItemCleansingPickle;
import com.kwpugh.overpowered_pickles.items.ItemFarcicalPickle;
import com.kwpugh.overpowered_pickles.items.ItemInsanePickle;
import com.kwpugh.overpowered_pickles.items.ItemLudicrousPickle;
import com.kwpugh.overpowered_pickles.items.ItemPreposterousPickle;
import com.kwpugh.overpowered_pickles.items.ItemRidiculousPickle;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OverpoweredPickles.modid);
	
	public static final RegistryObject<Item> PICKLE_STAR = ITEMS.register("pickle_star", () -> new Item(new Item.Properties().maxStackSize(16).group(OverpoweredPickles.itemgroup)));
	
	public static final RegistryObject<Item> ABSURD_PICKLE = ITEMS.register("absurd_pickle", () -> new ItemAbsurdPickle(new Item.Properties().food(FoodList.absurd_pickle).group(OverpoweredPickles.itemgroup)));
	public static final RegistryObject<Item> RIDICULOUS_PICKLE = ITEMS.register("ridiculous_pickle", () -> new ItemRidiculousPickle(new Item.Properties().food(FoodList.ridiculous_pickle).group(OverpoweredPickles.itemgroup)));
	public static final RegistryObject<Item> LUDICROUS_PICKLE = ITEMS.register("ludicrous_pickle", () -> new ItemLudicrousPickle(new Item.Properties().food(FoodList.ludicrous_pickle).group(OverpoweredPickles.itemgroup)));
	public static final RegistryObject<Item> INSANE_PICKLE = ITEMS.register("insane_pickle", () -> new ItemInsanePickle(new Item.Properties().food(FoodList.insane_pickle).group(OverpoweredPickles.itemgroup)));
	
	public static final RegistryObject<Item> FARCICAL_PICKLE = ITEMS.register("farcical_pickle", () -> new ItemFarcicalPickle(new Item.Properties().food(FoodList.farcical_pickle).group(OverpoweredPickles.itemgroup)));
	public static final RegistryObject<Item> PREPOSTEROUS_PICKLE = ITEMS.register("preposterous_pickle", () -> new ItemPreposterousPickle(new Item.Properties().food(FoodList.preposterous_pickle).group(OverpoweredPickles.itemgroup)));
	
	public static final RegistryObject<Item> CLEANSING_PICKLE = ITEMS.register("cleansing_pickle", () -> new ItemCleansingPickle(new Item.Properties().food(FoodList.insane_pickle).group(OverpoweredPickles.itemgroup)));
}
