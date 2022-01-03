
package ec.edu.espe.house.model;

import java.util.ArrayList;



/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class Light {
    
    private String color;
    private int potencyWatts;
    private boolean on;
    private final boolean open;


    private void turnOnLight() {

    }
    
    private void turnOffLight() {

    }

    ArrayList<Light> lights = new  ArrayList<>();
    
 
    
        public Light(String color, int potencyWatts, boolean on, boolean open) {
        this.color = color;
        this.potencyWatts = potencyWatts;
        this.on = on;
        this.open = open;
    }

    
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the potencyWatts
     */
    public int getPotencyWatts() {
        return potencyWatts;
    }

    /**
     * @param potencyWatts the potencyWatts to set
     */
    public void setPotencyWatts(int potencyWatts) {
        this.potencyWatts = potencyWatts;
    }
    
        /**
     * @return the open
     */
    public boolean isOn() {
        return on;
    }

    /**
     * @param on the open to set
     */
    public void setOn(boolean on) {
        this.on = on;
    }
    
    
    
}
