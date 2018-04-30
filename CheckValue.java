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


public class CheckValue {

	private int randomValue;

	public CheckValue(int randomValue) {
		this.randomValue = randomValue;
	}

	// if the value that is passed into this function negative prompt them to try
	// again
	// return what the input text should say
	public String checkUserValue(int value) {
		if (value == -1) {
			return "Invalid input type, try again";
		}
		if (value < randomValue) {
			return "The value is too low";
		} else if (value > randomValue) {
			return "The value is too high";
		} else {
			// value is the same
			// prompt alertBox
			return "correct";
		}

	}

}
