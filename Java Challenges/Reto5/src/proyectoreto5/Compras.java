

package proyectoreto5;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Compras {
    public static void ingresarCompras() throws SQLException {
        String sqlComp = "INSERT INTO compras VALUES (?,?,?,?)";
        PreparedStatement sentencia = Principal.conectar().prepareStatement(sqlComp);
        
        System.out.print("ID:");
        int id = Principal.scan.nextInt();
        sentencia.setInt(1, id);
        Principal.scan.nextLine();

        System.out.print("Username:");
        String username = Principal.scan.nextLine();
        sentencia.setString(2, username);

        System.out.print("Fabricante:");
        String fabricante = Principal.scan.nextLine();
        sentencia.setString(3, fabricante);
        

        System.out.print("Fecha y Hora:");
        String fecha = Principal.scan.nextLine();
        sentencia.setString(4, fecha);
        

        int filasIns = sentencia.executeUpdate();
        if (filasIns > 0) {
            System.out.println("! Insercion Exitosa !");
            System.out.println("------------------------------------");
        }

    }
}
    


