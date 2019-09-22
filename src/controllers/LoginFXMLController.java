package controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class LoginFXMLController {

	@FXML
	private VBox MainVBox;

	@FXML
	private AnchorPane MainPanel;

	@FXML
	private TextField usuarioInput;

	@FXML
	private Button EntrarButton;

	@FXML
	private PasswordField senhaInput;

	public void EfetuarLogin() throws IOException {
		VBox menu = (VBox) FXMLLoader.load(getClass().getClassLoader().getResource("views/VBoxMainFXML.fxml"));
		MainVBox.getChildren().setAll(menu);
	}

}
