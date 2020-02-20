package basesDatos.mongoDB;

import com.mongodb.ConnectionString;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientSettings;


import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import objetos.Airport;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;


public class Conexion {

    public static MongoClient mongoClient;


    public static MongoCollection<Airport> connect_mongoDB(){

        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        //ConnectionString connString = new ConnectionString("mongodb+srv://a18andrespv:2FratUj$@cluster0-veqtr.gcp.mongodb.net/test?retryWrites=true&w=majority");
        ConnectionString connString = new ConnectionString("mongodb://localhost:27017/myproject");

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connString)
                .retryWrites(true)
                .build();


        mongoClient = new MongoClient("localhost", MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
        MongoDatabase database = mongoClient.getDatabase("Airports");

        MongoCollection<Airport> collection = database.getCollection("Airports", Airport.class);

        return collection;

    }
}
