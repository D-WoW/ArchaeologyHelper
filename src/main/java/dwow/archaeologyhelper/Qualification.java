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
public enum Qualification {
    /**
     * Name, Prerequisite, Level, Excavations, Unique Collections, Restorations, Solved Mysteries, Research Hours
     */
    INTERN("Intern", "Archaeology Tuturial", 1, 0, 0, 0, 0, 0),
    ASSISTANT("Assistant", "Qualification - Intern", 40, 25, 1, 25, 1, 0),
    ASSOCIATE("Associate", "Qualification - Assistant", 70, 250, 5, 250, 10, 24),
    PROFESSOR("Professor", "Qualification - Associate", 90, 500, 20, 500, 15, 72),
    GUILDMASTER("Guildmaster", "Qualification - Professor", 99, 1000, 25, 1000, 20, 168);
    
    /**
     * Name of the Qualification
     */
    private final String name;
    
    /**
     * Requirements for the Qualification
     */
    private final String prerequisite; 
    private final int levelRequirement;
    private final int excavationsRequirement;
    private final int uniqueCollectionsRequirement;
    private final int restorationsRequirement;
    private final int solvedMysteriesRequirement;
    private final int researchHoursRequirement;
    
    /**
     * A private constructor for initializing Qualification objects. 
     * @param name          Name of the qualification
     * @param prerequisite  Prerequisite for obtaining the qualification
     * @param lvlReq        Required level for the qualification
     * @param excReq        Required amount of excavations for the qualification
     * @param unqReq        Required amount of unique collections completed for the qualification
     * @param restoReq      Required amount of restorations for the qualification
     * @param solvedReq     Required amount of mysteries solved for the qualification
     * @param researchReq   Required amount of research hours for the qualification
     */
    private Qualification(
            String name, 
            String prerequisite, 
            int lvlReq, 
            int excReq, 
            int unqReq, 
            int restoReq, 
            int solvedReq,
            int researchReq) {
        this.name = name;
        this.prerequisite = prerequisite;
        this.levelRequirement = lvlReq;
        this.excavationsRequirement = excReq;
        this.uniqueCollectionsRequirement = unqReq;
        this.restorationsRequirement = restoReq;
        this.solvedMysteriesRequirement = solvedReq;
        this.researchHoursRequirement = researchReq;
    }
    
    /**
     * Get the name of the Qualification
     * @return 
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Get the prerequisite for the Qualification
     * @return 
     */
    public String getPrerequisite() {
        return this.prerequisite;
    }
    
    /**
     * Get the level requirement for the Qualification
     * @return 
     */
    public int getLevelRequirement() {
        return this.levelRequirement;
    }
    
    /**
     * Get the amount of excavations required for the Qualification
     * @return 
     */
    public int getExcavationsRequirement() {
        return this.excavationsRequirement;
    }
    
    /**
     * Get the amount of unique collection required for the Qualification
     * @return 
     */
    public int getUniqueCollectionsRequirement() {
        return this.uniqueCollectionsRequirement;
    }
    
    /**
     * Get the amount of restorations required for the Qualification
     * @return 
     */
    public int getRestorationsRequirement() {
        return this.restorationsRequirement;
    }
    
    /**
     * Get the amount of solved mysteries required for the Qualification
     * @return 
     */
    public int getSolvedMysteriesRequirement() {
        return this.solvedMysteriesRequirement;
    }
    
    /**
     * Get the amount of research hours required for the Qualification
     * @return 
     */
    public int getResearchHoursRequirement() {
        return this.researchHoursRequirement;
    }
    
    /**
     * Get the visual String representation for the Qualification enumeration
     * @return 
     */
    @Override
    public String toString() {
        return this.name;
    }
}
