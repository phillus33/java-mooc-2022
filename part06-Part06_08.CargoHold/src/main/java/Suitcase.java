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
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;
    private int currWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.currWeight = 0;
    }
    
    public int getWeight() {
        return this.currWeight;
    }

    public void addItem(Item item) {
        if (this.currWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
            this.currWeight += item.getWeight();
        }
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1) {
            return "1 item (" + this.currWeight + " kg)";
        }
                        
        return this.items.size() + " items (" + this.currWeight + " kg)";
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

}
