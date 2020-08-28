/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwow.archaeologyhelper.collections;

import dwow.archaeologyhelper.Faction;
import dwow.archaeologyhelper.materials.Material;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 *
 * @author Michael
 */
public class Artefact {
    
    /**
     * Name of the Artefact
     */
    private final String name;
    
    /**
     * Faction of the Artefact
     */
    private final Faction faction;
    
    /**
     * Level of the Artefact
     */
    private final int level;
    
    /**
     * Experience of the Artefact
     */
    private final double experience;
    
    /**
     * Chronotes reward for turning in the Artefact
     */
    private final int chronotes;
    
    /**
     * Chronotes reward for donating the Artefact
     */
    private final int chronotes_donation;
    
    /**
     * Materials required to repair the Artefact: <Material, Amount> 
     */
    private final Map<Material, Integer> materials = new TreeMap();
    
    /**
     * The constructor for initializing Artifact objects
     * @param name          The name of the Artifact
     * @param faction       The faction of the Artifact
     * @param lvl           The level of the Artifact
     * @param exp           The experience the Artifact grants
     * @param chronotes     The chronotes reward for turning in the Artifact
     * @param chronotes_d   The chronotes reward for donating the Artefact
     */
    public Artefact(
            String name, 
            Faction faction, 
            int lvl, 
            double exp, 
            int chronotes,
            int chronotes_d) {
        this.name = name;
        this.faction = faction;
        this.level = lvl;
        this.experience = exp;
        this.chronotes = chronotes;
        this.chronotes_donation = chronotes_d;
    }
    
    /**
     * Get the name of the Artefact
     * @return 
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Get the level of the Artefact
     * @return 
     */
    public int getLevel() {
        return this.level;
    }
    
    /**
     * Get the experience of the Artefact
     * @return 
     */
    public double getExperience() {
        return this.experience;
    }
    
    /**
     * Get the materials required for this Artefact
     * @return 
     */
    public Map<Material, Integer> getMaterials() {
        return this.materials;
    }
    
    /**
     * Add the required material quantity to the Materials map
     * @param material
     * @param amount 
     */
    public void addMaterial(Material material, int amount) {
        this.materials.put(material, amount);
    }
    
    /**
     * Verify if the given object is the same as the current object
     * @param other
     * @return 
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || !(other instanceof Artefact)) return false;
        
        Artefact artifact = (Artefact) other;
        return (artifact.name.equals(this.name) &&
                artifact.level == this.level &&
                artifact.experience == this.experience);
    }

    /**
     * Get the hashCode for the Artefact class
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.level;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.experience) ^ (Double.doubleToLongBits(this.experience) >>> 32));
        return hash;
    }
    
    /**
     * Get the visual String representation for the Artefact class
     * @return 
     */
    @Override
    public String toString() {
        return String.format("Lvl %d - %s - %s - {%d materials}", 
                this.level, this.name, this.faction.toString(), this.materials.size());
    }
}
