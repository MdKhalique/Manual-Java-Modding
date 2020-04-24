/*package com.ShiftyJumper.Mod1.init;

import java.util.function.Supplier;

import com.ShiftyJumper.Mod1.Mod1;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
@Mod.EventBusSubscriber(modid = Mod1.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD) 
@ObjectHolder(Mod1.MOD_ID)

public enum ModArmorMaterial implements IArmorMaterial
{
	TEST(Mod1.MOD_ID +":test", 5, new int[]{7,9,11,7}, 420, SoundEvents.field_226124_Y_, 6.9f, ()->{
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
	
	private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterial ) 
	{
		this.name = nameIn;
		this.maxDamageFactor = maxDamageFactorIn;
		this.damageReductionAmountArray = damageReductionAmountIn;
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
 */