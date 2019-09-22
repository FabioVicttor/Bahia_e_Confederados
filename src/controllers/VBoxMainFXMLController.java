package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class VBoxMainFXMLController {

    @FXML
    private VBox MenuVBox;

    @FXML
    private MenuBar MenuBar;

    @FXML
    private MenuItem CadastroCliente;

    @FXML
    private MenuItem CadastroFuncionario;

    @FXML
    private MenuItem CadastroCardapio;

    @FXML
    private MenuItem CadastroPedido;

    @FXML
    private MenuItem GerenciamentoCliente;

    @FXML
    private MenuItem GerenciamentoFuncionario;

    @FXML
    private MenuItem GerenciamentoCardapio;

    @FXML
    private MenuItem GerenciamentoPedido;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    void CadastrarCliente(ActionEvent event) throws IOException {
    	VBox item1 = (VBox) FXMLLoader.load(getClass().getClassLoader().getResource("views/CadastroCliente.fxml"));
    	MenuVBox.getChildren().setAll(item1);
    }
    
    @FXML
    void CadastrarFuncionario(ActionEvent event) throws IOException {
    	VBox item2 = (VBox) FXMLLoader.load(getClass().getClassLoader().getResource("views/CadastroFuncionario.fxml"));
    	MenuVBox.getChildren().setAll(item2);
    }
    
    @FXML
    void CadastrarCardapio(ActionEvent event) throws IOException {
    	VBox item3 = (VBox) FXMLLoader.load(getClass().getClassLoader().getResource("views/CadastroCardapio.fxml"));
    	MenuVBox.getChildren().setAll(item3);
    }
    

}
