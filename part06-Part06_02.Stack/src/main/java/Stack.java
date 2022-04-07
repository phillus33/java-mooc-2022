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
public class Stack {
    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if (this.list.size() > 0) {
            return false;
        }
        return true;
    }
    
    public void add(String value) {
        this.list.add(value);
    }
    
    public ArrayList<String> values() {
        return this.list;
    }
    
    public String take() {
        return this.list.remove(this.list.size()-1);
    }
    
    
    
    
    
}
