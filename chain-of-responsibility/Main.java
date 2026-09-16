public class Main {
    public static void main(String[] args) {
        Handler a = new HandlerA();
        Handler b = new HandlerB();
        Handler c = new HandlerC();

        a.setSiguiente(b);
        b.setSiguiente(c);

        a.manejar(5);
        a.manejar(15);
        a.manejar(50);
    }
}
