/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.house.model;

/**
 *
 * @author grupo1
 */
public class SoundSystem {
    
    private int potencyWatts;
    private String color;
    private String brand;
    private String model;
    private boolean on;

    public SoundSystem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void turnOnSoundSystem() {

    }
    
    private void turnOffSoundSystem() {

    }

    public SoundSystem(int potencyWatts, String color, String brand, String model, boolean on) {
        this.potencyWatts = potencyWatts;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.on = on;
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
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the on
     */
    public boolean isOn() {
        return on;
    }

    /**
     * @param on the on to set
     */
    public void setOn(boolean on) {
        this.on = on;
    }
    
    
    
}
