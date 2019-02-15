import java.util.Iterator;

/**
 * Esta es la interfaz de List
 * @author Andy Castillo 18040 y Cristina Bautista 161260
 * @version 15/02/2019
 * @param <E>
 */
public interface List<E>{
    /**
     * Metodo que devuelve el NUMERO de elementos
     * @return numero de elementos
     */
    public int size();

    /**
     * Este metodo devuelve true o false si hay elementos en la lista
     * @return true si no tiene elementos o false si es que existen
     */
    // post: returns number of elements in list
    public boolean isEmpty();
    // post: returns true iff list has no elements
    public void clear();

    /**
     * Este es el metodo que agrega un elemento y lo coloca de primero en la lista
     * @param value
     */
    // post: empties list
    public void addFirst(E value);

    /**
     * Este es el metodo que agrega un elemento pero lo coloca de ultimo en la lista
     * @param value
     */
    // post: value is added to beginning of list
    public void addLast(E value);
    // post: value is added to end of list
    public E getFirst();

    /**
     * Este es el metodo que retorna el ultimo valor de la lista
     * @return el valor del ultimo elemento
     */
    // pre: list is not empty
    // post: returns first value in list
    public E getLast();
    // pre: list is not empty
    // post: returns last value in list
    public E removeFirst();

    /**
     * Este metodo remueve el ultimo valor de la lista
     * @return el ultimo valor
     */
    // pre: list is not empty
    // post: removes first value from list
    public E removeLast();
    // pre: list is not empty
    // post: removes last value from list
    public E remove(E value);
    // post: removes and returns element equal to value
    // otherwise returns null
    public void add(E value);
    // post: value is added to tail of list
    public E remove();
    // pre: list has at least one element
    // post: removes last value found in list
    public E get();
    // pre: list has at least one element
    // post: returns last value found in list
    public boolean contains(E value);

    /**
     * Este es el metodo que nuestra el indice del elemento si no hay -1
     * @param value
     * @return el indice del elemento deseado o -1 si no se encuentra el elemento
     */
    // pre: value is not null
    // post: returns true iff list contains an object equal to value
    public int indexOf(E value);
    // pre: value is not null
    // post: returns (0-origin) index of value,
    // or -1 if value is not found
    public int lastIndexOf(E value);
    // pre: value is not null
    // post: returns (0-origin) index of value,
    // or -1 if value is not found
    public E get(int i);
    // pre: 0 <= i < size()
    // post: returns object found at that location
    public E set(int i, E o);
    // pre: 0 <= i < size()
    // post: sets ith entry of list to value o;
    // returns old value
    public void add(int i, E o);
    // pre: 0 <= i <= size()
    // post: adds ith entry of list to value o
    public E remove(int i);
    // pre: 0 <= i < size()
    // post: removes and returns object found at that location
    public Iterator<E> iterator();
    // post: returns an iterator allowing
    // ordered traversal of elements in list
}