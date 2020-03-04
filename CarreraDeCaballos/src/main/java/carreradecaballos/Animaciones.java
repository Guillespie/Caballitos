package carreradecaballos;


import basesDatos.mongoDB.mongoInsert;
import com.mongodb.client.MongoCollection;
import controller.FXMLDocumentController;
import javafx.animation.AnimationTimer;
import javafx.concurrent.Task;
import javafx.scene.canvas.GraphicsContext;

import javafx.scene.paint.Paint;
import objetos.Airport;
import org.neodatis.odb.ODB;

import static basesDatos.mongoDB.Conexion.close_mongoDB;
import static basesDatos.mongoDB.Conexion.connect_mongoDB;
import static basesDatos.neodatis.Conexion.close_neodatis;
import static basesDatos.neodatis.Conexion.connect_neodatis;
import static java.lang.Thread.sleep;


public class Animaciones {

    public double porcentaje_neodatis, porcentaje_mongoDB, porcentaje_existDB;


    public double x2;

    public static int y_caballo1 = 17;
    public static int y_caballo2 = 200;
    public static int y_caballo3 = 386;

    public static int canva_width = 732;
    public static int canva_height = 507;

    public static final int x_meta = 602;

    GraphicsContext gc;

    public Animaciones(GraphicsContext gc) {
        this.gc = gc;
    }

    public void startInsert() {


        Task<Void> mongoDB_insert = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                System.out.println("MONGODB - Inicio Insert - " + System.currentTimeMillis());


                long start_time = System.currentTimeMillis();

                MongoCollection<Airport> mongoDB = connect_mongoDB();

                mongoDB.insertMany(FXMLDocumentController.airports);

                long finish_time = System.currentTimeMillis();

                System.out.println("MONGODB - Aeropuertos Insertados");
                System.out.println("MONGODB - Tiempo: " + (finish_time - start_time));

                close_mongoDB();
                return null;
            }
        };

        Task<Void> neodatis_insert = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                System.out.println("NEODATIS - Inicio Insert - " + System.currentTimeMillis());

                long start_time = System.currentTimeMillis();

                ODB odb = connect_neodatis();

                int i = 0;

                for (Airport airport : FXMLDocumentController.airports) {

                    if (i % 558 == 0) {
                        porcentaje_neodatis = ((i / Double.valueOf(FXMLDocumentController.airports.size())) * 100);
                        porcentaje_neodatis = Math.round(porcentaje_neodatis);
                        x2 = (x_meta * (porcentaje_neodatis/100));
                        //gc.drawImage(Image_resources.caballo_gif, x2, y_caballo2, 110, 82);

                    }

                    odb.store(airport);
                    i++;
                }

                close_neodatis();

                long finish_time = System.currentTimeMillis();

                System.out.println("NEODATIS - Aeropuertos Insertados");

                long elapsed_time = finish_time - start_time;
                System.out.println("NEODATIS - Tiempo: " + elapsed_time);

                return null;

            }
        };


        new Thread(mongoDB_insert).start();
        new Thread(neodatis_insert).start();

        new AnimationTimer() {

            double x1 = 0;
            double x2 = 0;
            double x3 = 0;

            @Override
            public void handle(long l) {

                if ((x1 > x_meta) || (x2 > x_meta) || (x3 > x_meta)) {
                    try {
                        ;
                    } catch (Throwable throwable) {
                        throwable.printStackTrace();
                    }
                }

                gc.setFill(Paint.valueOf("#f4f4f4"));
                gc.fillRect(0, 0, canva_width, canva_height);


                //MongoDB
                if (x1 < x_meta) {
                    x1 = (x_meta * porcentaje_mongoDB);
                    gc.drawImage(Image_resources.caballo_gif, x1, y_caballo1, 110, 82);
                } else {
                    gc.drawImage(Image_resources.caballo_estatico, x1, y_caballo1, 110, 82);

                }

                //Neodatis
                if (x2 < x_meta) {
                    x2 = (x_meta * porcentaje_neodatis/100);
                    gc.drawImage(Image_resources.caballo_gif, x2, y_caballo2, 110, 82);
                } else {
                    gc.drawImage(Image_resources.caballo_estatico, x2, y_caballo2, 110, 82);

                }

                //ExistDB
                if (x3 < x_meta) {
                    x3 = (float) (x3 + 0.2);
                    gc.drawImage(Image_resources.caballo_gif, x3, y_caballo3, 110, 82);
                } else {
                    gc.drawImage(Image_resources.caballo_estatico, x3, y_caballo3, 110, 82);

                }
            }

        }.start();
    }

    public void limpiar_canva(){
        gc.setFill(Paint.valueOf("#f4f4f4"));
        gc.fillRect(0, 0, canva_width, canva_height);
    }
}
