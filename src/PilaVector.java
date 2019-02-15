import java.util.Vector;

/**
 * Esta es la clase que es un tipo de stack
 * @author Andy Castillo 18040 y Cristina Bautista 161260
 * @version 15/02/2019
 * @param <E>
 */
public class PilaVector<E> extends AbstractPila<E>{
    //variable vector de tipo vector
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
