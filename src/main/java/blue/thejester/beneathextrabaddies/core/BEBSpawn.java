package blue.thejester.beneathextrabaddies.core;

import blue.thejester.beneathextrabaddies.config.SpawnWeights;
import com.shinoow.beneath.common.world.biome.BiomeDeepDank;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.Biome;
import thebetweenlands.common.entity.mobs.*;
import twilightforest.entity.*;
import twilightforest.entity.boss.EntityTFMinoshroom;

import java.util.List;

public class BEBSpawn {

    private static void add(List<Biome.SpawnListEntry> list, Class<? extends EntityLiving> entityclassIn, int weight) {
        list.add(new Biome.SpawnListEntry(entityclassIn, weight, 1, 1));
    }

    public static void register() {
        for(Biome biome : Biome.REGISTRY) {
            if(biome instanceof BiomeDeepDank) {
                List<Biome.SpawnListEntry> list = biome.getSpawnableList(EnumCreatureType.MONSTER);
                add(list, EntityTFTowerGolem.class, SpawnWeights.weight_twilightforest_tower_golem);
                add(list, EntityTFBlockGoblin.class, SpawnWeights.weight_twilightforest_blockchain_goblin);
                add(list, EntityTFHelmetCrab.class, SpawnWeights.weight_twilightforest_helmet_crab);
                add(list, EntityTFYeti.class, SpawnWeights.weight_twilightforest_yeti);
                add(list, EntityTFSnowGuardian.class, SpawnWeights.weight_twilightforest_snow_guardian);
                add(list, EntityTFIceShooter.class, SpawnWeights.weight_twilightforest_stable_ice_core);
                add(list, EntityTFArmoredGiant.class, SpawnWeights.weight_twilightforest_armored_giant);
                add(list, EntityTFIceExploder.class, SpawnWeights.weight_twilightforest_unstable_ice_core);
                add(list, EntityTFAdherent.class, SpawnWeights.weight_twilightforest_adherent);
                add(list, EntityDarkDruid.class, SpawnWeights.weight_thebetweenlands_dark_druid);
                add(list, EntitySludge.class, SpawnWeights.weight_thebetweenlands_sludge);
                add(list, EntitySwampHag.class, SpawnWeights.weight_thebetweenlands_swamp_hag);
                add(list, EntityWight.class, SpawnWeights.weight_thebetweenlands_wight);
                add(list, EntityLurker.class, SpawnWeights.weight_thebetweenlands_lurker);
                add(list, EntityPeatMummy.class, SpawnWeights.weight_thebetweenlands_peat_mummy);
                add(list, EntityPyrad.class, SpawnWeights.weight_thebetweenlands_pyrad);
                add(list, EntityGasCloud.class, SpawnWeights.weight_thebetweenlands_gas_cloud);
                add(list, EntityChiromaw.class, SpawnWeights.weight_thebetweenlands_chiromaw);
                add(list, EntityLargeSludgeWorm.class, SpawnWeights.weight_thebetweenlands_large_sludge_worm);
                add(list, EntityShambler.class, SpawnWeights.weight_thebetweenlands_shambler);
                add(list, EntityCryptCrawler.class, SpawnWeights.weight_thebetweenlands_crypt_crawler);
                add(list, EntityBarrishee.class, SpawnWeights.weight_thebetweenlands_barrishee);
                add(list, EntityTFSkeletonDruid.class, SpawnWeights.weight_twilightforest_skeleton_druid);
                add(list, EntityTFHostileWolf.class, SpawnWeights.weight_twilightforest_hostile_wolf);
                add(list, EntityTFWraith.class, SpawnWeights.weight_twilightforest_wraith);
                add(list, EntityTFDeathTome.class, SpawnWeights.weight_twilightforest_death_tome);
                add(list, EntityTFMinotaur.class, SpawnWeights.weight_twilightforest_minotaur);
                add(list, EntityTFMinoshroom.class, SpawnWeights.weight_twilightforest_minoshroom);
                add(list, EntityTFFireBeetle.class, SpawnWeights.weight_twilightforest_fire_beetle);
                add(list, EntityTFSlimeBeetle.class, SpawnWeights.weight_twilightforest_slime_beetle);
                add(list, EntityTFPinchBeetle.class, SpawnWeights.weight_twilightforest_pinch_beetle);
                add(list, EntityTFMazeSlime.class, SpawnWeights.weight_twilightforest_maze_slime);
                add(list, EntityTFKingSpider.class, SpawnWeights.weight_twilightforest_king_spider);
                add(list, EntityTFMiniGhast.class, SpawnWeights.weight_twilightforest_mini_ghast);
                add(list, EntityTFTowerGhast.class, SpawnWeights.weight_twilightforest_tower_ghast);
            }
        }
    }
}
