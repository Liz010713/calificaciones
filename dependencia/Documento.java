public class Documento {
    private String titulo;
    private String cuerpo;

    // Constructor
    public Documento(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }
}
 