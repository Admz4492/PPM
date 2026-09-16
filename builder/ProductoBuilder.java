public class ProductoBuilder {
    private String nombre;
    private String color;
    private double precio;
    private boolean tieneGarantia;

    public ProductoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProductoBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public ProductoBuilder setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public ProductoBuilder setTieneGarantia(boolean tieneGarantia) {
        this.tieneGarantia = tieneGarantia;
        return this;
    }

    public Producto build() {
        return new Producto(nombre, color, precio, tieneGarantia);
    }
}
