# More Villager Professions: Vanilla
A Fabric mod that adds more villager professions for vanilla items.

---

## Professions & Workstations

| Profession     | Workstation Block | Primary Goods / Trades                                     |
|:---------------|:------------------|:-----------------------------------------------------------|
| **Lumberjack** | Stripped Oak Wood | All log types and stems                                    |
| **Beekeeper**  | Honeycomb Block   | Honey bottles, campfires, beehives, bee nests              |
| **Botanist**   | Dried Kelp Block  | Flowers, vines, dripleaf, spore blossoms, rare flora       |
| **Engineer**   | Crafter           | Redstone components, hoppers, pistons, observers, crafters |


---

## Features
* **4 New Professions:** Fully integrated into vanilla village AI and mechanics.
* **Vanilla Client Friendly:** Can run entirely server-side with vanilla clients when using a server resource pack.
* **Balanced Progression:** Structured trade tiers designed to fit seamlessly alongside vanilla economics.
* **Custom Textures:** Overlay textures for all professions.

---

## Installation

### Client (Singleplayer)
1. Install **Fabric Loader** for Minecraft **26.2** (or your target version).
2. Install **Fabric API**.
3. Place `MoreVillagerProfessions-Vanilla-1.0.0.jar` into your `.minecraft/mods` folder.

### Dedicated Server
1. Drop the `.jar` and **Fabric API** into the server's `mods/` directory.
2. Provide the companion resource pack in `server.properties` via `resource-pack=` to allow vanilla clients to see custom villager outfits without installing client mods.
3. All the logic works server side. Players don't need to install the mod on their device. However, when villager takes new job, the textures will glitch. That's why having the texture pack is important.

---

## License
This project is licensed under the MIT License. You are free to include this mod in any modpack, server, or custom distribution.