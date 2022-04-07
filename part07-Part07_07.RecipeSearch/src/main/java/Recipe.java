import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time) {
        this.name = name;
        this.time = time;
        this.ingredients = new ArrayList<>();
    }
    
    public String name() {
        return this.name;
    }
    
    public int time() {
        return this.time;
    }
    
    public ArrayList<String> ingredients() {
        return this.ingredients;
    }
    
    public void add(String name) {
        this.ingredients.add(name);
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
    
    
}
