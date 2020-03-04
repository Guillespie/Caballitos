package basesDatos.neodatis;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

public class Conexion {

    private static ODB odb;

    public static ODB connect_neodatis(){

        odb = ODBFactory.open("caballitos");

        System.out.println("NEODATIS - Conexion Abierta");

        return odb;
    }

    public static void close_neodatis(){
        odb.close();

        System.out.println("NEODATIS - Conexion Cerrado");
    }
}
