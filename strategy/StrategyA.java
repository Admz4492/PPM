public class StrategyA implements Strategy {
    @Override
    public void ejecutar(double valor) {
        System.out.println("Estrategia A: resultado = " + (valor * 2));
    }
}
