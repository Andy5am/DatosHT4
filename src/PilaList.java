public class PilaList<E> extends AbstractPila<E> {
    private List list;

    public PilaList(String opcion){
        FactoryList factoryList = new FactoryList();
        list = factoryList.createList(opcion);
    }

    @Override
    public void push(E item) {
        list.add(item);
    }

    @Override
    public E pop() {
        E lastItem = (E) list.getLast();
        list.removeLast();
        return lastItem;
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
