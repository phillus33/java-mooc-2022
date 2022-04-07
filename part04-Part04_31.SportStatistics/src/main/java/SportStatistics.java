
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File: ");
        String fileName = scanner.nextLine();
        System.out.println("Team: ");
        String teamName = scanner.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            int games = 0;
            int wins = 0;
            int losses = 0;
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                
                if (parts[0].equals(teamName) && Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                    wins++;
                }
                if (parts[0].equals(teamName) && Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])) {
                    losses++;
                }
                
                if (parts[1].equals(teamName) && Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                    losses++;
                }
                if (parts[1].equals(teamName) && Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])) {
                    wins++;
                }
                if (line.contains(teamName)) {
                    games++;
                }
            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }

}
