package proyectoreto5;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Consultas {

    public static void crearTablas() {
        try {
            String[] tablas = {
                "CREATE TABLE proveedor (prov_id int PRIMARY KEY,prov_nombre char(20),prov_direccion char(45),prov_telefono char(20))",
                "CREATE TABLE clientes (username char(20) PRIMARY KEY,nombre char(20),apellidos char(20),email varchar(45),celular varchar(20),contraseña int,nacimiento date)",
                "CREATE TABLE fabricantes (fabricante char(20) PRIMARY KEY)",
                "CREATE TABLE bicicletas (id int PRIMARY KEY, fabricante char(20) , precio int, año int, FOREIGN KEY(fabricante) REFERENCES fabricantes (fabricante))",
                "CREATE TABLE motocicletas (id int primary key, fabricante char(20), Precio int, autonomia int, id_prov int, foreign key (fabricante) references fabricantes (fabricante), foreign key (id_prov) references Proveedor (prov_id))",
                "CREATE TABLE compras (id int primary key, username char(20), fabricante char(20), fecha_hora timestamp, foreign key (username) references Clientes (username), foreign key (fabricante) references fabricantes (fabricante))"};
            
            for (String x: tablas) {
                PreparedStatement sentencia = Principal.conectar().prepareStatement(x);
                sentencia.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println("tablas ya Creadas");
        }

    }

    public static void modificaYear() throws SQLException {
        String sql = "UPDATE bicicletas SET año=? WHERE fabricante=?";
        PreparedStatement sentencia = Principal.conectar().prepareStatement(sql);
        
        System.out.println("Por favor ingrese fabricante de la bicicleta y el año a modificar. ");
        System.out.print("Fabricante:");
        String nombre = Principal.scan.nextLine();
        sentencia.setString(2, nombre);

        System.out.print("Año:");
        int año = Principal.scan.nextInt();
        sentencia.setInt(1, año);
        Principal.scan.nextLine();

        int filasIns = sentencia.executeUpdate();
        if (filasIns > 0) {
            System.out.println("! Año Modificado Correctamente !");

        }

    }

    public static void modificaTelCliente() throws SQLException {
        String sql = "UPDATE clientes SET celular=? WHERE username=?";
        PreparedStatement sentencia = Principal.conectar().prepareStatement(sql);
        
        System.out.println("Por favor ingrese Username y el nuevo numero de celular.");
        System.out.print("Username:");
        String username = Principal.scan.nextLine();
        sentencia.setString(2, username);

        System.out.print("Celular:");
        String celular = Principal.scan.nextLine();
        sentencia.setString(1, celular);

        int filasIns = sentencia.executeUpdate();
        if (filasIns > 0) {
            System.out.println("! Numero de Celular modificado Correctamente !");

        }

    }

    public static void borraCompra() throws SQLException {
        String sql = "DELETE FROM compras WHERE username=? AND fabricante=?";
        PreparedStatement sentencia = Principal.conectar().prepareStatement(sql);
        System.out.println("Por favor ingrese Username del cliente y fabricante de la intencion de compra.");
        
        System.out.print("Username:");
        String username = Principal.scan.nextLine();
        sentencia.setString(1, username);

        System.out.print("Fabricante:");
        String fabricante = Principal.scan.nextLine();
        sentencia.setString(2, fabricante);

        int filasIns = sentencia.executeUpdate();
        if (filasIns > 0) {
            System.out.println("! Intencion de compra ELIMINADA Correctamente !");

        }
    }

    public static void consultaFabricantes() throws SQLException {
        String sql = "SELECT fabricante FROM fabricantes ORDER BY fabricante;";
        Statement sentencia = Principal.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);

        while (consulta.next()) {
            String col1 = consulta.getNString(1);
            System.out.println(col1);
        }
    }

    public static void consultaInfoBici() throws SQLException {
        String sql = "SELECT Fabricante,Precio,Año FROM bicicletas WHERE Año >= 2019 ORDER BY  Fabricante;";
        Statement sentencia = Principal.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);

        while (consulta.next()) {
            String col1 = consulta.getNString(1);
            int col2 = consulta.getInt(2);
            String col3 = consulta.getString(3);
            System.out.println(col1 + " " + col2 + " " + col3);
        }
    }

    public static void consultaFabriMoto() throws SQLException {
        String sql = "SELECT fabricante FROM motocicletas WHERE id_prov = 101;";
        Statement sentencia = Principal.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);

        while (consulta.next()) {
            String col1 = consulta.getNString(1);
            System.out.println(col1);

        }
    }

    public static void consultaCompBiMo() throws SQLException {
        String sql = "select fabricante from compras where username =\"lucky\" order by fabricante;";
        Statement sentencia = Principal.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);

        while (consulta.next()) {
            String col1 = consulta.getNString(1);
            System.out.println(col1);
        }
    }

    public static void consultaCompBiCli() throws SQLException {
        String sql = "select c.Username, c.Nombre, c.Apellido from Clientes c, compras p where p.username = c.username and p.fabricante=\"Yeti\" order by Nombre;";
        Statement sentencia = Principal.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);

        while (consulta.next()) {
            String col1 = consulta.getString(1);
            String col2 = consulta.getString(2);
            String col3 = consulta.getString(3);

            System.out.println(col1 + " " + col2 + " " + col3);
        }
    }

    public static void consultaBiciFab() throws SQLException {
        System.out.println("Por favor ingrese Año para validar catidad de Bicicletas. ");
        
        System.out.print("Año:");
        int year = Principal.scan.nextInt();
        Principal.scan.nextLine();

        String sql = "select count(fabricante) from bicicletas where Año >=" + year;
        Statement sentencia = Principal.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);

        while (consulta.next()) {
            int col1 = consulta.getInt(1);
            System.out.println(col1);

        }
        System.out.println("------------------------------------------------------");
    }
}
