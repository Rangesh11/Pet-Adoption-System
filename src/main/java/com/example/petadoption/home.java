package com.example.petadoption;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.ScrollPane;


import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;




public class home implements Initializable{

    @FXML
    private Button feed;

    public void gotofeedback() throws IOException {
        Stage stage = (Stage) feed.getScene().getWindow();
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("feedbackForm.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Sign Up");
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
