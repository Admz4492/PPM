public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();

        subject.agregarObserver(observerA);
        subject.agregarObserver(observerB);

        subject.cambiarEstado("Nuevo evento disponible");
        subject.cambiarEstado("El evento cambió");

        subject.eliminarObserver(observerB);
        subject.cambiarEstado("Última actualización");
    }
}
