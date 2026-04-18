import java.util.Comparator;

public class ComparadorCriterioB implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {
        int c = Integer.compare(o1.getTotalItens(), o2.getTotalItens());
        if (c != 0) {
            return c;
        }
        c = o1.getDataPedido().compareTo(o2.getDataPedido());
        if (c != 0) {
            return c;
        }
        return Integer.compare(o1.getIdPedido(), o2.getIdPedido());
    }
}
