package expreciones_landa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import expreciones_landa.Persona.Estudiante;

public class Main {
    public static void main(String[] args) {
        // Metodo 1
        // List<String> lista = Arrays.asList("uno","dos","tres");
        // lista.forEach(s -> System.out.println(s));
        
        // metodo 2

        // List<Persona>personas = new ArrayList<>();
        // personas.add(new Persona("Carlos", 25));
        // personas.add(new Persona("Carlos", 25));
        // personas.add(new Persona("Ana", 23));
        // personas.add(new Persona("Jose", 30));
        // personas.add(new Persona("Maria", 20));
        // Comparator<Persona> poredad = (p1,p2) -> Integer.compare(p1.getEdad(),p2.getEdad());

        // Collections.sort(personas, poredad);

        // personas.forEach(System.out::println);

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Carlos", 85.5));
        estudiantes.add(new Estudiante("Ana", 92.0));
        estudiantes.add(new Estudiante("Jose", 78.3));
        estudiantes.add(new Estudiante("Maria", 88.9));

        Consumer<Estudiante> imprimirNombre = estudiante -> System.out.println(estudiante.getNombre());

        estudiantes.forEach(imprimirNombre);
    }
}