public class ObserverA implements Observer {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Observer A recibió: " + mensaje);
    }
}
