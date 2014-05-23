/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boldnessexp;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author kyler_000
 */
public class BoldnessExp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       GridPane grid = new GridPane();
            
       
       grid.setAlignment(Pos.TOP_LEFT);
                grid.setHgap(5);
                grid.setVgap(5);
                grid.setPadding(new Insets(10,10,10,10));
                
               // Text scenetitle = new Text("Welcome");
                //scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
                //grid.add(scenetitle, 0, 0, 2, 1);
                
                Label userName = new Label("Enter Runnable:");
                grid.add(userName, 0, 0);
                grid.setHalignment(userName, HPos.RIGHT);
                final TextField userTextField = new TextField();
                grid.add(userTextField, 1,0,2,1);
                grid.setHalignment(userTextField, HPos.LEFT);
                Label l1 = new Label("Runnables");
                grid.add(l1, 0, 1,2,1);
                grid.setHalignment(l1, HPos.CENTER);
                Label l2 = new Label("Running Threads");
                grid.add(l2, 1, 1,2,1);
                grid.setHalignment(l2, HPos.CENTER);
                final ListView runList = new ListView();
                grid.add(runList, 0,2,1,8);
                
                ListView threadList = new ListView();
                grid.add(threadList, 2,2,1,8);
                
               
                
                Button start = new Button("Start");
                //HBox hbBtn = new HBox(10);
                grid.add(start, 0,13);
                grid.setHalignment(start, HPos.CENTER);
                Button stop = new Button("Stop");
                //HBox sBtn = new HBox(10);
                grid.add(stop,2,13);
                grid.setHalignment(stop, HPos.CENTER);
                stop.setOnAction(new EventHandler<ActionEvent>(){
                   @Override
                   public void handle(ActionEvent event){ 
                  // table.getItems().sort(null);
                   }
                });
                
               
       
       
        start.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String text = userTextField.getText();
                // need some error checking before this add to make sure we're
                // adding a valid class.
                runList.getItems().add(text);
                userTextField.clear();
                userTextField.requestFocus();
            }
        });
        
        
        Scene scene = new Scene(grid, 600, 500);
        
        primaryStage.setTitle("Glory");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
