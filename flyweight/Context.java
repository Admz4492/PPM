public class Context {
    private final int x;
    private final int y;
    private final ArbolFlyweight arbol;

    public Context(int x, int y, ArbolFlyweight arbol) {
        this.x = x;
        this.y = y;
        this.arbol = arbol;
    }

    public void dibujar() {
        arbol.dibujar(x, y);
    }
}
