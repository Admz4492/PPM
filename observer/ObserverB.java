public class ObserverB implements Observer {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Observer B recibió: " + mensaje);
    }
}
