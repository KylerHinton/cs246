public class Boldness extends Application {
    
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
