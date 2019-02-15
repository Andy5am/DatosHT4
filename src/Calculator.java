/**
 * Clase de calculadora es donde se definen las operaciones.
 * @author Andy Castillo 18040 y Cristina Bautista 161260
 * @version 15/02/2019
 */
public class Calculator {
    private static Calculator calculator;

    private Calculator(){}
    /**
     * Método calculate
     * recibe los numeros y efectua la operacion respectiva para cada operando.
     * @param num1 primer numero en la pila.
     * @param num2 segundo numero en la pila.
     * @param op operador recibido.
     * @return devuelve el resultado de la operación.
     */
    public int calculate(int num1, int num2, String op){
        //devuelve el resultado de la operacion que el susuario desea.
        if(op.equals("+")){
            return num1 + num2;
        }else if(op.equals("-")){
            return num1 - num2;
        }else if(op.equals("*")){
            return num1 * num2;
        }else {
            if (num2 != 0) {
                return num1 / num2;
            }else return num1+1;
        }
    }

    /**
     * Este metodo es para crear la instancia de la calculadora
     */
    private synchronized static void createInstance(){
        //Por si no hay una calculadora, se crea una nueva
        if (calculator == null){
            calculator = new Calculator();
        }
    }

    /**
     * Este metodo es para retornar la instancia de la calculadora
     * @return la instancia de la calculadora
     */
    public static Calculator getInstance(){
        //retorna la calculadora
        createInstance();
        return calculator;
    }

}
