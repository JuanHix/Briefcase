package reto2;





public class Posgrado extends Estudiante {
    private String modalidad;
    String Tipo;    


    public Posgrado(String Tipo,String nombre, int edad, String programa, String tipo_etnia,String modalidad) {
        super(nombre, edad, programa, tipo_etnia);    
        this.Tipo=Tipo;
        this.modalidad = modalidad;
    }

    public Posgrado(String modalidad, String Tipo, String nombre, int edad, String programa, String tipo_etnia) {
        super(nombre, edad, programa, tipo_etnia);
        this.modalidad = modalidad;
        this.Tipo = Tipo;
    }


    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    
}
