
package ec.edu.espe.house.model;

/**
 *
 * @author Team1
 */
public class Task {
    
    private String name;
    private String type;

    public Task(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Task() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
