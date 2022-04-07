
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;


public class RecipeList {
    
    private ArrayList<String> ingredients;
    private ArrayList<Recipe> listOfRecipes;

    public RecipeList() {
        this.ingredients = new ArrayList<>();
        this.listOfRecipes = new ArrayList<>();
    }
    
    public void readRecipe(String filename) {
        
        try (Scanner input = new Scanner(Paths.get(filename))) {
            
            while (input.hasNextLine()) {
                String recipeName = input.nextLine();
                int cookingTime = Integer.valueOf(input.nextLine());
                Recipe recipe = new Recipe(recipeName, cookingTime);
                listOfRecipes.add(recipe);
                
                while (input.hasNextLine()) {
                    String ingredient = input.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.add(ingredient);
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    } 
    
    public void listRecipes() {
        System.out.println("Recipes: ");
        for (Recipe r : listOfRecipes) {
            System.out.println(r);
        }
    }
    
    public void findName(String nameToSearch) {
        System.out.println("Recipes: ");
        for (Recipe recipe : listOfRecipes) {
            if (recipe.name().contains(nameToSearch)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findCookingTime(int maxTime) {
        System.out.println("Recipes: ");
        for (Recipe recipe : listOfRecipes) {
            if (recipe.time() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findIngredient(String ingredient) {
            System.out.println("Recipes: ");
            for (Recipe recipe : listOfRecipes) {
                if (recipe.ingredients().contains(ingredient)) {
                    System.out.println(recipe);
                }
            }
    }
    
    
}
