/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import carreradecaballos.animaciones;
import carreradecaballos.carreraimagenesfx.Image_resources;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.*;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLDocumentController implements Initializable {

    @FXML
    Canvas canva;

    public GraphicsContext gc;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        canva.toBack();
        gc = canva.getGraphicsContext2D();
        gc.drawImage(Image_resources.caballo_estatico,0,animaciones.y_caballo1,110,82);
        gc.drawImage(Image_resources.caballo_estatico,0,animaciones.y_caballo2,110,82);
        gc.drawImage(Image_resources.caballo_estatico,0,animaciones.y_caballo3,110,82);

    }

    public void insertMasivo(ActionEvent actionEvent) {
        animaciones.comenzar_animacion(gc);
    }

    public void insertOne(ActionEvent actionEvent) {
    }

    public void insertFloat(ActionEvent actionEvent) {
    }

    public void insertString(ActionEvent actionEvent) {
    }

    public void insertInteger(ActionEvent actionEvent) {
    }

    public void borradoMasivo(ActionEvent actionEvent) {
    }

    public void modificadoMasivo(ActionEvent actionEvent) {
    }
}
