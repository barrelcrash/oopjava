/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Luke
 */
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team(String name) {
        this.name = name;
        this.maxSize = 0;
        this.players = new ArrayList<Player>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player player) {
        if (this.maxSize > 0) {
            if (this.players.size() >= this.maxSize) {
                return;
            }
        }
        this.players.add(player);
    }
    
    public void printPlayers() {
        for (Player player : this.players) {
            System.out.println(player.toString());
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return this.players.size();
    }
    
    public int goals() {
        int total = 0;
        for (Player player : this.players) {
            total += player.goals();
        }
        return total;
    }
}
