public class StrategyB implements Strategy {
    @Override
    public void ejecutar(double valor) {
        System.out.println("Estrategia B: resultado = " + (valor + 10));
    }
}
