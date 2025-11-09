package Ejercicio2_Zoologico;

public class Elefante extends Mamifero {

    public Elefante(String nombre, int edad, String tipoPelo) {
        super(nombre, edad, tipoPelo);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " trompetea: ¡Prrruuuu!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " camina pesadamente por la selva.");
    }

    public void trompetear() {
        System.out.println(nombre + " levanta su trompa y hace un fuerte sonido.");
    }
}