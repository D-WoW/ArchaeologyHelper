/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwow.archaeologyhelper.collections;

import dwow.archaeologyhelper.materials.Material;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 *
 * @author Michael
 */
public class Artifact {
    /**
     * Information about the Artifact
     */
    private final String name;
    private final int level;
    private final double experience;
    
    /**
     * Materials required to repair the Artifact: <Material, Amount> 
     */
    private final Map<Material, Integer> materials = new TreeMap();
    
    /**
     * The constructor for initializing Artifact objects
     * @param name          The name of the Artifact
     * @param lvl           The level of the Artifact
     * @param exp           The experience the Artifact grants
     */
    public Artifact(String name, int lvl, double exp) {
        this.name = name;
        this.level = lvl;
        this.experience = exp;
    }
    
    /**
     * Get the name of the Artifact
     * @return 
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Get the level of the Artifact
     * @return 
     */
    public int getLevel() {
        return this.level;
    }
    
    /**
     * Get the experience of the Artifact
     * @return 
     */
    public double getExperience() {
        return this.experience;
    }
    
    /**
     * Get the materials required for this Artifact
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
        if (other == null || !(other instanceof Artifact)) return false;
        
        Artifact artifact = (Artifact) other;
        return (artifact.name.equals(this.name) &&
                artifact.level == this.level &&
                artifact.experience == this.experience);
    }

    /**
     * Get the hashCode for the Artifact class
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
     * Get the visual String representation for the Artifact class
     * @return 
     */
    @Override
    public String toString() {
        return this.name;
    }
}
