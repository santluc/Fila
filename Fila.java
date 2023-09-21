public class Fila {
    private static Fila instance;

    private Fila() {
    }

    public static Fila getInstance() {
        if (instance == null) {
            synchronized (Fila.class) {
                if (instance == null) {
                    instance = new Fila();
                }
            }
        }
        return instance;
    }

    public void imprimeDocumento(Documento documento) {
        // ...
    }

    public void removeDocumento() {
        // ...
    }

    public void removeTodosDocumentos() {
        // ...
    }

    public static void main(String[] args) {
        // Crie uma fila e imprima um documento.
        Fila fila = Fila.getInstance();
        fila.imprimeDocumento(new Documento("Meu Documento", "PDF"));
    }

}
