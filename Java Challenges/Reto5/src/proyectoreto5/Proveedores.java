
package proyectoreto5;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Proveedores {
    public static void ingresarProveedor() throws SQLException {
        String sqlProv = "INSERT INTO proveedor VALUES (?,?,?,?)";
        PreparedStatement sentencia = Principal.conectar().prepareStatement(sqlProv);
        
        System.out.print("ID:");
        int id = Principal.scan.nextInt();
        sentencia.setInt(1, id);
        Principal.scan.nextLine();

        System.out.print("Nombre:");
        String nombre = Principal.scan.nextLine();
        sentencia.setString(2, nombre);

        System.out.print("Direccion:");
        String direccion = Principal.scan.nextLine();
        sentencia.setString(3, direccion);
        

        System.out.print("Telefono:");
        String telefono = Principal.scan.nextLine();
        sentencia.setString(4, telefono);
        
        
        int filasIns = sentencia.executeUpdate();
        if (filasIns > 0) {
            System.out.println("! Insercion Exitosa !");
            System.out.println("------------------------------------");
        }

    }
}
    
 


