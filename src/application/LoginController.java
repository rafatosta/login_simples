package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.PasswordField;

public class LoginController {
	@FXML
	private TextField txLogin;
	@FXML
	private PasswordField txSenha;
	@FXML
	private Button btEntrar;
	@FXML
	private Button btSair;
	
	@FXML
    private void btEntrarClicked() {
		System.out.println("btEntrarClicked");
		System.out.println("Login:"+txLogin.getText());
		System.out.println("Senha:"+txSenha.getText());
		
    }
	
	@FXML
    private void btSairClicked() {
		System.out.println("btSairClicked");
    }

}
