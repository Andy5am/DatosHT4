/**
 * Esta clase es el nodo para la lista doble encadenado de DoublyLinkedList
 * @author Andy Castillo 18040 y Cristina Bautista 161260
 * @version 15/02/2019
 * @param <E>
 */
public class DoublyLinkedNode<E>
{
    //parametros
    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;

    /**
     * Es el constructor de la clase
     *
     * @param v
     * @param next
     * @param previous
     */
    public DoublyLinkedNode(E v, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous)
    {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public DoublyLinkedNode(E v)
    // post: constructs a single element
    {
        this(v,null,null);
    }

    /**
     * Es el metodo que da referencia sobre el siguiente nuevo valor
     * @param e
     */
    public void setNext(DoublyLinkedNode<E> e)
    // post: sets reference to new next value
    {
        nextElement = e;
    }

    /**
     * Este es un metodo que regresa un dato
     * @return los datos que son un valor
     */
    public E value() {
        // regresa cualquier dato
        return data;
    }

    /**
     * Este metodo regrese el anterior elemento
     * @return el elemento anterior
     */
    public DoublyLinkedNode<E> previous() {
        // regresa el anterior elemento
        return previousElement;
    }

}
