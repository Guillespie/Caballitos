package basesDatos.mongoDB;

import com.mongodb.client.MongoCollection;
import objetos.Airport;

import java.util.ArrayList;
import java.util.List;

import static basesDatos.mongoDB.Conexion.connect_mongoDB;
import static basesDatos.mongoDB.Conexion.close_mongoDB;

public class mongoInsert{

    private ArrayList<Airport> aeropuertos;

    public mongoInsert(ArrayList<Airport> aeropuertos) {
        super();
        this.aeropuertos = aeropuertos;
    }

    public static void mongoDB_insertOne(){
        MongoCollection<Airport> mongoDB = connect_mongoDB();

        System.out.println("Aeropuerto Insertado");
    }

    public static void insert(ArrayList<Airport> aeropuertos){


    }
}
