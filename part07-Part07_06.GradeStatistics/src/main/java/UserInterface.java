import java.util.Scanner;

public class UserInterface {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        StatCalculator stats = new StatCalculator();
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            stats.add(input);
        }
        
        System.out.println("Point average (all): " + stats.averageAll());
        
        if (stats.averagePassing() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + stats.averagePassing());
        }
        
        System.out.println("Pass percentage: " + stats.passPercentage());
        stats.printDistribution();
        
    }
}
