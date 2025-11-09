package Ejercicio1_SistemaUsuarios;

public class Profesor {

    // Atributos públicos
    public String materia_asignada;
    public String horario_clases;

    // Constructor
    public Profesor(String materia_asignada, String horario_clases) {
        this.materia_asignada = materia_asignada;
        this.horario_clases = horario_clases;
    }

    // Métodos privados (solo accesibles dentro de la clase)
    private void editar_notas() {
        System.out.println("Editando notas...");
        // Lógica para editar notas
    }

    private void administrar_notas() {
        System.out.println("Administrando notas...");
        // Lógica para administrar notas
    }

    private void crear_notas() {
        System.out.println("Creando notas...");
        // Lógica para crear nuevas notas
    }

    private void borrar_notas() {
        System.out.println("Borrando notas...");
        // Lógica para eliminar notas
    }

    // Método público para probar los métodos privados internamente
    public void gestionarNotas() {
        crear_notas();
        editar_notas();
        administrar_notas();
        borrar_notas();
    }

}