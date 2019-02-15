/**
 * Esta es la clase para que los usen SinglyLinkedList y CircularList
 * @author Andy Castillo 18040 y Cristina Bautista 161260
 * @version 15/02/2019
 * @param <E>
 */
public class Node<E>
{
    protected E data; // value stored in this element
    protected Node<E> nextElement; // ref to next

    /**
     * Este es el constructor de la clase
     * @param v
     * @param next
     */
    public Node(E v, Node<E> next)
    // pre: v is a value, next is a reference to
    //      remainder of list
    // post: an element is constructed as the new
    //      head of list
    {
        data = v;
        nextElement = next;
    }

    /**
     * Este metodo construue un nuevo final para lista con un valor que se guarda en la variable v
     * @param v
     */
    public Node(E v)
    // post: constructs a new tail of a list with value v
    {
        this(v,null);
    }

    /**
     * Este metodo es el que guarda el siguiente elemento de la lista
     * @return la referencia del siguiente elemento de la lista
     */
    public Node<E> next()
    // post: returns reference to next value in list
    {
        return nextElement;
    }

    /**
     * Este metodo es el que guarda el siguiente nuevo elemento en una variable
     * @param next
     */
    public void setNext(Node<E> next)
    // post: sets reference to new next value
    {
        nextElement = next;
    }

    /**
     * Este metodo esta asociado con el elemento y su valor
     * @return el valor del elemento
     */
    public E value()
    // post: returns value associated with this element
    {
        return data;
    }

    /**
     * Este metodo es el que guarda el valor asociado con su elemento
     * @param value
     */
    public void setValue(E value)
    // post: sets value associated with this element
    {
        data = value;
    }
}
