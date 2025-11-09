class Cuidador {
    private String nombre;

    public Cuidador(String nombre) {
        this.nombre = nombre;
    }

    public void alimentarAnimal(Animal animal) {
        System.out.println(nombre + " alimenta a " + animal.nombre + ".");
        animal.alimentar();
    }

    public void escucharSonido(Animal animal) {
        System.out.println(nombre + " escucha al animal:");
        animal.hacerSonido();
    }

    public void registrarAnimal(Animal animal) {
        System.out.println(nombre + " registra un nuevo animal: " + animal.nombre);
    }

    public void verInformacion(Animal animal) {
        System.out.println(nombre + " consulta información del animal:");
        animal.mostrarInfo();
    }
}
