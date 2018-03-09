/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luke
 */
public class Counter {
    private boolean check;
    private int counterValue;
    
    public Counter(int startingValue, boolean check) {
        this.counterValue = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue) {
        this.counterValue = startingValue;
        this.check = false;
    }
    
    public Counter(boolean check) {
        this.counterValue = 0;
        this.check = check;
    }
    
    public Counter() {
        this.counterValue = 0;
        this.check = false;
    }
    
    public int value() {
        return this.counterValue;
    }
    
    public void increase() {
        this.counterValue++;
    }
    
    public void decrease() {
        if (this.check) {
            if (this.counterValue == 0) {
                return;
            }
        }
        
        this.counterValue--;
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.counterValue += increaseAmount;
        }
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount >= 0) {
            int result = this.counterValue - decreaseAmount;
            
            if (this.check) {
                if (result < 0) {
                    this.counterValue = 0;
                    return;
                }
            }
            
            this.counterValue = result;
        }
    }
}
