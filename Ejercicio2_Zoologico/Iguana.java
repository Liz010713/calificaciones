package Ejercicio2_Zoologico;

public class Iguana extends Reptil {

    public Iguana(String nombre, int edad, String tipoEscamas) {
        super(nombre, edad, tipoEscamas);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace un pequeño chillido.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " trepa lentamente por una rama.");
    }

    public void tomarSol() {
        System.out.println(nombre + " se queda quieta tomando el sol.");
    }
}