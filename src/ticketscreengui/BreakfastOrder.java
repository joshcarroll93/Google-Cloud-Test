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
public class BreakfastOrder {
    private int ticketNumber;
    private int userID;
    private int sausages;
    private int rashers;
    private int friedEggs;
    private int boiledEggs;
    private int beans;
    private int hashBrowns;
    private int sausageRolls;
    private int pudding;
    
    public BreakfastOrder(int ticketNumber,int userID, int sausages, int rashers, int friedEggs, int boiledEggs, int beans, int hashBrowns, int sausageRolls, int pudding){
        this.ticketNumber = ticketNumber;
        this.userID = userID;
        this.sausages = sausages;
        this.rashers = rashers;
        this.friedEggs = friedEggs;
        this.boiledEggs = boiledEggs;
        this.beans = beans;
        this.hashBrowns = hashBrowns;
        this.sausageRolls = sausageRolls;
        this.pudding = pudding;
    }
    
    public int getTicketNumber(){
        return ticketNumber;
    }
    
    public void setTicketNumber(int ticketNumber){
        this.ticketNumber = ticketNumber;
    }
     public int getUserID() {
         return userID;
    }
 
    public void setUserID(int userID) {
         this.userID = userID;
    }
    
    public int getSausages(){
        return sausages;
    }
    
    public void setSausages(int sausages){
        this.sausages = sausages;
    }
    
    public int getRashers(){
        return rashers;
    }
    
    public void setRashers(int rashers){
        this.rashers = rashers;
    }
    
    public int getFriedEggs(){
        return friedEggs;
    }
    
    public void setFriedEggs(int friedEggs){
        this.friedEggs = friedEggs;
    }
    
    public int getBoiledEggs(){
        return boiledEggs;
    }
    
    public void setBoiledEggs(int boiledEggs){
        this.boiledEggs = boiledEggs;
    }
    
    public int getBeans(){
        return beans;
    }
    
    public void setBeans(int beans){
        this.beans = beans;
    }
    
    public int getHashBrowns(){
        return hashBrowns;
    }
    
    public void setHashBrowns(int hashBrowns){
        this.hashBrowns = hashBrowns;
    }
    
    public int getSausageRolls(){
        return sausageRolls;
    }
    
    public void setSausageRolls(int sausageRolls){
        this.sausageRolls = sausageRolls;
    }
    
    public int getPudding(){
        return pudding;
    }
    
    public void setPudding(int pudding){
        this.pudding = pudding;
    }
}
