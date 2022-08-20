package proyectoreto5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

// Integrantes del Proyecto:
// Juan Alberto Hidalgo
// Juan Arturo Barragan
// Segastian Romero

public class Principal {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        try {
            System.out.println("********************************\n"
                    + "****   RETO 5 CRUD MySQL    ****\n"
                    + "********************************\n"
                    + "1. Crear Tablas.\n"
                    + "-----------------------------------------------------------------\n"
                    + "2. Ingresar datos Tabla Proveedor.\n"
                    + "3. Ingresar datos Tabla Clientes.\n"
                    + "4. Ingresar datos Tabla Fabricantes.\n"
                    + "5. Ingresar datos Tabla Bicicletas.\n"
                    + "6. Ingresar datos Tabla Motocicletas.\n"
                    + "7. Ingresar datos Tabla Compras.\n"
                    + "------------------------------------------------------------------\n"
                    + "8. Modificar Año de Bicicletas.\n"
                    + "9. Modificar telefono de Cliente.\n"
                    + "10 Borrar intencion de compra.\n"
                    + "-----------------------------------------------------------------\n"
                    + "11. Listado de Fabricantes.\n"
                    + "12. Mostrar informacion Fabricantes Bicletas estrenadas desde 2019.\n"
                    + "13. Mostrar fabricantes motocicletas con motor Auteco.\n"
                    + "14. Mostrar fabricante intencion de Compra del cliente lucky.\n"
                    + "15. Mostar Cliente que quieren comprar bicicleta Yeti.\n"
                    + "16. Cantidad bicicletas fabricante desde \"x\" Año. \n"
                    + "------------------------------------------------------------------\n"
                    + "- Otro numero para SALIR -\n"
                    + "------------------------------------------------------------------" 
            );
            
            System.out.print(">>  ");
            String input = scan.nextLine();
            byte opcion = Byte.parseByte(input);

            switch (opcion) {
                case 1:
                    Consultas.crearTablas();
                    break;
                case 2:
                    Proveedores.ingresarProveedor();
                    break;
                case 3:
                    Clientes.ingresarClientes();
                    break;
                case 4:
                    Fabricantes.ingresarFabricantes();
                    break;
                case 5:
                    Bicicletas.ingresarBicicletas();
                    break;
                case 6:
                    Motocicletas.ingresarMotocicletas();
                    break;
                case 7:
                    Compras.ingresarCompras();
                    break;
                case 8:
                    Consultas.modificaYear();
                    break;
                case 9:
                    Consultas.modificaTelCliente();
                    break;
                case 10:
                    Consultas.borraCompra();
                    break;
                case 11:
                    Consultas.consultaFabricantes();
                    break;
                case 12:
                    Consultas.consultaInfoBici();
                    break;
                case 13:
                    Consultas.consultaFabriMoto();
                    break;
                case 14:
                    Consultas.consultaCompBiMo();
                    break;
                case 15:
                    Consultas.consultaCompBiCli();
                    break;
                case 16:
                    Consultas.consultaBiciFab();
                    break;
                default:
                    System.out.println("Dato incorrecto Hasta Pronto...");
            }
        } catch (Exception e) {
            System.out.println("Dato incorrecto Hasta Pronto...");

        }
    }

    public static Connection conectar() {
        String dbURL = "jdbc:mysql://127.0.0.1:3306/ecodosreto5";
        String user = "root";
        String password = "galford1985";
        Connection con = null;
        try {
            con = DriverManager.getConnection(dbURL, user, password);
            if (con != null) {
                System.out.println("* Conectado *");
                System.out.println("-------------");
            }
        } catch (SQLException error) {
            System.out.println("Error: "
                    + error.getErrorCode() + " " + error.getMessage());
        }

        return con;
    }
}
