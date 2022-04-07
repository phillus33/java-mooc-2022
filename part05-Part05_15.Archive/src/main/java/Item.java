/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phili
 */
public class Item {
    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getId() {
        return this.identifier;
    }
    
    public String getName() {
        return this.name;
    }
    
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        
        if (!(other instanceof Item)) {
            return false;
        }
        
        Item otherItem = (Item) other;
        
        return this.identifier.equals(otherItem.identifier);
    }
    
    
}
