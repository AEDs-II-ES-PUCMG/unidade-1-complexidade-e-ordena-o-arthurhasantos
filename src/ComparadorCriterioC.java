import java.util.Comparator;

public class ComparadorCriterioC implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {
        int c = Double.compare(o2.indiceEconomia(), o1.indiceEconomia());
        if (c != 0) {
            return c;
        }
        c = Double.compare(o1.valorFinal(), o2.valorFinal());
        if (c != 0) {
            return c;
        }
        return Integer.compare(o1.getIdPedido(), o2.getIdPedido());
    }
}
