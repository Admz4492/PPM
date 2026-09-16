import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    private final Map<String, ArbolFlyweight> arboles = new HashMap<>();

    public ArbolFlyweight obtener(String tipo, String textura) {
        String clave = tipo + "-" + textura;

        if (!arboles.containsKey(clave)) {
            arboles.put(clave, new ArbolFlyweight(tipo, textura));
        }

        return arboles.get(clave);
    }

    public int cantidadFlyweights() {
        return arboles.size();
    }
}
