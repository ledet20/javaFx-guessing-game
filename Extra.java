import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

/*
// two buttons are created and scenes are switched out 
Label label = new Label("Welcome to the first scene!");
Button button1 = new Button("Scene 2");
button1.setOnAction(e -> window.setScene(scene2));

// layout 1 - children are laid out in vertical column 

StackPane layout = new StackPane();
layout.getChildren().addAll(label, button1);
scene1 = new Scene(layout, 400, 400);

Button button2 = new Button("Scene sucks go back");
button2.setOnAction(e -> window.setScene(scene1));

StackPane layout2 = new StackPane();
layout2.getChildren().addAll(label, button2);
scene2 = new Scene(layout2, 400, 400);




window.setScene(scene1);
window.setTitle("this is a title ");
window.show();

*/




//  button = new Button();
       // button.setText("click me");
        
        // whenever the button is called this method is called
        // look in this class and handle the code 
       /*
        button.setOnAction(new EventHandler<ActionEvent>() { 
        	@Override 
            public void handle(ActionEvent event) {
            	// checks if the event that was clicked was the item that we set
            		System.out.println("clicked");
        		}
        	});
        
        
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
       
        Scene scene = new Scene(layout, 400, 400);
		*/


 /*
        // two buttons are created and scenes are switched out 
        Label label = new Label("Welcome to the first scene!");
        Button button1 = new Button("Scene 2");
        button1.setOnAction(e -> window.setScene(scene2));
        
        // layout 1 - children are laid out in vertical column 
        
        StackPane layout = new StackPane();
        layout.getChildren().addAll(label, button1);
        scene1 = new Scene(layout, 400, 400);
        
        Button button2 = new Button("Scene sucks go back");
        button2.setOnAction(e -> window.setScene(scene1));
        
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(label, button2);
        scene2 = new Scene(layout2, 400, 400);
        
        
        
        
        window.setScene(scene1);
        window.setTitle("this is a title ");
        window.show();
        
        */


/*
 * confirmation box 
 * button = new Button("Click Me");
        button.setOnAction(e -> {
        	boolean result = ConfirmBox.display("yes", "hunty");
        	System.out.println(result);
        });
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
        
 */


/*
// multiple grid layout 
HBox topMenu = new HBox();
Button buttonA = new Button("fileA");
Button buttonB = new Button("fileb");
Button buttonC = new Button("fileC");
topMenu.getChildren().addAll(buttonA,buttonB, buttonC);


VBox leftMenu = new VBox();
Button buttonD = new Button("fileD");
Button buttonE = new Button("fileE");
Button buttonF = new Button("fileF");
leftMenu.getChildren().addAll(buttonD,buttonE, buttonF);

BorderPane borderPane = new BorderPane();
borderPane.setTop(topMenu);
borderPane.setLeft(leftMenu);

Scene scene = new Scene(borderPane, 300, 250);
window.setScene(scene);
window.show();
*/
        
public class Extra {

}
