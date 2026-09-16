public class TV implements Device {
    @Override
    public void encender() {
        System.out.println("TV encendida");
    }

    @Override
    public void apagar() {
        System.out.println("TV apagada");
    }

    @Override
    public void ajustarVolumen(int volumen) {
        System.out.println("Volumen TV: " + volumen);
    }
}
