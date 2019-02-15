import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SinglyLinkedList<E> extends AbstractList<E> {
    protected int count; //list size
    protected Node<E> head; //ref. to first element
    public SinglyLinkedList(){
        //post: generates an empty list
        head = null;
        count = 0;
    }
    public int size(){
        //post: return number of elements in list
        return count;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    public void addFirst(E value){
        //post: value is added to beginning of list
        //note order that things happen:
        //head is parameter, then assigned
        head = new Node<E> (value, head);
        count++;
    }
    public E removeList(){
        //pre: list is not empty
        //post: removes and returns value from beginning of list
        Node<E> temp = head;
        head = head.next();
        count --;
        return temp.value();
    }
    public E getFirst() {
        //pre: list is not empty
        //post: returns first value in list
        return head.value();
        }
    public void addLast(E value){
        //post: adds value to end of list
        //location for new value
        Node<E> temp = new Node<E>(value, null);
        if (head != null) {
            //pointer to possible tail
            Node<E> finger = head;
            while(finger.next() != null){
                finger = finger.next();
            }
            finger.setNext(temp);
        } else head = temp;
                 count ++;
    }
    public boolean contains(E value) {
        //pre: value is not null
        //post: returns true if value is found in list
        Node<E> finger = head;
        while (finger != null && !finger.value().equals(value)){
            finger = finger.next();
        }
        return finger != null;
    }
}