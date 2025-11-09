package Ejercicio2_Zoologico;

public class Cocodrilo extends Reptil {

    public Cocodrilo(String nombre, int edad, String tipoEscamas) {
        super(nombre, edad, tipoEscamas);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " gruñe desde el agua.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " nada sigilosamente en el río.");
    }

    public void morder() {
        System.out.println(nombre + " cierra sus mandíbulas con fuerza.");
    }
}
