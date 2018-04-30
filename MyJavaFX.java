
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.Random;

// guess a number from 1-100, if the user guesses the correct number an alert dialog will appear that 
// class 1: alert dialog 
// ---- alert dialog will ask the user if they want to play agian 
// class 2: check value of user input and return statement to guess higher or lower 
// add the return statement to a label that will update when the button is clicked 

public class MyJavaFX extends Application {

	Stage window;
	Scene scene, scene1;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("project ");

		Random rand = new Random();

		int randomValue = rand.nextInt(100) + 1;
		
		System.out.println("The random value is " + randomValue);

		CheckValue checkValue = new CheckValue(randomValue);
		AlertBox alertMessage = new AlertBox();
		RemainingAttempts numOfAttempts = new RemainingAttempts(8);
		AlertBoxLoss gameLost = new AlertBoxLoss();

		// get user value and validate it
		TextField nameInput = new TextField();
		Label label = new Label("Guess a number from 1-100");

		Label guessValue = new Label();
		Label remainingAttempts = new Label();

		button = new Button("Guess");
		button.setOnAction(e -> {

			int value = isInt(nameInput, nameInput.getText());
			String responseFromGuess = checkValue.checkUserValue(value);
			alertMessage.display(responseFromGuess, scene, window);
			guessValue.setText(responseFromGuess);
			remainingAttempts.setText("You have " + numOfAttempts.decrementAmountAvailable() + " guesses left.");
			System.out.println(responseFromGuess);
			
			if(numOfAttempts.decrementAmountAvailable() == 0) {
				gameLost.display(window, scene);
			}
		});
		
		

       
		// splash scene -->initial display 
        Label label2 = new Label("PLAY GAME");
        label2.setTranslateY(50.0);
        label2.setTranslateX(40);
        Button button1 = new Button("GO!");
        button1.setTranslateY(60);
        button1.setTranslateX(40);
        button1.setOnAction(e -> window.setScene(scene));
        
        // layout 1 - children are laid out in vertical column 
        
        VBox layout1 = new VBox();
        layout1.setSpacing(10);
        layout1.getChildren().addAll(label2, button1);
        scene1 = new Scene(layout1, 200, 200);

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(label, nameInput, button, guessValue, remainingAttempts);

		scene = new Scene(layout, 300, 250);
		window.setScene(scene1);
		window.show();

	}

	// check if the user input is a numerical value
	// throw erorr otherwise
	private int isInt(TextField input, String message) {
		try {
			int value = Integer.parseInt(input.getText());
			System.out.println("User value is " + value);
			return value;

		} catch (NumberFormatException ex) {
			System.out.println("Error: " + message + "is not a number");
			return -1;
		}

	}

}



