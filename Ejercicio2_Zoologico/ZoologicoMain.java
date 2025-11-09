package Ejercicio2_Zoologico;
public class ZoologicoMain {
    public static void main(String[] args) {

        // Crear animales
        Leon leon = new Leon("Simba", 5, "Melena dorada");
        Elefante elefante = new Elefante("Dumbo", 10, "Grueso");
        Cocodrilo cocodrilo = new Cocodrilo("Coco", 7, "Escamas verdes");
        Iguana iguana = new Iguana("Iggy", 3, "Escamas rugosas");

        // Crear cuidador
        Cuidador cuidador = new Cuidador("Carlos", 35, "Mañana");

        // Asignar animales al cuidador
        cuidador.asignarAnimal(leon);
        cuidador.asignarAnimal(elefante);
        cuidador.asignarAnimal(cocodrilo);

        // Mostrar información del cuidador
        cuidador.mostrarInfo();
        System.out.println("-------------------------");

        // Acciones del cuidador
        cuidador.alimentarAnimal(leon);
        cuidador.limpiarJaula(elefante);
        cuidador.revisarAnimal(cocodrilo);
        System.out.println("-------------------------");

        // Acciones polimórficas
        Animal[] animales = { leon, elefante, cocodrilo, iguana };

        for (Animal a : animales) {
            a.hacerSonido();
            a.moverse();
            System.out.println("-------------------------");
        }

        // Acciones específicas
        leon.rugir();
        elefante.trompetear();
        cocodrilo.morder();
        iguana.tomarSol();
    }
}