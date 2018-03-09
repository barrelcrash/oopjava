/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luke
 */
public class LyyraCard {
    private double balance;
    
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical() {
        double cost = 2.5;
        if (this.balance - cost >= 0) {
            this.balance -= cost;
        }
    }
    
    public void payGourmet() {
        double cost = 4;
        if (this.balance - cost >= 0) {
            this.balance -= cost;
        }
    }
    
    public void loadMoney(double amount) {
        if (amount >= 0) {
            if (this.balance + amount > 150) {
                this.balance = 150;
            } else {
                this.balance += amount;
            }
        }
    }
}
