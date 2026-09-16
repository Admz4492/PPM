public class HandlerA extends Handler {
    @Override
    public void manejar(int nivel) {
        if (nivel <= 10) {
            System.out.println("Handler A procesó la solicitud: " + nivel);
        } else if (siguiente != null) {
            siguiente.manejar(nivel);
        }
    }
}
