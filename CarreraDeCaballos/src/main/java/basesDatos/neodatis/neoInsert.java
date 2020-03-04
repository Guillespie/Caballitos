package basesDatos.neodatis;

import objetos.Airport;
import org.neodatis.odb.ODB;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

import java.util.ArrayList;

import static basesDatos.neodatis.Conexion.close_neodatis;
import static basesDatos.neodatis.Conexion.connect_neodatis;

public class neoInsert extends Thread{

    private ArrayList<Airport> aeropuertos;

    public neoInsert(ArrayList<Airport> aeropuertos) {
        super();
        this.aeropuertos = aeropuertos;
    }

    public void neodatis_insert() {
    }
}