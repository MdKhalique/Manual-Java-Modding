package objects.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import util.helpers.KeyboardHelper;

public class ChaosItem extends Item {

	public ChaosItem(Properties properties) 
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
				 tooltip.add(new StringTextComponent("Causes Problems"));
			 }else {
				 tooltip.add(new StringTextComponent("HOLD"+"\u007e"+" SHIFT "+"\u00A77"+"for more infomation"));
			 }
			super.addInformation(stack, worldIn, tooltip, flagIn);
		}
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
	{
		playerIn.getPosition();
		
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

}
