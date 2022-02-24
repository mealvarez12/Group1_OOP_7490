
package ec.edu.espe.house.model;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class Light {
    
    private boolean status;

    public Light(boolean status) {
        this.status = status;
    }

    

    public void turnOnLight() {

    }
    
    
    public void turnOffLight() {

    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

}
