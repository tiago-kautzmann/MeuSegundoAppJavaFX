package com.example.meusegundoappjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label lblMensagem;

    @FXML
    private TextField textNome;

    @FXML
    protected void onButtonClicked(){
        lblMensagem.setText("Olá" + textNome.getText());
    }
}