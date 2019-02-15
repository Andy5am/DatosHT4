public class PilaList<E> extends AbstractPila<E> {
    private List list;

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
