public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void encender() {
        device.encender();
    }

    public void apagar() {
        device.apagar();
    }

    public void volumen(int nivel) {
        device.ajustarVolumen(nivel);
    }
}
