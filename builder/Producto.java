public class Producto {
    private final String nombre;
    private final String color;
    private final double precio;
    private final boolean tieneGarantia;

    public Producto(String nombre, String color, double precio, boolean tieneGarantia) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
        this.tieneGarantia = tieneGarantia;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", tieneGarantia=" + tieneGarantia +
                '}';
    }
}
