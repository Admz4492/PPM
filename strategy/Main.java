public class Main {
    public static void main(String[] args) {
        Context contexto = new Context(new StrategyA());

        contexto.ejecutar(5);

        contexto.setStrategy(new StrategyB());
        contexto.ejecutar(5);
    }
}
