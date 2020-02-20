package basesDatos.mongoDB;

import com.mongodb.client.MongoCollection;
import objetos.Airport;

import static basesDatos.mongoDB.Conexion.connect_mongoDB;

public class Insert {

    public static void mongoDB_insertOne(){
        MongoCollection<Airport> mongoDB = connect_mongoDB();

        Airport airport = new Airport("10237EA",
                "Heliport",
                "Mamahuevo Trabaja",102,
                "Pontevedra",
                "Galicia",
                "Cangas",
                "Aldan",
                "103E",
                "GA-GZ",
                "12300, 203400");

        mongoDB.insertOne(airport);

        System.out.println("Aeropuerto Insertado");
    }
}
