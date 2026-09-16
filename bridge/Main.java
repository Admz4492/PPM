public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        AdvancedRemoteControl controlTV = new AdvancedRemoteControl(tv);
        controlTV.encender();
        controlTV.volumen(15);
        controlTV.mute();
        controlTV.apagar();

        System.out.println();

        Device radio = new Radio();
        AdvancedRemoteControl controlRadio = new AdvancedRemoteControl(radio);
        controlRadio.encender();
        controlRadio.volumen(8);
        controlRadio.apagar();
    }
}
