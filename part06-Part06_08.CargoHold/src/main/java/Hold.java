/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author phili
 */
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> hold;
    private int currWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
        this.currWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.currWeight + suitcase.getWeight() <= this.maxWeight) {    
            this.hold.add(suitcase);
            this.currWeight += suitcase.getWeight();
        }
    }
    
    @Override
    public String toString() {
        if (this.hold.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        
        if (this.hold.size() == 1) {
            return "1 suitcases (" + this.currWeight + " kg)";
        }
                        
        return this.hold.size() + " suitcases (" + this.currWeight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase : hold) {
            suitcase.printItems();
        }
    }
    
}
