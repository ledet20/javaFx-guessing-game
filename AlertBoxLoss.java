import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.application.Application;

public class AlertBoxLoss extends DisplayObject {

	public AlertBoxLoss() {

	}
	
	
	public void display(Stage endWindow, Scene orgScene) {
		
		Stage window = new Stage();

		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("YOU LOST");
		window.setMinWidth(250);

		Label label = new Label("YOU LOST ");

		Button closeButton = new Button("QUIT");
		closeButton.setOnAction(e -> { 
			window.close(); 
			endWindow.close();
			});

		Button playAgain = new Button("Play Again!");
		playAgain.setOnAction(e -> {
			window.setScene(orgScene);
			});

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(label, closeButton, playAgain);
		layout.setAlignment(Pos.CENTER);

		Scene scene = new Scene(layout, 200, 200);
		window.setScene(scene);
		// show the state and wait for it to be hidden to show the window
		window.showAndWait();
		
	}
}
