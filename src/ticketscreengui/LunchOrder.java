/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketscreengui;

/**
 *
 * @author Josh
 */
public class LunchOrder {
    private int ticketNumber;
    private int userID;
    private int pizza;
    private int burger;
    private int chips;
    private int lasagne;
    private int pasta;
    private int stirFry;
    private int salad;
    
    public LunchOrder(int ticketNumber, int userID, int pizza, int burger, int chips, int lasagne, int pasta, int stirFry, int salad){
        this.ticketNumber = ticketNumber;
        this.userID = userID;
        this.pizza = pizza;
        this.burger = burger;
        this.chips = chips;
        this.lasagne = lasagne;
        this.pasta = pasta;
        this.stirFry = stirFry;
        this.salad = salad;
    }
    
    public int getTicketNumber(){
        return ticketNumber;
    }
    
    public void setTicketNumber(int ticketNumber){
        this.ticketNumber = ticketNumber;
    }
    
    public int getUserID(){
        return userID;
    }
    
    public void setUserID(int userID){
        this.userID = userID;
    }
    
    public int getPizza(){
        return pizza;
    }
    
    public void setPizza(int pizza){
        this.pizza = pizza;
    }
    
    public int getBurger(){
        return burger;
    }
    
    public void setBurger(int burger){
        this.burger = burger;
    }
    
    public int getChips(){
        return chips;
    }
    
    public void setChips(int chips){
        this.chips = chips;
    }
    
    public int getLasagna(){
        return lasagne;
    }
    
    public void setLasagna(int lasagne){
        this.lasagne = lasagne;
    }
    
    public int getPasta(){
        return pasta;
    }
    
    public void setPasta(int pasta){
        this.pasta = pasta;
    }
    
    public int getStirFry(){
        return stirFry;
    }
    
    public void setStirFry(int stirFry){
        this.stirFry = stirFry;
    }
    
    public int getSalad(){
        return salad;
    }
    
    public void setSalad(int salad){
        this.salad = salad;
    }
}
