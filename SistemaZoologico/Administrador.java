class Administrador {
    private String nombre;

    public Administrador(String nombre) {
        this.nombre = nombre;
    }

    public void aprobarRegistro(Animal animal) {
        System.out.println(nombre + " aprueba el registro de " + animal.nombre + ".");
    }

    public void generarReporte() {
        System.out.println(nombre + " genera un reporte de todos los animales del zoológico.");
    }

    public void eliminarAnimal(Animal animal) {
        System.out.println(nombre + " elimina a " + animal.nombre + " del registro.");
    }
}
