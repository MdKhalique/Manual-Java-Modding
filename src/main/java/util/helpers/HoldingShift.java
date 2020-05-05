package util.helpers;


import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.living.LivingEvent;

public class HoldingShift extends LivingEvent
{
	public HoldingShift(LivingEntity entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}
	public static final long WINDOW = Minecraft.getInstance().getMainWindow().getHandle();
	@OnlyIn(Dist.CLIENT)
	public static boolean isHoldingShift() 
	{
		return InputMappings.isKeyDown(WINDOW,GLFW.GLFW_KEY_LEFT_SHIFT) || InputMappings.isKeyDown(WINDOW,GLFW.GLFW_KEY_RIGHT_SHIFT);
	}
	public LivingEntity getEntityLiving() {
		return getEntityLiving();
	}
}
