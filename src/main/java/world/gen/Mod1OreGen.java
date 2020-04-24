package world.gen;

import com.ShiftyJumper.Mod1.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class Mod1OreGen {
	public static void generateOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			if (biome == Biomes.PLAINS) {
	@SuppressWarnings("rawtypes")
	ConfiguredPlacement customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 5, 5, 25));// .func_227446_a_(new// CountRangeConfig(int// count(how common it spawns,// bottemOffset(how many blocks off the bottom),// topOffset(# of blocks off top-surface),// maximum(the hieght at which it can spawn minus the topOffset));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockInit.jade_ore.getDefaultState(), 10)).withPlacement(customConfig));
			}
		}
	}
}
