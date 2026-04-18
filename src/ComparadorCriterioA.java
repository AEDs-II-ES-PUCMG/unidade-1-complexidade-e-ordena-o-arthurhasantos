import java.util.Comparator;

public class ComparadorCriterioA implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {
        int c = Double.compare(o1.valorFinal(), o2.valorFinal());
        if (c != 0) {
            return c;
        }
        c = Integer.compare(o1.getTotalItens(), o2.getTotalItens());
        if (c != 0) {
            return c;
        }
        return Integer.compare(o1.getIdPrimeiroProduto(), o2.getIdPrimeiroProduto());
    }
}
