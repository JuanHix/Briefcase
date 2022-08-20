package reto2;

import java.util.Scanner;
import java.util.ArrayList;

public class Registro {
        ArrayList<Object> listaEstudiantes = new ArrayList<>();
    public static void main(String[] args) {
      Registro listado = new Registro();
            listado.procesarComandos();
    }
    
    public void procesarComandos(){
     Scanner leer = new Scanner(System.in);
     String[] datos ;
     Pregrado e_pregrado;
     Posgrado e_posgrado;
     boolean run = true;
     do{
    String opcion = leer.nextLine();
     datos = opcion.split("&");
     if(datos[0].equals("1")){
         if (datos[1].equals("Pregrado")) {
             e_pregrado = new Pregrado(datos[1],datos[2],Integer.parseInt(datos[3]),datos[4],datos[5],Integer.parseInt(datos[6]));
             listaEstudiantes.add(e_pregrado);
         } 
         else if (datos[1].equals("Posgrado")){
             e_posgrado = new Posgrado(datos[1],datos[2],Integer.parseInt(datos[3]),datos[4],datos[5],datos[6]);
             listaEstudiantes.add(e_posgrado);
         }
     }
     else if (datos[0].equals("2")){
         System.out.println("***Listado de estudiantes***");
         for (int i = 0; i < listaEstudiantes.size(); i++) {
             if (listaEstudiantes.get(i).getClass()==Pregrado.class) {
                 Pregrado dato = (Pregrado) listaEstudiantes.get(i);
                 System.out.println("\tEstudiante " + dato.getTipo());
                 System.out.println("\tNombre: " + dato.getNombre());
                 System.out.println("\tEdad: " + dato.getEdad() + " anios");
                 System.out.println("\tPrograma: " + dato.getPrograma());
                 System.out.println("\tEtnia: " + dato.getTipo_etnia());
                 System.out.println("\tCreditos aprobados: " + dato.getCantidad_creditos());
                 
             }
             else if (listaEstudiantes.get(i).getClass()==Posgrado.class){
                 Posgrado dato1 = (Posgrado) listaEstudiantes.get(i);
                 System.out.println("\tEstudiante " + dato1.getTipo());
                 System.out.println("\tNombre: " + dato1.getNombre());
                 System.out.println("\tEdad: " + dato1.getEdad() + " anios");
                 System.out.println("\tPrograma: " + dato1.getPrograma());
                 System.out.println("\tEtnia: " + dato1.getTipo_etnia());
                 System.out.println("\tModalidad: " + dato1.getModalidad());
                 
             }
             }
         }
     else if (datos[0].equals("3")){
         run = false;
     }
     
     }while(run);
        
    }
    
}
