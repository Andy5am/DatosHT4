/**
 * Esta es la interfaz de Stack
 * @author Andy Castillo 18040 y Cristina Bautista 161260
 * @version 15/02/2019
 * @param <E>
 */
public interface Stack<E>{
    /**
     * Metodo que agrega al stack
     * @param item
     */
    public void push(E item);

    /**
     * Metodo el cual al mas reciente elemento que se le dio push se remueve y se retorna
     * @return el elemento que se le hizo push
     */
    // pre:
    // post: item is added to stack
    // will be popped next if no intervening push
    public E pop();
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    public E peek();
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    public boolean empty();
    // post: returns true if and only if the stack is empty
    public int size();
    // post: returns the number of elements in the stack}
}