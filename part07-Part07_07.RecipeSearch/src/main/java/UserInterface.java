
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class UserInterface {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("File to read: ");
        String input = scanner.nextLine();
        RecipeList recipeList = new RecipeList();
        recipeList.readRecipe(input);

        System.out.println("Commands: ");
        System.out.println("list - list the recipes");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("stop - stops the program");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("list")) {
                recipeList.listRecipes();
            }

            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String nameToFind = scanner.nextLine();
                recipeList.findName(nameToFind);
            }
            
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maximumTime = Integer.valueOf(scanner.nextLine());
                recipeList.findCookingTime(maximumTime);
            }
            
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredientToFind = scanner.nextLine();
                recipeList.findIngredient(ingredientToFind);
            }
        }

    }
}
