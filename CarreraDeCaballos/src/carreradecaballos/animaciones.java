package carreradecaballos;


import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class animaciones {

    public static int y_caballo1 = 30;
    public static int y_caballo2 = 213;
    public static int y_caballo3 = 396;

    public static int canva_width = 732;
    public static int canva_height = 507;

    public static final int x_meta = 602;

    public static void comenzar_animacion(GraphicsContext gc){
        new AnimationTimer(){

            int x1=0;
            int x2=0;
            int x3=0;

            @Override
            public void handle(long l) {

                if(x1 > x_meta){
                    try {
                        stop();
                    } catch (Throwable throwable) {
                        throwable.printStackTrace();
                    }
                }

                // Clear the canvas
                gc.setFill(Color.WHITE);
                gc.fillRect(0,0 , canva_width, canva_height);
                // Draw next Image
                gc.drawImage(Image_resources.caballo_gif, x1, y_caballo1, 110, 82);
                gc.drawImage(Image_resources.caballo_gif, x2, y_caballo2, 110, 82);
                gc.drawImage(Image_resources.caballo_gif, x3, y_caballo3, 110, 82);

                x1++;
                x2++;
                x3++;
            }

        }.start();
    }
}
