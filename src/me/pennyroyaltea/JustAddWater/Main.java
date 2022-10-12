package me.pennyroyaltea.JustAddWater;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin 
{
	@Override
	public void onEnable() 
	{
		Recipes rec = new Recipes(this);
		rec.concreteRecipes();
		rec.mudRecipe();
	}
	
	@Override
	public void onDisable() 
	{

	}
	
}