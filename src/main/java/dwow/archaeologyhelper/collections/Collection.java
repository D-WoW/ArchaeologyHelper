/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwow.archaeologyhelper.collections;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Michael
 */
public class Collection {
    
    /**
     * Name of the Collection
     */
    private final String name;
    
    /**
     * Minimum level required to start this Collection
     */
    private final int minlevel;
    
    /**
     * Maximum level required to finish this Collection
     */
    private final int maxlevel;
    
    /**
     * The Collector who you deliver this Collection to
     */
    private Collector collector;
    
    /**
     * The Artefacts required to complete this Collection
     */
    private final List<Artefact> artefacts;

    /**
     * The one time reward for completing this Collection
     */
    private final String reward_once;
    
    /**
     * The repeatable reward for completing this Collection: <String, Integer>
     */
    private final Map<String, Integer> reward_always;
    
    /**
     * The constructor for initializing Collection objects
     * @param name              The name of the Collection
     * @param min               The minimum level required to start the Collection
     * @param max               The maximum level required to finish the Collection
     * @param artefacts         The Artefacts required to complete this Collection
     * @param reward_once       The one time reward for completing this Collection
     * @param reward_always     The repeatable reward for completing this collection
     */
    public Collection(
            String name, 
            int min, 
            int max, 
            List<Artefact> artefacts,
            String reward_once,
            Map<String, Integer> reward_always) {
        this.name = name;
        this.minlevel = min;
        this.maxlevel = max;
        this.artefacts = artefacts;
        this.reward_once = reward_once;
        this.reward_always = reward_always;
    }
    
    /**
     * Get the name of the Collection
     * @return 
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Get the minimum level required to start the Collection
     * @return 
     */
    public int getMinimumLevel() {
        return this.minlevel;
    }
    
    /**
     * Get the maximum level required to finish the Collection
     * @return 
     */
    public int getMaximumLevel() {
        return this.maxlevel;
    }
    
    /**
     * Get the Collector who you deliver this Collection to
     * @return 
     */
    public Collector getCollector() {
        return this.collector;
    }
    
    /**
     * Get a list of Artefacts required to finish this Collection
     * @return 
     */
    public List<Artefact> getArtefacts() {
        return this.artefacts;
    }
    
    /**
     * Get the one time reward of this Collection if there is one
     * @return 
     */
    public String getOneTimeReward() {
        return (this.reward_once == null 
                ? "There is no one time reward" 
                : this.reward_once);
    }
    
    /**
     * Get the repeatable reward of this Collection
     * @return 
     */
    public Map<String, Integer> getRepeatableReward() {
        return this.reward_always;
    }
    
    /**
     * Add a Collector to this Collection
     * Do note that this is a bidirectional relationship
     * The Collector class handles this so this method should
     * not be used otherwise
     * @param collector 
     */
    void setCollector(Collector collector) {
        this.collector = collector;
    }
    
    /**
     * Verify if the given object is the same as the current object
     * @param other
     * @return 
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || !(other instanceof Collection)) return false;
        
        Collection collection = (Collection) other;
        return (collection.name.equals(this.name) &&
                collection.collector.equals(this.collector));
    }

    /**
     * Get the hashCode for the Collection class
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.collector);
        return hash;
    }
    
    /**
     * Get the visual String representation for the Collection class
     * @return 
     */
    @Override
    public String toString() {
        return this.name;
    }
}
