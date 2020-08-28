/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwow.archaeologyhelper.materials;

import dwow.archaeologyhelper.Faction;

/**
 *
 * @author Michael
 */
public enum Material {
    /**
     * Zarosian Materials | Name, Level, Faction, Respawn, Experience
     */
    ANCIENT_VIS("Ancient Vis", 25, Faction.ZAROSIAN),
    BLOOD_OF_ORCUS("Blood of Orcus", 58, Faction.ZAROSIAN),
    IMPERIAL_STEEL("Imperial Steel", 12, Faction.ZAROSIAN),
    TYRIAN_PURPLE("Tyrian Purple", 25, Faction.ZAROSIAN),
    ZAROSIAN_INSIGNIA("Zarosian Insignia", 5, Faction.ZAROSIAN),
    /**
     * Zamorakian Materials | Name, Level, Faction, Respawn, Experience
     */
    CADMIUM_RED("Cadmium Red", 24, Faction.ZAMORAKIAN),
    CHAOTIC_BRIMSTONE("Chaotic Brimstone", 29, Faction.ZAMORAKIAN),
    DEMONHIDE("Demonhide", 29, Faction.ZAMORAKIAN),
    EYE_OF_DAGON("Eye of Dagon", 36, Faction.ZAMORAKIAN),
    HELLFIRE_METAL("Hellfire Metal", 36, Faction.ZAMORAKIAN),
    /**
     * Saradominist Materials | Name, Level, Faction, Respawn, Experience
     */
    COBALT_BLUE("Cobalt Blue", 48, Faction.SARADOMINIST),
    EVERLIGHT_SILVTHRIL("Everlight Silvthril", 51, Faction.SARADOMINIST),
    KERAMOS("Keramos", 42, Faction.SARADOMINIST),
    STAR_OF_SARADOMIN("Star of Saradomin", 51, Faction.SARADOMINIST),
    WHITE_MARBLE("White Marble", 42, Faction.SARADOMINIST),
    /**
     * Armadylean Materials | Name, Level, Faction, Respawn, Experience
     */
    AETHERIUM_ALLOY("Aetherium Alloy", 85, Faction.ARMADYLEAN),
    ARMADYLEAN_YELLOW("Armadylean Yellow", 76, Faction.ARMADYLEAN),
    QUINTESSENCE("Quintessence", 91, Faction.ARMADYLEAN),
    STORMGUARD_STEEL("Stormguard Steel", 70, Faction.ARMADYLEAN),
    WINGS_OF_WAR("Wings of War", 70, Faction.ARMADYLEAN),
    /**
     * Bandosian Materials | Name, Level, Faction, Respawn, Experience
     */
    MALACHITE_GREEN("Malachite Green", 76, Faction.BANDOSIAN),
    MARK_OF_THE_KYZAJ("Mark of the Kyzaj", 76, Faction.BANDOSIAN),
    VULCANISED_RUBBER("Vulcanised Rubber", 76, Faction.BANDOSIAN),
    WARFORGED_BRONZE("Warforged Bronze", 76, Faction.BANDOSIAN),
    YUBIUSK_CLAY("Yu'biusk Clay", 83, Faction.BANDOSIAN),
    /**
     * Agnostic Materials | Name, Level, Faction, Respawn, Experience
     */
    ANIMAL_FURS("Animal Furs", 76, Faction.AGNOSTIC),
    FOSSILISED_BONE("Fossilised Bone", 81, Faction.AGNOSTIC),
    GOLDRUNE("Goldrune", 20, Faction.AGNOSTIC),
    LEATHER_SCRAPS("Leather Scraps", 29, Faction.AGNOSTIC),
    ORTHENGLASS("Orthenglass", 20, Faction.AGNOSTIC),
    SAMITE_SILK("Samite Silk", 12, Faction.AGNOSTIC),
    SOAPSTONE("Soapstone", 98, Faction.AGNOSTIC),
    THIRD_AGE_IRON("Third Age Iron", 5, Faction.AGNOSTIC),
    VELLUM("Vellum", 24, Faction.AGNOSTIC),
    WHITE_OAK("White Oak", 17, Faction.AGNOSTIC),
    /**
     * Other Materials | Name, Level, Faction, Respawn, Experience
     */
    SAPPHIRE("Sapphire", 0, Faction.NONE),
    EMERALD("Emerald", 0, Faction.NONE),
    RUBY("Ruby", 0, Faction.NONE),
    DIAMOND("Diamond", 0, Faction.NONE),
    DRAGONSTONE("Dragonstone", 0, Faction.NONE),
    MOLTEN_GLASS("Molten Glass", 0, Faction.NONE),
    DEATH_RUNE("Death Rune", 0, Faction.NONE),
    WHITE_CANDLE("White Candle", 0, Faction.NONE),
    BRONZE_BAR("Bronze Bar", 0, Faction.NONE),
    SILVER_BAR("Silver Bar", 0, Faction.NONE),
    CLOCKWORK("Clockwork", 0, Faction.NONE),
    PHOENIX_FEATHER("Phoenix Feather", 0, Faction.NONE),
    ROPE("Rope", 0, Faction.NONE),
    BLACK_MUSHROOM_INK("Black Mushroom Ink", 0, Faction.NONE),
    WEAPON_POISON_3("Weapon Poison (3)", 0, Faction.NONE);
    
    /**
     * Name of the Material
     */
    private final String name;
    
    /** 
     * Level of the Material
     */
    private final int level;
    
    /**
     * Faction of the Material
     */
    private final Faction faction;
    
    /**
     * A private constructor for initializing Material objects
     * @param name          The name of the Material
     * @param level         The level of the Material
     * @param faction       The faction of the Material
     * @param locations     The locations of the Material
     */
    private Material(
            String name, 
            int level, 
            Faction faction) {
        this.name = name;
        this.level = level;
        this.faction = faction;
    }
    
    /**
     * Get the name of the Material
     * @return 
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Get the level of the Material
     * @return 
     */
    public int getLevel() {
        return this.level;
    }
    
    /**
     * Get the faction of the Material
     * @return 
     */
    public Faction getFaction() {
        return this.faction;
    }
    
    /**
     * A help method to find the Material matching the String
     * @param material
     * @return 
     */
    public static Material findMaterial(String material) {
        Material found = null;
        for (Material m : Material.values()) {
            if (material.equalsIgnoreCase(m.name)) {
                found = m;
                break;
            }
        }
        return found;
    }
    
    /**
     * Get the visual String representation for the Material enumeration
     * @return 
     */
    @Override
    public String toString() {
        return this.name;
    }
}
