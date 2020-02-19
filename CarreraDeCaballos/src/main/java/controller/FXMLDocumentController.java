/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import carreradecaballos.Image_resources;
import carreradecaballos.animaciones;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.*;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLDocumentController implements Initializable {

    @FXML
    public Canvas canva;

    @FXML
    public ImageView linea1,linea2,linea3;

    public GraphicsContext gc;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        linea1.setImage(Image_resources.cesped);
        linea2.setImage(Image_resources.cesped);
        linea3.setImage(Image_resources.cesped);

        canva.toBack();
        gc = canva.getGraphicsContext2D();
        gc.drawImage(Image_resources.caballo_estatico,0,animaciones.y_caballo1,110,82);
        gc.drawImage(Image_resources.caballo_estatico,0,animaciones.y_caballo2,110,82);
        gc.drawImage(Image_resources.caballo_estatico,0,animaciones.y_caballo3,110,82);

    }

    @FXML
    public void insertMasivo(ActionEvent actionEvent) {

        animaciones.comenzar_animacion(gc);
    }

    @FXML
    public void insertOne(ActionEvent actionEvent) {
        animaciones.comenzar_animacion(gc);
    }

    @FXML
    public void insertFloat(ActionEvent actionEvent) {
        animaciones.comenzar_animacion(gc);
    }

    @FXML
    public void insertString(ActionEvent actionEvent) {
        animaciones.comenzar_animacion(gc);
    }

    @FXML
    public void insertInteger(ActionEvent actionEvent) {
        animaciones.comenzar_animacion(gc);
    }

    @FXML
    public void borradoMasivo(ActionEvent actionEvent) {
        animaciones.comenzar_animacion(gc);
    }

    @FXML
    public void modificadoMasivo(ActionEvent actionEvent) {
        animaciones.comenzar_animacion(gc);
    }
}
