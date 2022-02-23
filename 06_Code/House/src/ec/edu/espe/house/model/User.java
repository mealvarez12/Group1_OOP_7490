
package ec.edu.espe.house.model;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class User {
    
    private String name;
    private String lastName;
    private int Ci;
    private int cellphone;
    private String gender;

    public User(String name, String lastName, int Ci, int cellphone, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.Ci = Ci;
        this.cellphone = cellphone;
        this.gender = gender;
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
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the Ci
     */
    public int getCi() {
        return Ci;
    }

    /**
     * @param Ci the Ci to set
     */
    public void setCi(int Ci) {
        this.Ci = Ci;
    }

    /**
     * @return the cellphone
     */
    public int getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
