/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import basesDatos.bigData;
import basesDatos.mongoDB.mongoInsert;
import basesDatos.neodatis.neoInsert;
import carreradecaballos.Image_resources;
import carreradecaballos.Animaciones;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.*;
import javafx.scene.image.ImageView;
import objetos.Airport;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

//import static basesDatos.neodatis.Insert.neodatis_insertMany;

public class FXMLDocumentController implements Initializable {

    @FXML
    public Canvas canva;

    @FXML
    public ImageView linea1,linea2,linea3;

    public GraphicsContext gc;

    public static ArrayList<Airport> airports = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            airports = bigData.import_csv();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //mongoDB_insertMany(airports);

        //neodatis_insertMany(airports);

        linea1.setImage(Image_resources.cesped);
        linea2.setImage(Image_resources.cesped);
        linea3.setImage(Image_resources.cesped);

        canva.toBack();
        gc = canva.getGraphicsContext2D();
        gc.drawImage(Image_resources.caballo_estatico,0, Animaciones.y_caballo1,110,82);
        gc.drawImage(Image_resources.caballo_estatico,0, Animaciones.y_caballo2,110,82);
        gc.drawImage(Image_resources.caballo_estatico,0, Animaciones.y_caballo3,110,82);

    }

    @FXML
    public void insertMasivo(ActionEvent actionEvent) throws InterruptedException {

        Animaciones animaciones = new Animaciones(gc);

        animaciones.startInsert();


    }

    @FXML
    public void insertOne(ActionEvent actionEvent){
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
