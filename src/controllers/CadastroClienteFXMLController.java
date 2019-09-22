package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class CadastroClienteFXMLController {

    @FXML
    private VBox CadastroClienteVBox;

    @FXML
    private MenuItem CadastroFuncionario;

    @FXML
    private TextArea cad_cliente_nome;

    @FXML
    private TextArea cad_cliente_cpf;

    @FXML
    private TextArea cad_cliente_data;

    @FXML
    private Button CadastrarButton;

    @FXML
    void CadastrarFuncionario(ActionEvent event) throws IOException {
    	VBox menu = (VBox) FXMLLoader.load(getClass().getClassLoader().getResource("views/CadastroFuncionario.fxml"));
    	CadastroClienteVBox.getChildren().setAll(menu);
    }
    

}
