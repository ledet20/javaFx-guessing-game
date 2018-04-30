
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

// two buttons to confirm and action and tack you back to the main program 
public class ConfirmBox {
	
	// variable to store our answer 
	
	static boolean answer;
	
	public static boolean display(String title, String message) {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		Label label = new Label();
		label.setText(message);
		
		Button yesButton = new Button("yes");
		Button noButton = new Button("no");
		
		yesButton.setOnAction(e -> {
			answer = true;
			window.close();
		});
		
		noButton.setOnAction(e -> {
			answer = false;
			window.close();
		});
		
		
		StackPane layout = new StackPane();
		layout.getChildren().addAll(label, yesButton, noButton);
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout, 200, 200);
		window.setScene(scene);
		// show the state and wait for it to be hidden to show the window 
		window.showAndWait();
		
		
		return answer; 
		
	}

}
