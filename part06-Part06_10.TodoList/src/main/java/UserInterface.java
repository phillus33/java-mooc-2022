import java.util.Scanner;

public class UserInterface {
    private TodoList todolist;
    private Scanner scanner;

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todolist = todolist;
        this.scanner = scanner;
    }
    
    public void start() {
        
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            commandProcessing(input);
        }
    }
    
    public void commandProcessing(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            remove();
        }
    }
    
    public void add() {
        System.out.print("To add: ");
        String toAdd = scanner.nextLine();
        this.todolist.add(toAdd);
    }
    
    public void list() {
        this.todolist.print();
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int number = Integer.valueOf(scanner.nextLine());
        this.todolist.remove(number);
    }
}
