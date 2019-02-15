import java.util.Iterator;

/**
 * Esta clase es un tipo de lista
 * @author Andy Castillo 18040 y Cristina Bautista 161260
 * @version 15/02/2019
 * @param <E>
 */
public class SinglyLinkedList <E> extends AbstractList <E> {
    protected int count;
    protected Node <E> head;

    /**
     * Es el constructor de la clase
     */
    public SinglyLinkedList(){
        head = null;
        count =0;
    }

    /**
     * Este metodo es el que devuelve el numero de elementos en la lista
     * @return numero de elementos
     */
    public int size()
    // post: returns number of elements in list
    {
        return count;
    }

    /**
     * Es el metodo que agrega de primero en la lista el elemento
     * @param value
     */
    public void addFirst(E value)
    // post: value is added to beginning of list
    {
        // note order that things happen:
        // head is parameter, then assigned
        head = new Node<E>(value, head);
        count++;
    }

    /**
     * Este es el metodo que remueve el primer elemento de la lista
     * @return el valor del elemento
     */
    public E removeFirst()
    // pre: list is not empty
    // post: removes and returns value from beginning of list
    {
        Node<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }

    /**
     * Este metodo que devuelve el primer elemento de la lista
     * @return el valor del primer elemento de la lista
     */
    public E getFirst()
    // pre: list is not empty
    // post: returns first value in list
    {
        return head.value();
    }

    /**
     * Este es el metodo que agrega un valor al final de la lista
     * @param value
     */
    public void addLast(E value)
    // post: adds value to end of list
    {
        // location for new value
        Node<E> temp = new Node<E>(value,null);
        if (head != null)
        {
            // pointer to possible tail
            Node<E> finger = head;
            while (finger.next() != null)
            {
                finger = finger.next();
            }

            finger.setNext(temp);
        } else head = temp;


        count++;

    }


    /**
     * Este es el metodo que devuelve verdadero o falso si se encuentra un elemento en la lista
     * @param value
     * @return verdero si hay elemento o falso si no hay elementos
     */
    public boolean contains(E value)
    // pre: value is not null
    // post: returns true iff value is found in list
    {
        Node<E> finger = head;

        while (finger != null &&
                !finger.value().equals(value))
        {
            finger = finger.next();
        }
        return finger != null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public void clear() {
        Node finger = head;
        while (finger!=null){
            finger.setValue(null);
        }
    }

    @Override
    public E getLast() {

        if (head!=null){
            Node<E> finger = head;
            while (finger.next()!=null){
                finger=finger.next();
            }
            return finger.value();
        }
        return head.value();

    }

    @Override
    public E removeLast() {
        Node <E> finger = head;
        Node<E> previous = null;
        while (finger.next()!=null){
            previous = finger;
            finger = finger.next();
        }
        if (previous == null){
            head = null;
        }else {
            previous.setNext(null);
        }
        count--;
        return finger.value();
    }

    @Override
    public E remove(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E set(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}