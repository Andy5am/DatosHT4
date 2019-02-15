/**
 * Esta clase crea stacks
 * @author Andy Castillo 18040 y Cristina Bautista 161260
 * @version 15/02/2019
 */
public class FactoryStack {
    /**
     * Es el constructor de la clase
     */
    public FactoryStack(){}

    /**
     * Este metodo crea las opciones de stacks que el usuario puede escogere
     * @param opcion
     * @return un stack
     */
    public Stack createStack(String opcion){
        switch (opcion){
            //dependiendo de lo que escoga el usuario creara su respectivo stack
            case "1": return new PilaList(opcion);
            case "2": return new PilaList(opcion);
            case "3": return new PilaList(opcion);
            case "4": return new PilaArrayList();
            case "5": return new PilaVector();
            default:return null;
        }
    }
}
