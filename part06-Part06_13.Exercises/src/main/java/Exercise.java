
public class Exercise {
    private String name;
    private boolean completed;

    public Exercise(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }
    
    public String getName() {
        return name;
    }
    
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    public boolean isCompleted() {
        return completed;
    }
}
