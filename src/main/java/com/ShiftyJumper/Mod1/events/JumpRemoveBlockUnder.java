package com.ShiftyJumper.Mod1.events;

import com.ShiftyJumper.Mod1.Mod1;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Mod1.MOD_ID, bus = Bus.FORGE)
public class JumpRemoveBlockUnder {
	@SubscribeEvent
	public static void jumpRemoveBlockUnder(LivingJumpEvent event)
	{
		Mod1.LOGGER.info("jumpRemoveBlockUnder fired");
		LivingEntity livingEntity = event.getEntityLiving();
		World world = livingEntity.getEntityWorld();
		world.setBlockState(livingEntity.getPosition().add(0, -1, 0),Blocks.AIR.getDefaultState());
		//add more stuff
	}

}
