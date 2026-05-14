package br.edu.tds.ecommerce;

import br.edu.tds.ecommerce.App;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class TelaLoginController {
    
    
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtSenha;
    @FXML
    private Label lblusuario;
    @FXML
    private Label lblsenha;
    
    
    
    
    @FXML
    private void abrirTelaCadastroUsuario() throws IOException {
        App.setRoot("TelaCadastroUsuario");
    }
    
    @FXML
    private void realizarLogin() throws IOException{
        
        String usuario = txtUsuario.getText();
        String senha= txtSenha.getText();
        
        if(usuario.isEmpty () && senha.isEmpty()){
            lblusuario.setText("* Campo usuario e obrigatorio");
            lblsenha.setText("* Campo senha e obrigatorio");
            
            
            System.out.println("campo senha e campo usuario sao obrigatorio");
            return;
        }
        
        if(usuario.isEmpty()){
            System.out.println("campo usuario e obrigatoria");
            return;
        }
          if(senha.isEmpty()){
            lblusuario.setText("");
            
            System.out.println("campo senha e obrigatoria");
            return;
        }
        
        lblusuario.setText("");
        lblsenha.setText("");
        System.out.println("Usuario: " + usuario);
        System.out.println("Senha: " + senha);
        
        UsuarioDAO dao = new UsuarioDAO();
        boolean login = dao.login(usuario, senha);
        
        if(login){
            System.out.println("login feito");
            App.setRoot("TelaGerenciamentoUsuarios");
        
        }else{
            lblusuario.setText("Usuario/Senha incorreto(a)");
            lblsenha.setText("Usuario/Senha incorreto(a)");
            System.out.println("falha no login");
        }
        
        System.out.println("Usuario:" + usuario);
        System.out.println("Senha: " + senha);
            
        }
    }

