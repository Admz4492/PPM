public class HandlerC extends Handler {
    @Override
    public void manejar(int nivel) {
        System.out.println("Handler C procesó la solicitud: " + nivel);
    }
}
