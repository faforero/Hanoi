package lista_simple_enlazada;

public class persona {

    private String anombre, apellido;
    private int edad;

    public persona(String anombre, String apellido, int edad) {
        this.anombre = anombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    @Override
    public String toString() {
        return "datos persona"
                + " \n anombre=" + anombre
                + ",\n apellido=" + apellido
                + ",\n edad=" + edad ;
    }

    public String getAnombre() {
        return anombre;
    }

    public void setAnombre(String anombre) {
        this.anombre = anombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
