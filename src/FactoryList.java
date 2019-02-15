/**
 * Esta clase que crea las listas
 * @author Andy Castillo 18040 y Cristina Bautista 161260
 * @version 15/02/2019
 */
public class FactoryList {
    /**
     * Es el constructor de la clase
     */
    //constructor
    public FactoryList(){}

    /**
     * Rs el metodo que crea la lista de opciones para crear las listas
     * @param opcion
     * @return la lista deseada por el usuario
     */
    // dependiendo de que escoga el usuario crea esa lista
    public List createList(String opcion){
        switch (opcion){
            case "1": return new DoublyLinkedList();
            case "2": return new SinglyLinkedList();
            case "3": return new CircularList();
            default:return null;
        }
    }
}
