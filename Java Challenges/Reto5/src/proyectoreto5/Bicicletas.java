package proyectoreto5;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Bicicletas {

    public static void ingresarBicicletas() throws SQLException {
        String sqlBici = "INSERT INTO bicicletas VALUES (?,?,?,?)";
        PreparedStatement sentencia = Principal.conectar().prepareStatement(sqlBici);
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

        System.out.print("Año:");
        int año = Principal.scan.nextInt();
        sentencia.setInt(4, año);
        //Principal.scan.nextLine();

        int filasIns = sentencia.executeUpdate();
        if (filasIns > 0) {
            System.out.println("! Registro Exitoso !");
            System.out.println("------------------------------------");
        }

    }
}
