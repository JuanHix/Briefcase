package retos;

import java.util.Scanner;

public class RetoUno {

    public static void main(String[] args) {
        //Entrada
        Scanner scan = new Scanner(System.in);

        System.out.println("Distacia casa Goku: ");
        var dist_casa_goku = Integer.parseInt(scan.nextLine());
        var distanciaTexto = "Esfera no encontrada";

        // Tecnica(funxcion)
        int proxima_Esfera = (dist_casa_goku * 2) + 4;
        int tiempo_Viaje = (dist_casa_goku + proxima_Esfera) / 5;

        // Condicional Esfera
        if (tiempo_Viaje >= 0 && tiempo_Viaje <= 20) {
            distanciaTexto = "uno";
        } else if (tiempo_Viaje >= 21 && tiempo_Viaje <= 30) {
            distanciaTexto = "dos";
        } else if (tiempo_Viaje >= 31 && tiempo_Viaje <= 50) {
            distanciaTexto = "tres";
        } else {
            distanciaTexto = "cuatro";
        }

        //Salida
        System.out.println(dist_casa_goku + " " + proxima_Esfera + " " + tiempo_Viaje);
        System.out.println(distanciaTexto);

    }
}
