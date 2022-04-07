import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        this.birds.add(bird);
    }
    
    public boolean findAndAddObservation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return true;
            }
        }
        
        return false;
    }
    
    public void printAll() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public void printOne(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }
    
    
    
}
