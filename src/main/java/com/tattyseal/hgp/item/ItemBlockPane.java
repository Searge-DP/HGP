package com.tattyseal.hgp.item;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockPane extends ItemBlock
{
	public ItemBlockPane(Block b)
	{
		super(b);
		setHasSubtypes(true);
		setUnlocalizedName("hgp.pane");
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) 
	{
		return super.getUnlocalizedName() + "." + stack.getItemDamage();
	}
	
	@Override
	public int getMetadata(int damage) 
	{
		return damage;
	}
	
	@Override
	public String getItemStackDisplayName(ItemStack stack) 
	{
		return new ItemStack(stack.getItemDamage() == 0 ? Blocks.glass_pane : Blocks.iron_bars, 1).getDisplayName();
	}
}