package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.event.ActionEvent;
import javafx.scene.canvas.*;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;


import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;


public class MainController implements Initializable {

    @FXML
    private Canvas caballo;

    public GraphicsContext gc;

    private Image caballo_gif = new Image("file:/home/a18andrespv/IdeaProjects/pruebaAnimacion/img/horse.gif");
    private Image caballo_estatico = new Image("file:/home/a18andrespv/IdeaProjects/pruebaAnimacion/img/horse-static.png");

    @Override
    public void initialize(URL location, ResourceBundle resources){
         gc = caballo.getGraphicsContext2D();
        gc.drawImage(caballo_estatico, 0, 120, 110,82);


    }

    @FXML
    private void accion(ActionEvent event) throws InterruptedException {

        GraphicsContext gc = caballo.getGraphicsContext2D();

        new AnimationTimer() //use AnimationTimer to continue the game loop
        {
            double x = 0;
            double y = 0;

            double x_1 = 0;
            double y_2 = 0;

            public void handle(long currentNanoTime)
            {
                if (x_1 > 650)
                    x_1 = -20;
                // Clear the canvas
                gc.setFill( Color.WHITE );
                gc.fillRect(0,0, 650, 200);

                // Draw next image
                gc.drawImage(caballo_gif, x_1, 120, 110,82);


                x_1 += 0.7;
            }
        }.start();

        //int i = 0;
        //while(i < 2){

        //    gc.setFill( Color.WHITE );
         //   gc.fillRect(0,0, 650, 200);

           // gc.drawImage(caballo_gif, 0,0);
            //i++;
        //}

    }

    public void adelante() throws InterruptedException {

        }
}
