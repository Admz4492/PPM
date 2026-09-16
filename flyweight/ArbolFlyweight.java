public class ArbolFlyweight {
    private final String tipo;
    private final String textura;

    public ArbolFlyweight(String tipo, String textura) {
        this.tipo = tipo;
        this.textura = textura;
    }

    public void dibujar(int x, int y) {
        System.out.println("Árbol " + tipo + " en (" + x + ", " + y + ") con textura " + textura);
    }
}
