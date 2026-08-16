package com.junaidsultan.morevillagers.villager;

import com.google.common.collect.ImmutableSet;
import com.junaidsultan.morevillagers.MoreVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PoiHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.villager.VillagerProfession;
import net.minecraft.world.item.trading.TradeSet;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class ModVillagers {
    public static final ResourceKey<PoiType> LUMBERJACK_POI_KEY = createPoiKey("lumberjack_poi");
    public static final PoiType LUMBERJACK_POI = registerPoi("lumberjack_poi", Blocks.STRIPPED_SPRUCE_LOG);

    public static final VillagerProfession LUMBERJACK = registerVillagerProfession(
            "lumberjack",
            "Lumberjack",
            LUMBERJACK_POI_KEY,
            SoundEvents.AXE_STRIP,
            createTradeSetMap("lumberjack", 5)
    );


    public static final ResourceKey<PoiType> ENGINEER_POI_KEY = createPoiKey("engineer_poi");
    public static final PoiType ENGINEER_POI = registerPoi("engineer_poi", Blocks.CRAFTER);

    public static final VillagerProfession ENGINEER = registerVillagerProfession(
            "engineer",
            "Engineer",
            ENGINEER_POI_KEY,
            SoundEvents.AXE_WAX_OFF,
            createTradeSetMap("engineer", 5)
    );


    public static final ResourceKey<PoiType> BOTANIST_POI_KEY = createPoiKey("botanist_poi");
    public static final PoiType BOTANIST_POI = registerPoi("botanist_poi", Blocks.DRIED_KELP_BLOCK);

    public static final VillagerProfession FLORIST = registerVillagerProfession(
            "botanist",
            "Botanist",
            BOTANIST_POI_KEY,
            SoundEvents.BONE_MEAL_USE,
            createTradeSetMap("botanist", 5)
    );


    public static final ResourceKey<PoiType> BEEKEEPER_POI_KEY = createPoiKey("beekeeper_poi");
    public static final PoiType BEEKEEPER_POI = registerPoi("beekeeper_poi", Blocks.HONEYCOMB_BLOCK);

    public static final VillagerProfession BEEKEEPER = registerVillagerProfession(
            "beekeeper",
            "Beekeeper",
            BEEKEEPER_POI_KEY,
            SoundEvents.HONEY_BLOCK_PLACE,
            createTradeSetMap("beekeeper", 5)
    );





    //##################################################################

    private static ResourceKey<PoiType> createPoiKey(String name) {
        return ResourceKey.create(Registries.POINT_OF_INTEREST_TYPE, MoreVillagers.id(name));
    }

    private static PoiType registerPoi (String name, Block block) {
        return PoiHelper.register(MoreVillagers.id(name), 1, 1, block);
    }

    private static ResourceKey<TradeSet> createTradeSetKey(String path) {
        return ResourceKey.create(Registries.TRADE_SET, MoreVillagers.id(path));
    }

    private static Int2ObjectMap<ResourceKey<TradeSet>> createTradeSetMap(String professionName, int maxLevel) {
        Int2ObjectMap<ResourceKey<TradeSet>> map = new Int2ObjectOpenHashMap<>();
        for (int level = 1; level <= maxLevel; level++) {
            map.put(level, createTradeSetKey(professionName + "/level_" + level));
        }

        return map;
    }


    private static VillagerProfession registerVillagerProfession(
            String name,
            String title,
            ResourceKey<PoiType> poi,
            SoundEvent sound,
            Int2ObjectMap<ResourceKey<TradeSet>> map
    ) {
        return Registry.register(
                BuiltInRegistries.VILLAGER_PROFESSION,
                Identifier.fromNamespaceAndPath(MoreVillagers.MOD_ID, name),
                new VillagerProfession(
                        Component.literal(title),
                        holder -> holder.is(poi),
                        holder -> holder.is(poi),
                        ImmutableSet.of(),
                        ImmutableSet.of(),
                        sound,
                        map
                )
        );
    }


    public static void register() {
        MoreVillagers.LOGGER.info("Registering ModVillagers for " + MoreVillagers.MOD_ID);
    }
}
