package objects.items;

import java.util.List;

import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import util.helpers.KeyboardHelper;

public class FireItem extends Item 
{
	public FireItem (Properties properties)
	{
			super(properties);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) 
	{
		return true;
	}
	
	 @Override
		public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) 
		 {
			 if(KeyboardHelper.isHoldingShift())
			 {
				 tooltip.add(new StringTextComponent("Set fire right under you"));
			 }else {
				 tooltip.add(new StringTextComponent("HOLD"+"\u007e"+" SHIFT "+"\u00A77"+"for more infomation"));
			 }
			super.addInformation(stack, worldIn, tooltip, flagIn);
		}
	 
	 @Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) 
	 {
		 playerIn.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE,500, 15));
			playerIn.getEntityWorld().setBlockState(playerIn.getPosition().add(0, 0, 0), Blocks.FIRE.getDefaultState());
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	 
	 

}
