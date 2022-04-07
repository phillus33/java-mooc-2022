
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        BirdDatabase birds = new BirdDatabase();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();

                birds.addBird(name, latinName);
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String observation = scanner.nextLine();
                
                Boolean observationResult = birds.findAndAddObservation(observation);
                if (!(observationResult)) {
                    System.out.println("Not a bird!");
                }
                /*if (birds.findAndAddObservation(observation) == false) {
                    System.out.println("Not a bird!");
                } else {
                    birds.findAndAddObservation(observation);
                }*/
            }

            if (command.equals("All")) {
                birds.printAll();
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String oneBird = scanner.nextLine();
                birds.printOne(oneBird);
            }

            if (command.equals("Quit")) {
                break;
            }
        }
    }

}
