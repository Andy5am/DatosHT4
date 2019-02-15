public class PilaList<E> extends AbstractPila<E> {
    private List list;

    public PilaList(String opcion){
        FactoryList factoryList = new FactoryList();
        list = factoryList.createList(opcion);
    }

    @Override
    public void push(E item) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
