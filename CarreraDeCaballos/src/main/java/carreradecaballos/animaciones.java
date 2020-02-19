package carreradecaballos;


import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class animaciones {

    public static int y_caballo1 = 17;
    public static int y_caballo2 = 200;
    public static int y_caballo3 = 386;

    public static int canva_width = 732;
    public static int canva_height = 507;

    public static final int x_meta = 602;

    public static void comenzar_animacion(GraphicsContext gc){
        new AnimationTimer(){

            float x1=0;
            float x2=0;
            float x3=0;

            @Override
            public void handle(long l) {

                if((x1 > x_meta) || (x2> x_meta) || (x3> x_meta) ){
                    try {
                        ;
                    } catch (Throwable throwable) {
                        throwable.printStackTrace();
                    }
                }

                gc.setFill(Paint.valueOf("#f4f4f4"));
                gc.fillRect(0,0 , canva_width, canva_height);


                if(x1 < x_meta){
                    x1 = (float) (x1+1);
                    gc.drawImage(Image_resources.caballo_gif, x1, y_caballo1, 110, 82);
                }else{
                    gc.drawImage(Image_resources.caballo_estatico, x1, y_caballo1, 110, 82);

                }
                if(x2 < x_meta){
                    x2 = (float) (x2+0.8);
                    gc.drawImage(Image_resources.caballo_gif, x2, y_caballo2, 110, 82);
                }else{
                    gc.drawImage(Image_resources.caballo_estatico, x2, y_caballo2, 110, 82);

                }
                if(x3 < x_meta){
                    x3 = (float) (x3+0.2);
                    gc.drawImage(Image_resources.caballo_gif, x3, y_caballo3, 110, 82);
                }else{
                    gc.drawImage(Image_resources.caballo_estatico, x3, y_caballo3, 110, 82);

                }
            }

        }.start();
    }
}
