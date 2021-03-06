package com.samuel.spectritemod.init;

import com.samuel.spectritemod.SpectriteMod;
import com.samuel.spectritemod.items.ItemDiamondRod;
import com.samuel.spectritemod.items.ItemMoltenSpectriteBucket;
import com.samuel.spectritemod.items.ItemSpectriteArmor;
import com.samuel.spectritemod.items.ItemSpectriteArrow;
import com.samuel.spectritemod.items.ItemSpectriteAxe;
import com.samuel.spectritemod.items.ItemSpectriteAxeSpecial;
import com.samuel.spectritemod.items.ItemSpectriteBow;
import com.samuel.spectritemod.items.ItemSpectriteBowSpecial;
import com.samuel.spectritemod.items.ItemSpectriteBrick;
import com.samuel.spectritemod.items.ItemSpectriteCompass;
import com.samuel.spectritemod.items.ItemSpectriteGem;
import com.samuel.spectritemod.items.ItemSpectriteOrb;
import com.samuel.spectritemod.items.ItemSpectritePickaxe;
import com.samuel.spectritemod.items.ItemSpectritePickaxeSpecial;
import com.samuel.spectritemod.items.ItemSpectriteRod;
import com.samuel.spectritemod.items.ItemSpectriteShield;
import com.samuel.spectritemod.items.ItemSpectriteShieldSpecial;
import com.samuel.spectritemod.items.ItemSpectriteShovel;
import com.samuel.spectritemod.items.ItemSpectriteShovelSpecial;
import com.samuel.spectritemod.items.ItemSpectriteSword;
import com.samuel.spectritemod.items.ItemSpectriteSwordSpecial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static ItemDiamondRod diamond_rod;
	public static ItemSpectriteRod spectrite_rod;
	public static ItemSpectriteBrick spectrite_brick;
	public static ItemSpectriteGem spectrite_gem;
	public static ItemSpectriteOrb spectrite_orb;
	public static ItemSpectriteShovel spectrite_shovel;
	public static ItemSpectriteShovelSpecial spectrite_shovel_special;
	public static ItemSpectritePickaxe spectrite_pickaxe;
	public static ItemSpectritePickaxeSpecial spectrite_pickaxe_special;
	public static ItemSpectriteAxe spectrite_axe;
	public static ItemSpectriteAxeSpecial spectrite_axe_special;
	public static ItemSpectriteSword spectrite_sword;
	public static ItemSpectriteSwordSpecial spectrite_sword_special;
	public static ItemSpectriteSword spectrite_sword_2;
	public static ItemSpectriteSwordSpecial spectrite_sword_2_special;
	public static ItemSpectriteArrow spectrite_arrow;
	public static ItemSpectriteBow spectrite_bow;
	public static ItemSpectriteBowSpecial spectrite_bow_special;
	public static ItemSpectriteShield spectrite_shield;
	public static ItemSpectriteShieldSpecial spectrite_shield_special;
	public static ItemSpectriteArmor spectrite_helmet;
	public static ItemSpectriteArmor spectrite_chestplate;
	public static ItemSpectriteArmor spectrite_leggings;
	public static ItemSpectriteArmor spectrite_boots;
	public static ItemMoltenSpectriteBucket molten_spectrite_bucket;
	public static ItemSpectriteCompass spectrite_compass;

	public static void createItems() {
		(diamond_rod = new ItemDiamondRod()).setCreativeTab(CreativeTabs.MATERIALS);
		(spectrite_rod = new ItemSpectriteRod()).setCreativeTab(CreativeTabs.MATERIALS);
		(spectrite_brick = new ItemSpectriteBrick()).setCreativeTab(CreativeTabs.MATERIALS);
		(spectrite_gem = new ItemSpectriteGem()).setCreativeTab(CreativeTabs.MATERIALS);
		SpectriteMod.SPECTRITE_TOOL.setRepairItem(new ItemStack(spectrite_gem));
		SpectriteMod.PERFECT_SPECTRITE_TOOL.setRepairItem(new ItemStack(spectrite_gem));
		SpectriteMod.SPECTRITE_2_TOOL.setRepairItem(new ItemStack(spectrite_gem));
		SpectriteMod.PERFECT_SPECTRITE_2_TOOL.setRepairItem(new ItemStack(spectrite_gem));
		(spectrite_orb = new ItemSpectriteOrb()).setCreativeTab(CreativeTabs.MISC);
		spectrite_shovel = new ItemSpectriteShovel();
		spectrite_shovel_special = new ItemSpectriteShovelSpecial();
		spectrite_pickaxe = new ItemSpectritePickaxe();
		spectrite_pickaxe_special = new ItemSpectritePickaxeSpecial();
		spectrite_axe = new ItemSpectriteAxe();
		spectrite_axe_special = new ItemSpectriteAxeSpecial();
		spectrite_sword = new ItemSpectriteSword(false);
		spectrite_sword_special = new ItemSpectriteSwordSpecial(false);
		spectrite_sword_2 = new ItemSpectriteSword(true);
		spectrite_sword_2_special = new ItemSpectriteSwordSpecial(true);
		spectrite_arrow = new ItemSpectriteArrow();
		spectrite_bow = new ItemSpectriteBow();
		spectrite_bow_special = new ItemSpectriteBowSpecial();
		spectrite_shield = new ItemSpectriteShield();
		spectrite_shield_special = new ItemSpectriteShieldSpecial();
		spectrite_helmet = new ItemSpectriteArmor(EntityEquipmentSlot.HEAD);
		spectrite_chestplate = new ItemSpectriteArmor(EntityEquipmentSlot.CHEST);
		spectrite_leggings = new ItemSpectriteArmor(EntityEquipmentSlot.LEGS);
		spectrite_boots = new ItemSpectriteArmor(EntityEquipmentSlot.FEET);
		molten_spectrite_bucket = new ItemMoltenSpectriteBucket();
		(spectrite_compass = new ItemSpectriteCompass()).setCreativeTab(CreativeTabs.TOOLS);
	}
	
	public static void registerItems() {
		registerItem(diamond_rod, "diamond_rod");
		registerItem(spectrite_rod, "spectrite_rod");
		registerItem(spectrite_brick, "spectrite_brick");
		registerItem(spectrite_gem,
			"spectrite_gem");
		registerItem(spectrite_orb,
			"spectrite_orb");
		registerItem(spectrite_shovel,
			"spectrite_shovel");
		registerItem(spectrite_shovel_special,
			"spectrite_shovel_special");
		registerItem(spectrite_pickaxe,
			"spectrite_pickaxe");
		registerItem(spectrite_pickaxe_special,
			"spectrite_pickaxe_special");
		registerItem(spectrite_axe,
			"spectrite_axe");
		registerItem(spectrite_axe_special,
			"spectrite_axe_special");
		registerItem(spectrite_sword,
			"spectrite_sword");
		registerItem(spectrite_sword_special,
			"spectrite_sword_special");
		registerItem(spectrite_sword_2,
			"spectrite_sword_2");
		registerItem(spectrite_sword_2_special,
			"spectrite_sword_2_special");
		registerItem(spectrite_arrow,
			"spectrite_arrow");
		registerItem(spectrite_bow,
			"spectrite_bow");
		registerItem(spectrite_bow_special,
			"spectrite_bow_special");
		registerItem(spectrite_shield,
			"spectrite_shield");
		registerItem(spectrite_shield_special,
			"spectrite_shield_special");
		registerItem(spectrite_helmet,
			"spectrite_helmet");
		registerItem(spectrite_chestplate,
			"spectrite_chestplate");
		registerItem(spectrite_leggings,
			"spectrite_leggings");
		registerItem(spectrite_boots,
			"spectrite_boots");
		registerItem(spectrite_compass,
			"spectrite_compass");
	}
	
	private static <T extends Item> T registerItem(T item, String name)
	{
		item.setUnlocalizedName(name);
		item.setRegistryName(name);

		GameRegistry.register(item);

		return item;
	}

}
