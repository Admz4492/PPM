import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String estado;

    public void agregarObserver(Observer observer) {
        observers.add(observer);
    }

    public void eliminarObserver(Observer observer) {
        observers.remove(observer);
    }

    public void cambiarEstado(String estado) {
        this.estado = estado;
        notificar();
    }

    private void notificar() {
        for (Observer observer : observers) {
            observer.actualizar(estado);
        }
    }
}
