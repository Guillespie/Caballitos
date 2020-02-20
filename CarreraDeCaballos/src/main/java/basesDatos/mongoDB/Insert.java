package basesDatos.mongoDB;

import com.mongodb.client.MongoCollection;
import objetos.Airport;

import java.util.ArrayList;

import static basesDatos.mongoDB.Conexion.connect_mongoDB;

public class Insert {

    public static void mongoDB_insertOne(){
        MongoCollection<Airport> mongoDB = connect_mongoDB();

        System.out.println("Aeropuerto Insertado");
    }

    public static void mongoDB_insertMany(ArrayList<Airport> aeropuertos){

        long start_time = System.currentTimeMillis();

        MongoCollection<Airport> mongoDB = connect_mongoDB();

        mongoDB.insertMany(aeropuertos);

        long finish_time = System.currentTimeMillis();

        System.out.println("Aeropuertos Insertados");
        System.out.println(finish_time - start_time);
    }
}
