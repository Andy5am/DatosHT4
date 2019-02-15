public class FactoryList {
    public FactoryList(){}
    public List createList(String opcion){
        switch (opcion){
            case "1": return new DoublyLinkedList();
            case "2": return new SinglyLinkedList();
            case "3": return new CircularList();
            default:return null;
        }
    }
}
