/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.house.model;

/**
 *
 * @author grupo1
 */
public class AlarmSignal {
    
    private String brand;
    private String model;
    private String typeOfSound;
    private boolean on;

    public AlarmSignal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void activateAlarmSignal() {

    }
    
    private void deactivateAlarmSignal() {

    }    

    public AlarmSignal(String brand, String model, String typeOfSound, boolean on) {
        this.brand = brand;
        this.model = model;
        this.typeOfSound = typeOfSound;
        this.on = on;
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
     * @return the typeOfSound
     */
    public String getTypeOfSound() {
        return typeOfSound;
    }

    /**
     * @param typeOfSound the typeOfSound to set
     */
    public void setTypeOfSound(String typeOfSound) {
        this.typeOfSound = typeOfSound;
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
