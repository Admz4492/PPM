public class Main {
    public static void main(String[] args) {
        Producto producto = new ProductoBuilder()
                .setNombre("Laptop")
                .setColor("Negro")
                .setPrecio(2500000)
                .setTieneGarantia(true)
                .build();

        System.out.println(producto);
    }
}
