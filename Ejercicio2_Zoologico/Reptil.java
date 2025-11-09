package Ejercicio2_Zoologico;

public class Reptil extends Animal {
    protected String tipoEscamas;

    public Reptil(String nombre, int edad, String tipoEscamas) {
        super(nombre, edad);
        this.tipoEscamas = tipoEscamas;
    }

    public void ponerHuevos() {
        System.out.println(nombre + " está poniendo huevos.");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " emite un sonido de reptil.");
    }
}