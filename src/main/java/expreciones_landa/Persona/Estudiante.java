package expreciones_landa.Persona;

public class Estudiante {
    private String nombre;
    private double nota;
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    public String getNombre() {
        return nombre;
    }
    public double getNota() {
        return nota;
    }
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", nota=" + nota + "]";
    }
}
