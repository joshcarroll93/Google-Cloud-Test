/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketscreengui;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 *
 * @author Josh
 */
public class TicketScreenGUI extends Application {

   
    
    public static ResultSet orderResultSet;
    
    @Override
    public void start(Stage primaryStage) {
        
        DatabaseQuerys dbQuerys = new DatabaseQuerys();
        
        dbQuerys.retrieveBreakfastOrders();  //populates breakfastOrders
        //dbQuerys.retrieveLunchOrders(); //populates lunchOrders
        
        displayTicket();
    }
    
    public void displayTicket(){
        Label ticketScreenLabel = new Label("Ticket Screen");
        ticketScreenLabel.setStyle("-fx-font: 38 Veranda");
       
        final ListView<String> OrderListView = new ListView();
        OrderListView.setMinWidth(500);
        OrderListView.setStyle("-fx-font: 24 arial;");

        Button btn = new Button();
        btn.setText("Next Order");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                OrderListView.getItems().clear();
                try{
                    ObservableList<String> breakfastOrder = FXCollections.observableArrayList();
                    if(orderResultSet.next()){                        
                        breakfastOrder.addAll(populateBreakfastOrderList(orderResultSet));  
                        
                    }
                    
                    OrderListView.setItems(breakfastOrder);
                    
                    OrderListView.setCellFactory(new Callback<ListView<String>, ListCell<String>>(){
 
                        @Override
                        public ListCell<String> call(ListView<String> p) {
                 
                            ListCell<String> cell = new ListCell<String>(){
 
                                @Override
                                protected void updateItem(String brOrder, boolean bln) {
                                    super.updateItem(brOrder, bln);
                                        if (brOrder != null) {
                                            setText(brOrder);
                                        }
                                    }
                               };
                            return cell;
                        }
                    });
                }catch(SQLException sql){
                    sql.printStackTrace();
                }   
            }
        });
        
       
        VBox orderDisplayVbox = new VBox(15);
        orderDisplayVbox.getChildren().addAll(ticketScreenLabel, OrderListView, btn);
        orderDisplayVbox.setLayoutX(350);
        orderDisplayVbox.setLayoutY(100);
        
        Stage stage = new Stage();
        stage.setMinWidth(1250);
        stage.setMinHeight(700);
        Scene scene = new Scene(new Group());
        ((Group)scene.getRoot()).getChildren().addAll(orderDisplayVbox);
        stage.setScene(scene);
        stage.show();
    }
    public List populateBreakfastOrderList(ResultSet resultSet) throws SQLException{
        
                BreakfastOrder newBreakfastOrder = new BreakfastOrder(
                        resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getInt(3),
                        resultSet.getInt(4),
                        resultSet.getInt(5),
                        resultSet.getInt(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getInt(10)        
                );
                
                return prepareMyListOfBreakfast(newBreakfastOrder);
            
    }
    public List prepareMyListOfBreakfast(BreakfastOrder b){
        List brOrderList = new ArrayList<>();
       
        int ticketNumber = b.getTicketNumber();
        brOrderList.add("Ticket Number:             x"+ticketNumber);
        
        int userID = b.getUserID();
        brOrderList.add("User ID:                        x"+userID);
        
        if(b.getSausages() != 0){
           int sausages = b.getSausages();
           brOrderList.add("Sausage:                      x" +sausages);
        }
        if(b.getRashers() != 0){
            int Rashers = b.getRashers();
            brOrderList.add("Rasher:                         x"+Rashers);
        }
        if(b.getFriedEggs() != 0){
            int friedEggs = b.getFriedEggs();
            brOrderList.add("FriedEgg:                      x"+friedEggs);
        }
        if(b.getBoiledEggs() != 0){
            int boiledEggs = b.getBoiledEggs();
            brOrderList.add("BoiledEgg:                    x"+boiledEggs);
        }
        if(b.getBeans() != 0){
            int beans = b.getBeans();
            brOrderList.add("Beans:                          x"+beans);
        }
        if(b.getHashBrowns() != 0){
            int hashBrowns = b.getHashBrowns();
            brOrderList.add("HashBrowns:                x"+hashBrowns);
        }
        if(b.getSausageRolls() != 0){
            int sausageRolls = b.getSausageRolls();
            brOrderList.add("SausagesRolls:            x"+sausageRolls);
        }
        if(b.getPudding() != 0){
            int pudding = b.getPudding();
            brOrderList.add("Pudding:                    x"+pudding);
        }
       
       System.out.println(brOrderList.size() + brOrderList.toString());
        
       return brOrderList;
    }
    
    //////////////////////////
    
    public List populateLunchOrderList(ResultSet resultSet) throws SQLException{
        
                LunchOrder newLunchOrder = new LunchOrder(
                        resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getInt(3),
                        resultSet.getInt(4),
                        resultSet.getInt(5),
                        resultSet.getInt(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9)           
                );
                
                return prepareMyListOfLunchs(newLunchOrder);
            
    }
    public List prepareMyListOfLunchs(LunchOrder l){
        List lOrderList = new ArrayList<>();
       
        int ticketNumber = l.getTicketNumber();
        lOrderList.add("Ticket Number:   x"+ticketNumber);
        
        int userID = l.getUserID();
        lOrderList.add("User ID:   x"+userID);
        
        if(l.getPizza()!= 0){
           int pizza = l.getPizza();
           lOrderList.add("Pizza:   x" +pizza);
        }
        if(l.getBurger()!= 0){
            int burger = l.getBurger();
            lOrderList.add("Burger:    x"+burger);
        }
        if(l.getChips()!= 0){
            int chips = l.getChips();
            lOrderList.add("Chips:    x"+chips);
        }
        if(l.getLasagna()!= 0){
            int lasagna = l.getLasagna();
            lOrderList.add("Lasagna:    x"+lasagna);
        }
        if(l.getPasta()!= 0){
            int pasta = l.getPasta();
            lOrderList.add("Pasta:     x"+pasta);
        }
        if(l.getStirFry()!= 0){
            int stirFry = l.getStirFry();
            lOrderList.add("StirFry:     x"+stirFry);
        }
        if(l.getSalad()!= 0){
            int salad = l.getSalad();
            lOrderList.add("Salad:     x"+salad);
        }
        
       return lOrderList;
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
