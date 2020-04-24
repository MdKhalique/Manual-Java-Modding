package com.ShiftyJumper.Mod1.util.helpers;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class KeyboardHelper 
{
	public static final long WINDOW = Minecraft.getInstance().getMainWindow().getHandle();
	@OnlyIn(Dist.CLIENT)
	public static boolean isHoldingShift() 
	{
		return InputMappings.isKeyDown(WINDOW,GLFW.GLFW_KEY_LEFT_SHIFT) || InputMappings.isKeyDown(WINDOW,GLFW.GLFW_KEY_RIGHT_SHIFT);
	}
	
	@OnlyIn(Dist.CLIENT)
	public static boolean isHoldingCtrl() 
	{
		return InputMappings.isKeyDown(WINDOW,GLFW.GLFW_KEY_LEFT_CONTROL) || InputMappings.isKeyDown(WINDOW,GLFW.GLFW_KEY_RIGHT_CONTROL);
	}

	public LivingEntity getEntityLiving() {
		// TODO Auto-generated method stub
		return null;
	}

}

