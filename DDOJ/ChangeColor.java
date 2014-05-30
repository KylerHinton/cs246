package boldnessexp;

import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author kyler_000
 */
public class ChangeColor implements Runnable {
    @Override
   public void run(){
        
     BoldnessExp boldness = BoldnessExp.getInstance();
     Stage stage = boldness.getPrimaryStage();
     
     try{
         while(BoldnessExp.shouldBeRunning()){
         
         Platform.runLater(new Runnable() {

	@Override
	public void run() {
		stage.setTitle("Color is Changing OOOOOOOoooooo");
               // final Circle circ = new Circle(40, 40, 30);
        Group root = new Group();
                final Scene scene = new Scene(root,Color.NAVY);
                stage.setScene(scene);
                //root.getChildren().add();
                stage.show();
            }
        });     
     Thread.sleep(1500);
         }
    }catch (Exception e){
    //e.printStackTrace();
         System.out.println("Exception thrown");
    }
   
    }
}
