package proyectoreto5;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Clientes {

    public static Scanner Scan = new Scanner(System.in);

    public static void ingresarClientes() throws SQLException {
        String sql = "INSERT INTO clientes VALUES (?,?,?,?,?,?,?)";
        
        PreparedStatement sentencia = Principal.conectar().prepareStatement(sql);
        System.out.print("Username:");
        String username = Principal.scan.nextLine();
        sentencia.setString(1, username);

        System.out.print("Nombre:");
        String nombre = Principal.scan.nextLine();
        sentencia.setString(2, nombre);

        System.out.print("Apellidos:");
        String apellidos = Principal.scan.nextLine();
        sentencia.setString(3, apellidos);

        System.out.print("Email:");
        String email = Principal.scan.nextLine();
        sentencia.setString(4, email);

        System.out.print("Celular:");
        String celular = Principal.scan.nextLine();
        sentencia.setString(5, celular);

        System.out.print("Contraseña:");
        int contraseña = Principal.scan.nextInt();
        sentencia.setInt(6, contraseña);
        Principal.scan.nextLine();

        System.out.print("Fecha de Nacimiento:");
        String nacimiento = Principal.scan.nextLine();
        sentencia.setString(7, nacimiento);
        

        int filasIns = sentencia.executeUpdate();
        if (filasIns > 0) {
            System.out.println("* Registro cliente Exitoso *");
        }
    }

}
