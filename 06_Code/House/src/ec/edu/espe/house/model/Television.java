/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.house.model;

/**
 *
 * @author grupo1
 */
public class Television {
    
    private int inches;
    private String color;
    private String brand;
    private String model;
    private boolean on;

    public Television() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void turnOnTelevision() {

    }
    
    private void turnOffTelevision() {

    }

    public Television(int inches, String color, String brand, String model, boolean on) {
        this.inches = inches;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.on = on;
    }

    
    
    /**
     * @return the inches
     */
    public int getInches() {
        return inches;
    }

    /**
     * @param inches the inches to set
     */
    public void setInches(int inches) {
        this.inches = inches;
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
