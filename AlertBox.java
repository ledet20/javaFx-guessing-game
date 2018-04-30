
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class AlertBox extends DisplayObject {
	

	public AlertBox() {

	}

	
	public void display(String message, Scene orgScene, Stage endWindow) {

		if (message.equals("correct")) {
			Stage window = new Stage();

			window.initModality(Modality.APPLICATION_MODAL);
			window.setTitle("CONGRATS!!!");
			window.setMinWidth(250);

			Label label = new Label("Congrats You Guessed Correctly ");

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
	
}
