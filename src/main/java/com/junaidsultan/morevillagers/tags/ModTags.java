package com.junaidsultan.morevillagers.tags;

import com.junaidsultan.morevillagers.MoreVillagers;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.trading.VillagerTrade;

public class ModTags {
    public static class Trades {
        public static final TagKey<VillagerTrade> LUMBERJACK_LEVEL_1 = createTag("lumberjack/level_1");
        public static final TagKey<VillagerTrade> LUMBERJACK_LEVEL_2 = createTag("lumberjack/level_2");
        public static final TagKey<VillagerTrade> LUMBERJACK_LEVEL_3 = createTag("lumberjack/level_3");
        public static final TagKey<VillagerTrade> LUMBERJACK_LEVEL_4 = createTag("lumberjack/level_4");
        public static final TagKey<VillagerTrade> LUMBERJACK_LEVEL_5 = createTag("lumberjack/level_5");

        public static final TagKey<VillagerTrade> ENGINEER_LEVEL_1 = createTag("engineer/level_1");
        public static final TagKey<VillagerTrade> ENGINEER_LEVEL_2 = createTag("engineer/level_2");
        public static final TagKey<VillagerTrade> ENGINEER_LEVEL_3 = createTag("engineer/level_3");
        public static final TagKey<VillagerTrade> ENGINEER_LEVEL_4 = createTag("engineer/level_4");
        public static final TagKey<VillagerTrade> ENGINEER_LEVEL_5 = createTag("engineer/level_5");

        public static final TagKey<VillagerTrade> BEEKEEPER_LEVEL_1 = createTag("beekeeper/level_1");
        public static final TagKey<VillagerTrade> BEEKEEPER_LEVEL_2 = createTag("beekeeper/level_2");
        public static final TagKey<VillagerTrade> BEEKEEPER_LEVEL_3 = createTag("beekeeper/level_3");
        public static final TagKey<VillagerTrade> BEEKEEPER_LEVEL_4 = createTag("beekeeper/level_4");
        public static final TagKey<VillagerTrade> BEEKEEPER_LEVEL_5 = createTag("beekeeper/level_5");

        public static final TagKey<VillagerTrade> BOTANIST_LEVEL_1 = createTag("botanist/level_1");
        public static final TagKey<VillagerTrade> BOTANIST_LEVEL_2 = createTag("botanist/level_2");
        public static final TagKey<VillagerTrade> BOTANIST_LEVEL_3 = createTag("botanist/level_3");
        public static final TagKey<VillagerTrade> BOTANIST_LEVEL_4 = createTag("botanist/level_4");
        public static final TagKey<VillagerTrade> BOTANIST_LEVEL_5 = createTag("botanist/level_5");

        private static TagKey<VillagerTrade> createTag(String name) {
            return TagKey.create(Registries.VILLAGER_TRADE, MoreVillagers.id(name));
        }
    }
}