/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.edu.tds.ecommerce;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author aluno
 */
public class TelaGerenciamentoProdutosController implements Initializable {
  
    @FXML
    private TableView<Produto> colProdutos;
    
    @FXML
    private TableColumn<Produto , String> colNome;
    
    @FXML
    private TableColumn<Produto , String> colcategoria;
    
     @FXML
    private TableColumn<Produto , Double> colPreco;
     
      @FXML
    private TableColumn<Produto , String> colQuantidade;
      
       @FXML
    private TableColumn<Produto , String> colativo;
       
    
    
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
