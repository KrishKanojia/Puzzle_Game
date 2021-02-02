
package Puzzle_Game;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author KRISH
 */
public class level3 extends Application {
     public static void main(String[] args) {  
	        launch(args);  
	    }   
     
     	    @Override  
	    public void start(Stage primaryStage) throws Exception { 
              
             GridPane g = new GridPane();
	       Label l1 = new Label("5");
             Label l2 = new Label("+");
             Label l3 = new Label("6");
             Label l3_1 = new Label("=");
             TextField l4 = new TextField();
             
             l1.setFont(new Font("Arial",35));
             l2.setFont(new Font("Arial",35));
             l3.setFont(new Font("Arial",35));
             l3_1.setFont(new Font("Arial",35));
             l4.setFont(new Font("New Times Roman",15));
             l4.setPrefWidth(30);
             
             g.add(l1, 0, 0);
             g.add(l2, 1, 0);
             g.add(l3, 2, 0);
             g.add(l3_1,3,0);
             g.add(l4, 4, 0);

             Label l5 = new Label("+");
             Label l6 = new Label("+");
             Label l7 = new Label("+");
        
             l5.setFont(new Font("Arial",35));
             l6.setFont(new Font("Arial",35));
             l7.setFont(new Font("Arial",35));
             g.add(l5, 0, 1);
             g.add(l6, 2, 1);
             g.add(l7,4,1);
             
             
             Label l8 = new Label("6");
             Label l9 = new Label("+");
             Label l10 = new Label("5");
             Label l11 = new Label("=");
             TextField l12 = new TextField();
             
             l8.setFont(new Font("Arial",35));
             l9.setFont(new Font("Arial",35));
             l10.setFont(new Font("Arial",35));
             l11.setFont(new Font("Arial",35));
             l12.setFont(new Font("New Times Roman",15));
             l12.setPrefWidth(30);
             
             g.add(l8, 0, 2);
             g.add(l9, 1, 2);
             g.add(l10, 2, 2);
             g.add(l11,3,2);
             g.add(l12, 4, 2);
             
             Label l13 = new Label("=");
             Label l14 = new Label("=");
             Label l15 = new Label("=");
        
             l13.setFont(new Font("Arial",35));
             l14.setFont(new Font("Arial",35));
             l15.setFont(new Font("Arial",35));
             g.add(l13, 0, 3);
             g.add(l14, 2, 3);
             g.add(l15,4,3);
             
             TextField l16 = new TextField();
             Label l17 = new Label("+");
             TextField l18 = new TextField();
             Label l19 = new Label("=");
             Label l20 = new Label("22");
             
             
             l16.setFont(new Font("New Times Roman",15));
             l16.setPrefWidth(30);
             l17.setFont(new Font("Arial",35));
             l18.setFont(new Font("New Times Roman",15));
             l18.setPrefWidth(30);
             l19.setFont(new Font("Arial",35));
             l20.setFont(new Font("Arial",35));
             
             g.add(l16, 0, 4);
             g.add(l17, 1, 4);
             g.add(l18,2,4);
             g.add(l19,3,4);
             g.add(l20,4,4);

             
             Button b1 = new Button("Next");
             
             g.add(b1,3,6);
              g.setVgap(10);
              g.setHgap(20);

        Scene s1 = new Scene(g,310,310);
        primaryStage.setScene(s1);
        primaryStage.setTitle("Level 3");
        primaryStage.show();
                b1.setOnAction(new EventHandler<ActionEvent>()
       {
           public void handle(ActionEvent event) 
           {
               

                int temp = convert(l16.getText());
               int b = convert(l18.getText());
               int c = temp + b; 

               if((isInt(l4) == false) && (isInt(l12) == false) &&  (isInt(l16) == false) &&
                       (isInt(l18) == false)  ){
                   Alert a = new Alert(Alert.AlertType.ERROR);

                   a.setContentText("You have Entered Non Numeric Value");
                   a.showAndWait();
               }
               
               else if((convert(l4.getText()) != 11) || (convert(l12.getText()) != 11) ||
                       (convert(l16.getText()) != 11) || (convert(l18.getText()) != 11) ){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                 
                   alert.setContentText("Your Answer is incorrect");
                   alert.showAndWait();
               }
               else if(l4.getText().trim().isEmpty() || (l12.getText().trim().isEmpty()) 
                       || l16.getText().trim().isEmpty()  || l18.getText().trim().isEmpty())
               {
                   Alert a = new Alert(Alert.AlertType.ERROR);
                   a.setContentText("Complete All Answers");
                   a.showAndWait();
               }
               else{
                   Alert a = new Alert(Alert.AlertType.INFORMATION);
                   a.setContentText("Level 1 Passed");
                   a.showAndWait();
                   level4 r = new level4();
                   try {
                       r.start(primaryStage);
                   } catch (Exception ex) {
                       Logger.getLogger(level1.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }   
           }
       });
        
        
            }  
	    
	      private boolean isInt(TextField message){
                  try{
                      int check = Integer.parseInt(message.getText());
                     
                      return true;
                  }catch(NumberFormatException e){
                      return false;
                  }
                        
              }
             
          private int convert(String message){
              int check = Integer.parseInt(message);
              return check;
                      
          }
    
             
}
