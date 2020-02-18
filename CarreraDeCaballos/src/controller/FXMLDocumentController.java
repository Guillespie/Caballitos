/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import carreradecaballos.animaciones;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.*;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLDocumentController implements Initializable {

    @FXML
    public Canvas canva;

    public GraphicsContext gc;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        canva.toBack();
        gc = canva.getGraphicsContext2D();
        gc.drawImage(carreradecaballos.Image_resources.caballo_estatico,0,animaciones.y_caballo1,110,82);
        gc.drawImage(carreradecaballos.Image_resources.caballo_estatico,0,animaciones.y_caballo2,110,82);
        gc.drawImage(carreradecaballos.Image_resources.caballo_estatico,0,animaciones.y_caballo3,110,82);

    }

    @FXML
    public void insertMasivo(ActionEvent actionEvent) {
        animaciones.comenzar_animacion(gc);
    }

    @FXML
    public void insertOne(ActionEvent actionEvent) {
    }

    @FXML
    public void insertFloat(ActionEvent actionEvent) {
    }

    @FXML
    public void insertString(ActionEvent actionEvent) {
    }

    @FXML
    public void insertInteger(ActionEvent actionEvent) {
    }

    @FXML
    public void borradoMasivo(ActionEvent actionEvent) {
    }

    @FXML
    public void modificadoMasivo(ActionEvent actionEvent) {
    }
}
