package calificaciones;
public class Estudiante {

    // Atributos públicos
    public String horario_clases;
    public String grupo;

    // Constructor
    public Estudiante(String horario_clases, String grupo) {
        this.horario_clases = horario_clases;
        this.grupo = grupo;
    }

    // Métodos públicos
    public void subir_trabajo() {
        System.out.println("Subiendo trabajo...");
        // Lógica para subir un trabajo
    }

    public void actualizar_informacion() {
        System.out.println("Actualizando información del estudiante...");
        // Lógica para actualizar datos del estudiante
    }

}