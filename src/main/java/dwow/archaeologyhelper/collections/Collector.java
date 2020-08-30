/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwow.archaeologyhelper.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Michael
 */
public class Collector {
    
    /**
     * Name of the Collector
     */
    private final String name;
    
    /**
     * Location of the Collector
     */
    private final String location;
    
    /**
     * Collections the Collector collects
     */
    private final List<Collection> collections = new ArrayList();
    
    /**
     * The constructor for initializing Collector objects
     * @param name
     * @param location
     */
    public Collector(
            String name, 
            String location) {
        this.name = name;
        this.location = location;
    }
    
    /**
     * Get the name of the Collector
     * @return 
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Get the location of the Collector
     * @return 
     */
    public String getLocation() {
        return this.location;
    }
    
    /**
     * Get the Collections the Collector collects
     * @return 
     */
    public List<Collection> getCollections() {
        return this.collections;
    }
    
    /**
     * Add a Collection to the list of the Collector
     * Do note that this is a bidirectional relationship
     * The Collector class does both the adding of a Collection
     * and the adding of this Collector to the Collection object
     * @param collection
     */
    public void addCollection(Collection collection) {
        if (this.collections.contains(collection)) return;
                
        this.collections.add(collection);
        collection.setCollector(this);
    }
    
    /**
     * Verify if the given object is the same as the current object
     * @param other
     * @return 
     */
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || !(other instanceof Collector)) return false;
        
        Collector collector = (Collector) other;
        return (collector.name.equals(this.name) &&
                collector.location.equals(this.location));
    }

    /**
     * Get the hashCode for the Collector class
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.location);
        return hash;
    }
    
    /**
     * Get the visual String representation for the Collector class
     * @return 
     */
    @Override
    public String toString() {
        return this.name;
    }
}
