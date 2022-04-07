
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int countEven = 0;
        int countOdd = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                System.out.println("Average: " + (1.0*sum/count));
                System.out.println("Even: " + countEven);
                System.out.println("Odd: " + countOdd);
                break;
            }
            if (number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            sum += number;
            count ++;
        }

    }
}
