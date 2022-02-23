package ec.edu.espe.house.model;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class Television extends Device {
    
    private int id;
    private String brand;
    private String model;
    private String room;
    private int size;
    private int volume;
    private boolean saveEnergy;

    public Television(int id, String brand, String model, String room, int size, int volume, boolean saveEnergy, boolean status) {
        super(status);
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.room = room;
        this.size = size;
        this.volume = volume;
        this.saveEnergy = saveEnergy;
    }

    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(String room) {
        this.room = room;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the saveEnergy
     */
    public boolean isSaveEnergy() {
        return saveEnergy;
    }

    /**
     * @param saveEnergy the saveEnergy to set
     */
    public void setSaveEnergy(boolean saveEnergy) {
        this.saveEnergy = saveEnergy;
    }
    
    
    
}
