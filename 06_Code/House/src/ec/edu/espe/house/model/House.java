/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.house.model;

/**
 *
 * @author group1
 */
public class House {
    
    private String color;
    private Room room = new Room(); 
    private Television television = new Television();
    private SoundSystem soundSystem = new SoundSystem();
    private AlarmSignal alarmSignal = new AlarmSignal();

    public House() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public House() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void deControled() {

    }

    public House(String color) {
        this.color = color;
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
     * @return the room
     */
    public Room getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * @return the television
     */
    public Television getTelevision() {
        return television;
    }

    /**
     * @param television the television to set
     */
    public void setTelevision(Television television) {
        this.television = television;
    }

    /**
     * @return the soundSystem
     */
    public SoundSystem getSoundSystem() {
        return soundSystem;
    }

    /**
     * @param soundSystem the soundSystem to set
     */
    public void setSoundSystem(SoundSystem soundSystem) {
        this.soundSystem = soundSystem;
    }

    /**
     * @return the alarmSignal
     */
    public AlarmSignal getAlarmSignal() {
        return alarmSignal;
    }

    /**
     * @param alarmSignal the alarmSignal to set
     */
    public void setAlarmSignal(AlarmSignal alarmSignal) {
        this.alarmSignal = alarmSignal;
    }
    
    
    
    
}
