/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phili
 */
public class Multiplier {
    private int multiplier;
    
    public Multiplier(int multiplier) {
        this.multiplier = multiplier;
    }
    
    public int multiply(int number) {
        return this.multiplier * number;
    }
}
