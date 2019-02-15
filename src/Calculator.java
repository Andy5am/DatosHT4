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
            }else return -1;
        }
    }

    private synchronized static void createInstance(){
        if (calculator == null){
            calculator = new Calculator();
        }
    }

    public static Calculator getInstance(){
        createInstance();
        return calculator;
    }

}
