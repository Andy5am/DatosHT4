import java.util.ArrayList;

public class PilaArrayList<E> extends AbstractPila<E> {

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
