package ec.edu.espe.house.view;

import java.util.Scanner;
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
 * @author  Team1
 */
public class SystemHouse {

    public static void main(String[] args) {

        boolean exit = false;
        int option;
        Scanner sc = new Scanner(System.in);
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
        while (!exit) {
            System.out.println("Welcome to the system house");
            System.out.println("What device do you want to control?");
            System.out.println("1. AlarmSignal");
            System.out.println("2. Door");
            System.out.println("3. House");
            System.out.println("4. Ligths");
            System.out.println("5. Room");
            System.out.println("6. SoundSystem");
            System.out.println("7. Task");
            System.out.println("8. Television");
            System.out.println("9. Exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Welcome, you chose the lights menu");
                    while (!exit) {
                        System.out.println("Do you want to turn the lights on? ");
                        System.out.println("1. Yes ");
                        System.out.println("2. No ");
                        System.out.println("3. Exit");
                        option = sc.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("The ligths will turn on");
                                break;
                            case 2:
                                System.out.println("The ligths will not turn on");
                                break;
                            case 3:
                                exit = true;
                                System.out.println("Successful exit");
                                break;
                        }

                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;

            }
        }
        
    }
}
