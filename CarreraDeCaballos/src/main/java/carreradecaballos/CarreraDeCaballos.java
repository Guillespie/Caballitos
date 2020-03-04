
package carreradecaballos;

import java.io.IOException;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.LoggerFactory;


public class CarreraDeCaballos extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {

        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        Logger rootLogger = loggerContext.getLogger("org.mongodb.driver");
        rootLogger.setLevel(Level.OFF);

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Caballos.fxml"));
        Scene scene = new Scene(root);

        
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
