

package proyectoreto5;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Motocicletas {
    public static void ingresarMotocicletas() throws SQLException {
        String sql = "INSERT INTO motocicletas VALUES (?,?,?,?,?)";
        PreparedStatement sentencia = Principal.conectar().prepareStatement(sql);
        
        System.out.print("ID:");
        int id = Principal.scan.nextInt();
        sentencia.setInt(1, id);
        Principal.scan.nextLine();

        System.out.print("Fabricante:");
        String nombre = Principal.scan.nextLine();
        sentencia.setString(2, nombre);

        System.out.print("Precio:");
        int precio = Principal.scan.nextInt();
        sentencia.setInt(3, precio);
        Principal.scan.nextLine();

        System.out.print("Autonomia:");
        int autonomia = Principal.scan.nextInt();
        sentencia.setInt(4, autonomia);
        Principal.scan.nextLine();
        
        System.out.print("ID Proveedor:");
        int idProv = Principal.scan.nextInt();
        sentencia.setInt(5, idProv);
        Principal.scan.nextLine();
        
       
        int filasIns = sentencia.executeUpdate();
        if (filasIns > 0) {
            System.out.println("! Registro Exitoso !");
            System.out.println("------------------------------------");
        }

    }
}


