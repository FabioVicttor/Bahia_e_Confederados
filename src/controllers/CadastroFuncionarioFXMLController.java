package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;

public class CadastroFuncionarioFXMLController {

    @FXML
    private VBox CadastroFuncionarioVBox;
    
    @FXML
    private MenuItem CadastroCliente;
    
    @FXML
    void CadastrarCliente(ActionEvent event) throws IOException {
    	VBox menu = (VBox) FXMLLoader.load(getClass().getClassLoader().getResource("views/CadastroCliente.fxml"));
    	CadastroFuncionarioVBox.getChildren().setAll(menu);
    }

}
