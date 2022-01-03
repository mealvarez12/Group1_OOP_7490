
package ec.edu.espe.house.model;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class User {
    
    private String name;
    private int age;
    private Cellphone cellphone = new Cellphone();   


    private void doTask() {

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }



    /**
     * @return the cellphone
     */
    public Cellphone getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(Cellphone cellphone) {
        this.cellphone = cellphone;
    }
    
    
}
