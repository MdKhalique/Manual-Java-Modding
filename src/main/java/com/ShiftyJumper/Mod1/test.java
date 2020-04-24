package com.ShiftyJumper.Mod1;

import com.ShiftyJumper.Mod1.init.ItemInit;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;


// this was mostly pointless
public class test {
		public test () {
		ResourceLocation testTagItem = new ResourceLocation(Mod1.MOD_ID, "testtagitem");
		Item item = ItemInit.test_item;
		boolean isInTag = ItemTags.getCollection().get(testTagItem).contains(item);//things under this line are just eh...
		if(isInTag) {
			item.setDamage(item.getDefaultInstance(), 15);
		}
	}	
}
