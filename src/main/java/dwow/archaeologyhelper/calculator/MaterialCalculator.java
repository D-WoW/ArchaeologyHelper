/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwow.archaeologyhelper.calculator;

import dwow.archaeologyhelper.collections.Artefact;
import dwow.archaeologyhelper.materials.Material;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Michael
 */
public class MaterialCalculator {

    /**
     * A Map filled with Artefacts and the quantity.
     * <Artefact, Integer> - Artefact, Quantity
     */
    private final Map<Artefact, Integer> damagedArtefacts = new HashMap();

    /**
     * The constructor for initializing MaterialCalculator objects
     */
    public MaterialCalculator() {

    }

    /**
     * Get the Map of damaged artefacts with their quantity
     * @return 
     */
    public Map<Artefact, Integer> getDamagedArtefacts() {
        return this.damagedArtefacts;
    }

    /**
     * Empty the Map of damaged artefacts
     */
    public void reset() {
        this.damagedArtefacts.clear();
    }

    /**
     * Add an Artefact to the Map of damaged artefacts along with its quantity
     * @param artefact  The damaged artefact
     * @param quantity  The quantity
     */
    public void add(Artefact artefact, int quantity) {
        this.damagedArtefacts.put(artefact, quantity);
    }

    /**
     * Add a Map of damaged artefacts with their quantity
     * @param artefacts The Map of damaged artefacts
     */
    public void addAll(Map<Artefact, Integer> artefacts) {
        this.damagedArtefacts.putAll(artefacts);
    }

    /**
     * A method to calculate how many materials you'll need in total
     * for all the damaged artefacts and their required quantities
     * within the DamagedArtefacts Map
     * @return 
     */
    public Map<Material, Integer> calculate() {
        Map<Material, Integer> matsRequired = new HashMap();

        this.damagedArtefacts.forEach((k, v) -> {
            Artefact artefact = k;
            int quantity = v;

            artefact.getMaterials().forEach((k2, v2) -> {
                Material material = k2;
                int amount = v2;
                System.out.println(String.format("Adding %d %s for %d x %s", (amount * quantity), material.getName(), quantity, artefact.getName()));
                if (matsRequired.containsKey(material)) {
                    int old = matsRequired.get(material);
                    matsRequired.put(material, old + (amount * quantity));
                } else {
                    matsRequired.put(material, amount * quantity);
                }
            });
        });

        return matsRequired;
    }
}
