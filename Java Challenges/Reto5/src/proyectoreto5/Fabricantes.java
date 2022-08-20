
package proyectoreto5;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Fabricantes {
    public static void ingresarFabricantes() throws SQLException{
        String sqlFab = "INSERT INTO fabricantes VALUES (?)";
        
        PreparedStatement senFab = Principal.conectar().prepareStatement(sqlFab);
        System.out.print("Nombre Fabricante:");
        String nombre = Principal.scan.nextLine();
        senFab.setString(1, nombre);

        
        int filasIns = senFab.executeUpdate();
        if (filasIns > 0) {
            System.out.println("! Registro Exitoso !");
            System.out.println("--------------------------------------------------");
        }
        
    }

}
