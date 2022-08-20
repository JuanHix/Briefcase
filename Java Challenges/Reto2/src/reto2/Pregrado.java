package reto2;


public class Pregrado extends Estudiante {
    private int cantidad_creditos;
    String Tipo;

    public Pregrado(String Tipo,String nombre, int edad, String programa, String tipo_etnia,int cantidad_creditos) {
        super(nombre, edad, programa, tipo_etnia);   
        this.Tipo=Tipo;
        this.cantidad_creditos = cantidad_creditos;
    }

    public int getCantidad_creditos() {
        return cantidad_creditos;
    }

    public void setCantidad_creditos(int cantidad_creditos) {
        this.cantidad_creditos = cantidad_creditos;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }



}
