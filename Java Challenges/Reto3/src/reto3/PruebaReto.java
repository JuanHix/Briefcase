


import java.util.ArrayList;
import java.util.Arrays;


public class PruebaReto {
    public static void main(String[] args) {
        Obra pruebaClases = new Obra(); // creamos un Objeto de la clase obra
        ArrayList<Integer> unico = new ArrayList<Integer>(Arrays.asList(1,2,5,5,5,1,2,5,5,5)); // argumento
        System.out.println(pruebaClases.clases(unico));
        
        ArrayList<Integer> falta = new ArrayList<Integer>(Arrays.asList(1,3,6,8)); 
        ArrayList<Integer> pertenece = new ArrayList<Integer>(Arrays.asList(1,2,5,5,5,1,2,5,5,5));
        int categoria  = 5;
        System.out.println(pruebaClases.meFaltanDeLaClase(falta, pertenece, categoria));
        
        
        ArrayList<Integer> tengoA = new ArrayList<Integer>(Arrays.asList(8, 21, 16, 27, 9, 6, 0, 13, 8, 20, 29, 7, 26, 3, 31)); 
        ArrayList<Integer> tengoB = new ArrayList<Integer>(Arrays.asList(5, 1, 31, 11, 18, 9, 15, 29, 4, 27, 6));
        System.out.println(pruebaClases.noTengo(tengoA,tengoB));
        
        ArrayList<Integer> duplicadosA = new ArrayList<Integer>(Arrays.asList(22, 37, 16, 40, 1, 19, 35, 3, 36, 12, 15, 10, 14, 8, 31, 5)); 
        ArrayList<Integer> duplicadosB = new ArrayList<Integer>(Arrays.asList(35, 34, 4, 8, 27, 1, 21, 40, 37, 16, 30, 5, 22, 28));
        System.out.println(pruebaClases.puedoCambiar(duplicadosA,duplicadosB));
        
        
    }

}
