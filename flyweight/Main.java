import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArbolFactory factory = new ArbolFactory();
        List<Context> bosque = new ArrayList<>();

        ArbolFlyweight pino = factory.obtener("Pino", "Verde");
        ArbolFlyweight roble = factory.obtener("Roble", "Cafe");

        bosque.add(new Context(10, 20, pino));
        bosque.add(new Context(30, 40, pino));
        bosque.add(new Context(50, 60, roble));
        bosque.add(new Context(70, 80, pino));

        for (Context arbol : bosque) {
            arbol.dibujar();
        }

        System.out.println("Flyweights compartidos: " + factory.cantidadFlyweights());
        System.out.println("Objetos de contexto: " + bosque.size());
    }
}
