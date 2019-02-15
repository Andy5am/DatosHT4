import java.util.Vector;

public class PilaVector<E> extends AbstractPila<E>{

    Vector<E> vector = new Vector();

    @Override
    public void push(E item) {
        vector.add(item);
    }

    @Override
    public E pop() {
        E lastItem = vector.get(vector.size()-1);
        vector.remove(lastItem);
        return lastItem;
    }

    @Override
    public E peek() {
        return vector.get(vector.size()-1);
    }

    @Override
    public boolean empty() {
        return vector.isEmpty();
    }

    @Override
    public int size() {
        return vector.size();
    }
}
