package basesDatos;

import objetos.Airport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class bigData {

    public static ArrayList<Airport> import_csv() throws IOException {

        ArrayList<Airport> airports = new ArrayList<>();


        BufferedReader csvReader = new BufferedReader(new FileReader("/home/a18andrespv/Documentos/Caballitos/CarreraDeCaballos/src/main/resources/airport-codes.csv"));

        String row;

        int i = 0;

        csvReader.readLine();

        while ((row = csvReader.readLine()) != null) {

            String[] data = row.split(",");

            if(data[3].equalsIgnoreCase("")){
                data[3] = "0";
            }

            Airport airport = new Airport(data[0], //id
                    data[1], //type
                    data[2], //name
                    Integer.valueOf(data[3]), //elevation_ft
                    data[4], //continent
                    data[5], //country
                    data[6], //region
                    data[7], //municipaly
                    data[8], //gps_code
                    data[9], //local_code
                    Double.valueOf(data[10]), //latitude
                    Double.valueOf(data[11])  //longitude
            );

            i++;
            airports.add(airport);
        }
        return airports;
    }
}
