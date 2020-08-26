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
public enum Faction {
    /**
     * Name
     */
    AGNOSTIC("Agnostic"),
    ZAROSIAN("Zarosian"),
    ZAMORAKIAN("Zamorakian"),
    SARADOMINIST("Saradominist"),
    ARMADYLEAN("Armadylean"),
    BANDOSIAN("Bandosian");
    
    /**
     * Name of the Faction
     */
    private final String name;
    
    /**
     * A private constructor for initializing Faction objects
     * @param name          The name of the Faction
     */
    private Faction(String name) {
        this.name = name;
    }
    
    /**
     * Get the name of the Faction
     * @return 
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Get the visual String representation for the Faction enumeration
     * @return 
     */
    @Override
    public String toString() {
        return this.name;
    }
}
