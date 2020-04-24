package com.ShiftyJumper.Mod1.init;

import com.ShiftyJumper.Mod1.Mod1;
import com.ShiftyJumper.Mod1.objects.blocks.BlockQuarry;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
//import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
@ObjectHolder(Mod1.MOD_ID)
@Mod.EventBusSubscriber(modid = Mod1.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class BlockInit {
	public static final Block example_block = null;
	public static final Block poop_block = null;
	public static final Block paper_block = null;
	public static final Block porcelain_block = null;
	public static final Block sugar_block = null;
	public static final Block jade_block = null;
	public static final Block jade_ore = null;
	public static final Block cardboard = null;
	public static final Block feather_block = null;
	public static final Block cheese_block = null;
	
	public static final Block quarry = null;


	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
	
	event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(0.7f, 15.0f).sound(SoundType.SAND)).setRegistryName("example_block"));	//to see block example type in "Blocks" and hold ctrl and click on "Blocks"
	event.getRegistry().register(new Block(Block.Properties.create(Material.EARTH).hardnessAndResistance(3.0f).sound(SoundType.SLIME)).setRegistryName("poop_block"));
	event.getRegistry().register(new Block(Block.Properties.create(Material.BAMBOO_SAPLING).hardnessAndResistance(1.0f, 13.0f).sound(SoundType.SAND)).setRegistryName("paper_block"));
	event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0f, 13.0f).sound(SoundType.STONE)).setRegistryName("porcelain_block"));
	event.getRegistry().register(new Block(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(1.0f, 13.0f).sound(SoundType.SAND)).setRegistryName("sugar_block"));
	event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(1.0f, 13.0f).sound(SoundType.ANVIL)).setRegistryName("jade_block"));
	event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0f, 13.0f).sound(SoundType.ANVIL)).setRegistryName("jade_ore"));
	event.getRegistry().register(new Block(Block.Properties.create(Material.CARPET).hardnessAndResistance(1.0f, 13.0f).sound(SoundType.CLOTH)).setRegistryName("cardboard"));
	event.getRegistry().register(new Block(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(1.0f, 13.0f).sound(SoundType.CLOTH)).setRegistryName("feather_block"));
	event.getRegistry().register(new Block(Block.Properties.create(Material.TALL_PLANTS).hardnessAndResistance(1.0f, 13.0f).sound(SoundType.GROUND)).setRegistryName("cheese_block"));
	
	event.getRegistry().register(new BlockQuarry(Block.Properties.create(Material.ICE).hardnessAndResistance(100f).sound(SoundType.SNOW)).setRegistryName("quarry"));
	}

		//You have more sound options than just sand and two parenthesis after the sand, if you put a period(.) a whole set of option pop up for more changes towards blocks
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		
		event.getRegistry().register(new BlockItem(example_block, new Item.Properties().maxStackSize(420).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("example_block"));	// this one registers the block as an item while the one on top as a block
		event.getRegistry().register(new BlockItem(poop_block, new Item.Properties().maxStackSize(69).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("poop_block"));
		event.getRegistry().register(new BlockItem(paper_block, new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("paper_block"));
		event.getRegistry().register(new BlockItem(porcelain_block, new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("porcelain_block"));
		event.getRegistry().register(new BlockItem(sugar_block, new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("sugar_block"));
		event.getRegistry().register(new BlockItem(jade_block, new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("jade_block"));
		event.getRegistry().register(new BlockItem(jade_ore, new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("jade_ore"));
		event.getRegistry().register(new BlockItem(cardboard, new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("cardboard"));
		event.getRegistry().register(new BlockItem(feather_block, new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("feather_block"));
		event.getRegistry().register(new BlockItem(feather_block, new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("cheese_block"));
		
		event.getRegistry().register(new BlockQuarry);
	}//you can add another period between the parenthesis of protperties()) and make it look like properties().) and it give more options for properties. Just like I did maxstacksize
	
}
