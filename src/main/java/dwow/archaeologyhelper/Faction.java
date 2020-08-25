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
    AGNOSTIC("Agnostic"),
    ZAROSIAN("Zarosian"),
    ZAMORAKIAN("Zamorakian"),
    SARADOMINIST("Saradominist"),
    ARMADYLEAN("Armadylean"),
    BANDOSIAN("Bandosian");
    
    private final String name;
    
    private Faction(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
