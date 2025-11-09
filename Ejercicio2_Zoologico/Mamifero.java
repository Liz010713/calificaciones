package Ejercicio2_Zoologico;

public class Mamifero extends Animal {
    protected String tipoPelo;

    public Mamifero(String nombre, int edad, String tipoPelo) {
        super(nombre, edad);
        this.tipoPelo = tipoPelo;
    }

    public void amamantar() {
        System.out.println(nombre + " está amamantando a sus crías.");
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " emite un sonido de mamífero.");
    }
}
