public class HandlerB extends Handler {
    @Override
    public void manejar(int nivel) {
        if (nivel <= 20) {
            System.out.println("Handler B procesó la solicitud: " + nivel);
        } else if (siguiente != null) {
            siguiente.manejar(nivel);
        } else {
            System.out.println("Ningún handler pudo procesar: " + nivel);
        }
    }
}
