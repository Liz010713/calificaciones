public class Impresora {
    private boolean estaEncendida;

    // Constructor
    public Impresora() {
        this.estaEncendida = false;
    }

    // Método para encender la impresora
    public void encender() {
        estaEncendida = true;
        System.out.println("La impresora se ha encendido.");
    }

    // Método para imprimir un documento
    public void imprimir(Documento documento) {
        if (estaEncendida) {
            System.out.println("Imprimiendo documento...");
            System.out.println("Título: " + documento.getTitulo());
            System.out.println("Cuerpo: " + documento.getCuerpo());
        } else {
            System.out.println("Error: La impresora está apagada. Enciéndela antes de imprimir.");
        }
    }
}

