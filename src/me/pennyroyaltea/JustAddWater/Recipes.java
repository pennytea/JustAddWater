package me.pennyroyaltea.JustAddWater;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;

public class Recipes
{
	private final Plugin plugin;
	
	public Recipes(Main plugin)
	{
		this.plugin = plugin;
	}
	
	public void concreteRecipes()
	{
		ShapelessRecipe white = new ShapelessRecipe(new NamespacedKey(plugin, "white_concrete"), new ItemStack(Material.WHITE_CONCRETE, 8));
		white.addIngredient(8, Material.WHITE_CONCRETE_POWDER);
		white.addIngredient(Material.WATER_BUCKET);
		white.setGroup("concrete");
		Bukkit.getServer().addRecipe(white);
		
		ShapelessRecipe lgray = new ShapelessRecipe(new NamespacedKey(plugin, "light_gray_concrete"), new ItemStack(Material.LIGHT_GRAY_CONCRETE, 8));
		lgray.addIngredient(8, Material.LIGHT_GRAY_CONCRETE_POWDER);
		lgray.addIngredient(Material.WATER_BUCKET);
		lgray.setGroup("concrete");
		Bukkit.getServer().addRecipe(lgray);
		
		ShapelessRecipe gray = new ShapelessRecipe(new NamespacedKey(plugin, "gray_concrete"), new ItemStack(Material.GRAY_CONCRETE, 8));
		gray.addIngredient(8, Material.GRAY_CONCRETE_POWDER);
		gray.addIngredient(Material.WATER_BUCKET);
		gray.setGroup("concrete");
		Bukkit.getServer().addRecipe(gray);
		
		ShapelessRecipe black = new ShapelessRecipe(new NamespacedKey(plugin, "black_concrete"), new ItemStack(Material.BLACK_CONCRETE, 8));
		black.addIngredient(8, Material.BLACK_CONCRETE_POWDER);
		black.addIngredient(Material.WATER_BUCKET);
		black.setGroup("concrete");
		Bukkit.getServer().addRecipe(black);
		
		ShapelessRecipe red = new ShapelessRecipe(new NamespacedKey(plugin, "red_concrete"), new ItemStack(Material.RED_CONCRETE, 8));
		red.addIngredient(8, Material.RED_CONCRETE_POWDER);
		red.addIngredient(Material.WATER_BUCKET);
		red.setGroup("concrete");
		Bukkit.getServer().addRecipe(red);
		
		ShapelessRecipe orange = new ShapelessRecipe(new NamespacedKey(plugin, "orange_concrete"), new ItemStack(Material.ORANGE_CONCRETE, 8));
		orange.addIngredient(8, Material.ORANGE_CONCRETE_POWDER);
		orange.addIngredient(Material.WATER_BUCKET);
		orange.setGroup("concrete");
		Bukkit.getServer().addRecipe(orange);
		
		ShapelessRecipe brown = new ShapelessRecipe(new NamespacedKey(plugin, "brown_concrete"), new ItemStack(Material.BROWN_CONCRETE, 8));
		brown.addIngredient(8, Material.BROWN_CONCRETE_POWDER);
		brown.addIngredient(Material.WATER_BUCKET);
		brown.setGroup("concrete");
		Bukkit.getServer().addRecipe(brown);
		
		ShapelessRecipe yellow = new ShapelessRecipe(new NamespacedKey(plugin, "yellow_concrete"), new ItemStack(Material.YELLOW_CONCRETE, 8));
		yellow.addIngredient(8, Material.YELLOW_CONCRETE_POWDER);
		yellow.addIngredient(Material.WATER_BUCKET);
		yellow.setGroup("concrete");
		Bukkit.getServer().addRecipe(yellow);
		
		ShapelessRecipe green = new ShapelessRecipe(new NamespacedKey(plugin, "green_concrete"), new ItemStack(Material.GREEN_CONCRETE, 8));
		green.addIngredient(8, Material.GREEN_CONCRETE_POWDER);
		green.addIngredient(Material.WATER_BUCKET);
		green.setGroup("concrete");
		Bukkit.getServer().addRecipe(green);
		
		ShapelessRecipe lime = new ShapelessRecipe(new NamespacedKey(plugin, "lime_concrete"), new ItemStack(Material.LIME_CONCRETE, 8));
		lime.addIngredient(8, Material.LIME_CONCRETE_POWDER);
		lime.addIngredient(Material.WATER_BUCKET);
		lime.setGroup("concrete");
		Bukkit.getServer().addRecipe(lime);
		
		ShapelessRecipe blue = new ShapelessRecipe(new NamespacedKey(plugin, "blue_concrete"), new ItemStack(Material.BLUE_CONCRETE, 8));
		blue.addIngredient(8, Material.BLUE_CONCRETE_POWDER);
		blue.addIngredient(Material.WATER_BUCKET);
		blue.setGroup("concrete");
		Bukkit.getServer().addRecipe(blue);
		
		ShapelessRecipe lblue = new ShapelessRecipe(new NamespacedKey(plugin, "light_blue_concrete"), new ItemStack(Material.LIGHT_BLUE_CONCRETE, 8));
		lblue.addIngredient(8, Material.LIGHT_BLUE_CONCRETE_POWDER);
		lblue.addIngredient(Material.WATER_BUCKET);
		lblue.setGroup("concrete");
		Bukkit.getServer().addRecipe(lblue);
		
		ShapelessRecipe purple = new ShapelessRecipe(new NamespacedKey(plugin, "purple_concrete"), new ItemStack(Material.PURPLE_CONCRETE, 8));
		purple.addIngredient(8, Material.PURPLE_CONCRETE_POWDER);
		purple.addIngredient(Material.WATER_BUCKET);
		purple.setGroup("concrete");
		Bukkit.getServer().addRecipe(purple);
		
		ShapelessRecipe magenta = new ShapelessRecipe(new NamespacedKey(plugin, "magenta_concrete"), new ItemStack(Material.MAGENTA_CONCRETE, 8));
		magenta.addIngredient(8, Material.MAGENTA_CONCRETE_POWDER);
		magenta.addIngredient(Material.WATER_BUCKET);
		magenta.setGroup("concrete");
		Bukkit.getServer().addRecipe(magenta);
		
		ShapelessRecipe pink = new ShapelessRecipe(new NamespacedKey(plugin, "pink_concrete"), new ItemStack(Material.PINK_CONCRETE, 8));
		pink.addIngredient(8, Material.PINK_CONCRETE_POWDER);
		pink.addIngredient(Material.WATER_BUCKET);
		pink.setGroup("concrete");
		Bukkit.getServer().addRecipe(pink);
	}
	
	public void mudRecipe()
	{
		ShapelessRecipe mud = new ShapelessRecipe(new NamespacedKey(plugin, "mud"), new ItemStack(Material.MUD, 8));
		mud.addIngredient(8, Material.DIRT);
		mud.addIngredient(Material.WATER_BUCKET);
		Bukkit.getServer().addRecipe(mud);
	}
}
