/**
 * Esta es la clase es un tipo de lista
 * @author Andy Castillo 18040 y Cristina Bautista 161260
 * @version 15/02/2019
 * @param <E>
 */
public class PilaList<E> extends AbstractPila<E> {
    //una variable list de tipo lista
    private List list;

    /**
     * Este es el constructor
     * @param opcion
     */
    public PilaList(String opcion){
        FactoryList factoryList = new FactoryList();
        list = factoryList.createList(opcion);
    }

    @Override
    public void push(E item) {
        list.addLast(item);

    }

    @Override
    public E pop() {
        return (E) list.removeLast();
    }

    @Override
    public E peek() {
        return (E) list.getLast();

    }

    @Override
    public boolean empty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
}
