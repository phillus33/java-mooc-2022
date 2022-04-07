/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author phili
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            processCommand(input);
        }
        
        System.out.println("Bye bye!");
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {

        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();

        this.dict.add(word, translation);

    }

    public void search() {

        System.out.print("To be translated: ");
        String searched = this.scanner.nextLine();

        if (this.dict.translate(searched) == null) {
            System.out.println("Word " + searched + " was not found");
        } else {
            System.out.println("Translation: " + this.dict.translate(searched));
        }
    }

}
