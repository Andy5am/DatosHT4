import java.util.ArrayList;

/**
 * Esta es la clase es un tipo de lista
 * @author Andy Castillo 18040 y Cristina Bautista 161260
 * @version 15/02/2019
 * @param <E>
 */
public class PilaArrayList<E> extends AbstractPila<E> {
    //se instancia un nuevo arreglo
    ArrayList<E> lista = new ArrayList();

    @Override
    public void push(E item) {
        lista.add(item);
    }

    @Override
    public E pop() {
        E lastItem = lista.get(lista.size()-1);
        lista.remove(lastItem);
        return lastItem;
    }

    @Override
    public E peek() {
        return lista.get(lista.size()-1);
    }

    @Override
    public boolean empty() {
        return lista.isEmpty();
    }

    @Override
    public int size() {
        return lista.size();
    }
}
