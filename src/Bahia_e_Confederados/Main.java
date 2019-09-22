package Bahia_e_Confederados;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/LoginFXML.fxml"));
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.setTitle("Bahia e confederados");
		stage.setResizable(false);
		stage.show();
	}
			
	public static void main(String[] args) {
		launch(args);
	}
}
