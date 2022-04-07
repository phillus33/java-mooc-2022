
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int i = 1;
        int result = 1;
        
        while (i <= number) {
            result *= i;
            i++;
        }
        System.out.println("Factorial: " + result);
        
    }
}
