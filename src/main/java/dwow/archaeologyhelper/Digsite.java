/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwow.archaeologyhelper;

/**
 *
 * @author Michael
 */
public enum Digsite {
    /**
     * Name, Location, Manager, Faction, Level, Qualification
     */
    KHARID_ET("Kharid-Et", "East of Al Kharid", "Dr. Nabanik", Faction.ZAROSIAN, 5, Qualification.INTERN),
    INFERNAL_SOURCE("Infernal Source", "South-west of Varrock", "Movario", Faction.ZAMORAKIAN, 0, Qualification.INTERN),
    EVERLIGHT("Everlight", "Far south of Port Phasmatys", "Vanescula Drakan", Faction.SARADOMINIST, 0, Qualification.INTERN),
    STORMGUARD_CITADEL("Stormguard Citadel", "Temple of Ikov", "Gee'ka", Faction.ARMADYLEAN, 70, Qualification.ASSISTANT),
    WARFORGE("Warforge", "West of Oo'glog", "Zanik", Faction.BANDOSIAN, 76, Qualification.INTERN);
    
    /**
     * Information about the Digsite
     */
    private final String name;
    private final String location;
    private final String manager;
    private final Faction faction;
    private final int minimumLevel;
    private final Qualification minimumQualification;
    
    /**
     * A private constructor for initializing Digsite objects
     * @param name              The name of the Digsite
     * @param location          The location of the Digsite
     * @param manager           The manager of the Digsite
     * @param faction           The faction of the Digsite
     * @param minLvl            The minimum level for the Digsite
     * @param minQlfc           The minimum qualification for the Digsite
     */
    private Digsite(
            String name, 
            String location, 
            String manager, 
            Faction faction, 
            int minLvl, 
            Qualification minQlfc) {
        this.name = name;
        this.location = location;
        this.manager = manager;
        this.faction = faction;
        this.minimumLevel = minLvl;
        this.minimumQualification = minQlfc;
    }
    
    /**
     * Get the name of the Digsite
     * @return 
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Get the location of the Digsite
     * @return 
     */
    public String getLocation() {
        return this.location;
    }
    
    /**
     * Get the manager of the Digsite
     * @return 
     */
    public String getManager() {
        return this.manager;
    }
    
    /**
     * Get the faction of the Digsite
     * @return 
     */
    public Faction getFaction() {
        return this.getFaction();
    }
    
    /**
     * Get the minimum level required for the Digsite
     * @return 
     */
    public int getMinimumLevel() {
        return this.minimumLevel;
    }
    
    /**
     * Get the minimum qualification required for the Digsite
     * @return 
     */
    public Qualification getMinimumQualification() {
        return this.minimumQualification;
    }
    
    /**
     * Get the visual String representation for the Digsite enumeration
     * @return 
     */
    @Override
    public String toString() {
        return this.name;
    }
}
