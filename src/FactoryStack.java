public class FactoryStack {
    public FactoryStack(){}
    public Stack createStack(String opcion){
        switch (opcion){
            case "1": return new PilaList(opcion);
            case "2": return new PilaList(opcion);
            case "3": return new PilaList(opcion);
            case "4": return new PilaArrayList();
            case "5": return new PilaVector();
            default:return null;
        }
    }
}
