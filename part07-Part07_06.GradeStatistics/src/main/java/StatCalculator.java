import java.util.ArrayList;

public class StatCalculator {
    
    private ArrayList<Integer> points;

    public StatCalculator() {
        this.points = new ArrayList<>();
    }
    
    public void add(int number) {
        if (number >= 0 && number < 101) {
            this.points.add(number);
        } 
    }
    
    public double averageAll() {
        int sum = 0;
        for (int entry : points) {
            sum += entry;
        }
        return 1.0 * sum / points.size();
    }
    
    public double averagePassing() {
        int sum = 0;
        int count = 0;
        for (int entry : points) {
            if (entry > 49) {
                sum += entry;
                count++;
            }
        }
        
        if (sum == 0) {
            return 0;
        }
        
        return 1.0 * sum / count;
    }
    
    public double passPercentage() {
        int count = 0;
        
        for (int entry : points) {
            if (entry > 49) {
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }
        
        return 100 * (1.0 * count / points.size());
    }
    
    public ArrayList<Integer> convertPoints() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int item : points) {
            if (item < 50) {
                list.add(0);
            }
            else if (item < 60) {
                list.add(1);
            }
            else if (item < 70) {
                list.add(2);
            }
            else if (item < 80) {
                list.add(3);
            }
            else if (item < 90) {
                list.add(4);
            }
            else {
                list.add(5);
            }
        }
        
        return list;
    }
    
    public void printDistribution() {
        ArrayList<Integer> list = convertPoints();
        
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int item : list) {
                if (item == i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
    
    
}
