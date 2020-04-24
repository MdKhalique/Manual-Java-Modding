package com.ShiftyJumper.Mod1.init;

import java.util.function.Supplier;

import com.ShiftyJumper.Mod1.Mod1;
import com.ShiftyJumper.Mod1.Mod1.Mod1ItemGroup;
import com.ShiftyJumper.Mod1.objects.items.ChaosItem;
import com.ShiftyJumper.Mod1.objects.items.FireItem;
import com.ShiftyJumper.Mod1.objects.items.SpecialItem;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Mod1.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD) 
@ObjectHolder(Mod1.MOD_ID)
public class ItemInit 
{
	//Items
	public static final Item example_item = null; //to add more items copy and paste this with different names
	public static final Item test_item = null;
	public static final Item test_itemsword = null;
	public static final Item test_frisbee = null;
	public static final Item special_item = null;
	public static final Item fire_item = null;
	
	
	//Tools
	public static final Item example_sword = null;
	public static final Item example_pickaxe = null;
	public static final Item example_shovel = null;
	public static final Item example_axe = null;
	public static final Item example_hoe = null;
	
	
	//Armor
	public static final Item test_helmet = null;
	public static final Item test_chestplate = null;
	public static final Item test_leggings = null;
	public static final Item test_boots = null;

	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)//20 tics = 1 second
	{	//Items
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("example_item"));//when adding more items. Copy this and change the names as well and change the group if you want
		event.getRegistry().register(new Item(new Item.Properties().group(Mod1ItemGroup.instance).food(new Food.Builder().hunger(6).saturation(1.2f).effect(new EffectInstance(Effects.ABSORPTION, 6000, 5), 0.7f).effect(new EffectInstance(Effects.HASTE, 3000, 5), 0.3f).build())).setRegistryName("test_item"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("test_itemsword"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("test_frisbee"));
		event.getRegistry().register(new SpecialItem(new Item.Properties().group(Mod1ItemGroup.instance)).setRegistryName("special_item"));
		event.getRegistry().register(new FireItem(new Item.Properties().group(Mod1ItemGroup.instance)).setRegistryName("fire_item"));
		event.getRegistry().register(new ChaosItem(new Item.Properties().group(Mod1ItemGroup.instance)).setRegistryName("chaos_item"));
		
		
		//Tools
	 event.getRegistry().register(new SwordItem(ModItemTier.EXAMPLE, 7, 5.0f, new Item.Properties().group(Mod1ItemGroup.instance)).setRegistryName("example_sword"));
	 event.getRegistry().register(new PickaxeItem(ModItemTier.EXAMPLE, 3, 5.0f, new Item.Properties().group(Mod1ItemGroup.instance)).setRegistryName("example_pickaxe"));
	 event.getRegistry().register(new ShovelItem(ModItemTier.EXAMPLE,0, 5.0f, new Item.Properties().group(Mod1ItemGroup.instance)).setRegistryName("example_shovel"));
	 event.getRegistry().register(new AxeItem( ModItemTier.EXAMPLE, 10, 2.0f, new Item.Properties().group(Mod1ItemGroup.instance)).setRegistryName("example_axe"));
	 event.getRegistry().register(new HoeItem(ModItemTier.EXAMPLE, -7.0f, new Item.Properties().group(Mod1ItemGroup.instance)).setRegistryName("example_hoe"));
											 //(tier, attackDamageIn, attackSpeedIn, builder))
	 
	 //Armor
	 event.getRegistry().register(new ArmorItem(ModArmorMaterial.TEST, EquipmentSlotType.HEAD, new Item.Properties().group(Mod1ItemGroup.instance)).setRegistryName("test_helmet"));
	 event.getRegistry().register(new ArmorItem(ModArmorMaterial.TEST, EquipmentSlotType.CHEST, new Item.Properties().group(Mod1ItemGroup.instance)).setRegistryName("test_chestplate"));
	 event.getRegistry().register(new ArmorItem(ModArmorMaterial.TEST, EquipmentSlotType.LEGS, new Item.Properties().group(Mod1ItemGroup.instance)).setRegistryName("test_leggings"));
	 event.getRegistry().register(new ArmorItem(ModArmorMaterial.TEST, EquipmentSlotType.FEET, new Item.Properties().group(Mod1ItemGroup.instance)).setRegistryName("test_boots"));

	 
	}
	
	public enum ModItemTier implements IItemTier
	{
		//(int harvestLevel, Int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial
		EXAMPLE(4, 1500, 15.0f, 7.0f, 250, () ->  {
			return Ingredient.fromItems(ItemInit.example_item);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) 
		{
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			
		return this.maxUses;	
			// TODO Auto-generated method stub
			//return 0;
		}

		@Override
		public float getEfficiency() {
			
			return this.efficiency;
			// TODO Auto-generated method stub
			//return 0;
		}

		@Override
		public float getAttackDamage() {
			
			return this.attackDamage;
			// TODO Auto-generated method stub
			//return 0;
		}

		@Override
		public int getHarvestLevel() {
			
			return this.harvestLevel;
			// TODO Auto-generated method stub
			//return 0;
		}

		@Override
		public int getEnchantability() {
			
			return this.enchantability;
			// TODO Auto-generated method stub
			//return 0;
		}

		@Override
		public Ingredient getRepairMaterial() {
			
			return this.repairMaterial.getValue();
			// TODO Auto-generated method stub
			//return null;
		}
	}
	
	public enum ModArmorMaterial implements IArmorMaterial
	{
		TEST(Mod1.MOD_ID +":test", 5, new int[] {7,9,11,7}, 420, SoundEvents.field_226124_Y_, 6.9f, ()->{
			return Ingredient.fromItems(ItemInit.test_item);
		});
		
		private static final int[] MAX_DAMAGE_ARRAY = new int[] {16,16,16,16};
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;
		
		private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionArrayIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterial ) 
		{
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmountArray = damageReductionArrayIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		
		}
		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}
		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			
			return this.damageReductionAmountArray[slotIn.getIndex()];
		}
		@Override
		public int getEnchantability() {
			// TODO Auto-generated method stub
			return this.enchantability;
		}
		@Override
		public SoundEvent getSoundEvent() {
			// TODO Auto-generated method stub
			return this.soundEvent;
		}
		@Override
		public Ingredient getRepairMaterial() {
			// TODO Auto-generated method stub
			return this.repairMaterial.getValue();
		}
		@OnlyIn(Dist.CLIENT)
		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return this.name;
		}
		@Override
		public float getToughness() {
			// TODO Auto-generated method stub
			return this.toughness;
		}
	}
}