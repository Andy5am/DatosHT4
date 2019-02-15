/**
 * Clase abstracta de la lista, a las que las otras extiende, pero esta implementa la interfaz de list
 * @author Andy Castillo 18040 y Cristina Bautista 161260
 * @version 15/02/2019
 * @param <E>
 */
public abstract class AbstractList <E> implements List<E>
{
    /**
     * Es el constructor de la clase
     */
    public AbstractList ()
    // post: does nothing
    {
    }

    /**
     * Este metodo retorna verdadero si no se tiene elementos en la lista
     *
     * @return true si no hay elementos y si si hay entonces retorna false
     */
    public boolean isEmpty()
    // post: returns true iff list has no elements
    {
        return size() == 0;
    }

    /**
     * Este metodo retorna true si el objeto contiene algo igual a un valor
     *
     * @param value
     * @return -1 si no tiene index
     */
    public boolean contains(E value)
    // pre: value is not null
    // post: returns true iff list contains an object equal to value
    {
        return -1 != indexOf(value);
    }

    public abstract <T> T[] toArray(T[] a);
}