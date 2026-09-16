public class Radio implements Device {
    @Override
    public void encender() {
        System.out.println("Radio encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Radio apagada");
    }

    @Override
    public void ajustarVolumen(int volumen) {
        System.out.println("Volumen Radio: " + volumen);
    }
}
