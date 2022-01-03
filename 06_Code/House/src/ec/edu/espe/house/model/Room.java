
package ec.edu.espe.house.model;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class Room {
    
    private String size;
    private String color;
    private int numberOfRoom;

    
    private void hasDoor() {

    }
        
    private void hasLight() {

    }

    public Room(String size, String color, int numberOfRoom) {
        this.size = size;
        this.color = color;
        this.numberOfRoom = numberOfRoom;
    }

    
    
    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
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
     * @return the numberOfRoom
     */
    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    /**
     * @param numberOfRoom the numberOfRoom to set
     */
    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

}
