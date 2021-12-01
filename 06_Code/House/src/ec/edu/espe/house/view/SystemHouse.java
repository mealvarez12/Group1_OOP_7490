package ec.edu.espe.house.view;

import ec.edu.espe.house.model.AlarmSignal;
import ec.edu.espe.house.model.Cellphone;
import ec.edu.espe.house.model.Door;
import ec.edu.espe.house.model.House;
import ec.edu.espe.house.model.Light;
import ec.edu.espe.house.model.Room;
import ec.edu.espe.house.model.SoundSystem;
import ec.edu.espe.house.model.Task;
import ec.edu.espe.house.model.Television;
import ec.edu.espe.house.model.User;

/**
 *
 * @author grupo1
 */
public class SystemHouse {
    
    public static void main(String[] args) {
        
        User user = new User();
        House house = new House();
        Room room = new Room();
        Light light = new Light();
        Door door = new Door(2);
        Television television = new Television();
        SoundSystem soundSystem = new SoundSystem();
        AlarmSignal alarmSignal = new AlarmSignal();
        Cellphone cellphone = new Cellphone();
        Task task = new Task();
        
        
        
    }
    
}
