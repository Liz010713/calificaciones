package dependencia;

public class Main {
    public static void main (String[]args){
        impresora impresora = new impresora();
        impresora.encender();

        Documento doc = new Documento("Informe","Este es el cuerpo del informe");
        Impresora.imprimir(doc);
    }
}
