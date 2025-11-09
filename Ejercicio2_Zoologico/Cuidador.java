package Ejercicio2_Zoologico;

import java.util.ArrayList;

public class Cuidador {
    // 🔹 Atributos
    private String nombre;
    private int edad;
    private String turno;
    private ArrayList<Animal> animalesAsignados;

    // 🔹 Constructor
    public Cuidador(String nombre, int edad, String turno) {
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.animalesAsignados = new ArrayList<>();
    }

    // 🔹 Métodos
    public void asignarAnimal(Animal animal) {
        animalesAsignados.add(animal);
        System.out.println(nombre + " ahora cuida a " + animal.nombre + ".");
    }

    public void alimentarAnimal(Animal animal) {
        System.out.println(nombre + " alimenta a " + animal.nombre + ".");
    }

    public void limpiarJaula(Animal animal) {
        System.out.println(nombre + " limpia la jaula de " + animal.nombre + ".");
    }

    public void revisarAnimal(Animal animal) {
        System.out.println(nombre + " revisa la salud de " + animal.nombre + ".");
    }

    // 🔹 Mostrar información del cuidador
    public void mostrarInfo() {
        System.out.println("👨‍🌾 Cuidador: " + nombre + " | Edad: " + edad + " | Turno: " + turno);
        System.out.println("Animales asignados:");
        for (Animal a : animalesAsignados) {
            System.out.println(" - " + a.nombre);
        }
    }
}