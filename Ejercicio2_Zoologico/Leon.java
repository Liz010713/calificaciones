package Ejercicio2_Zoologico;

public class Leon extends Mamifero {

    public Leon(String nombre, int edad, String tipoPelo) {
        super(nombre, edad, tipoPelo);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ruge fuerte: ¡Roaaar!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " corre rápidamente por la sabana.");
    }

    public void rugir() {
        System.out.println(nombre + " muestra su melena y ruge con poder.");
    }
}