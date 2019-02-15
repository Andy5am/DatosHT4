import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Esta es la clase que contiene el metodo main con el cual hay una interaccion entre el usuario y el programa
 * @author Andy Castillo 18040 y Cristina Bautista 161260
 * @version 15/02/2019
 */
public class Main {

    /**
     * Este es el metodo con el cual el usuario juega-usa
     * @param args
     */
    public static void main (String args []) {

        //variable archivo que es un arreglo de strings
        ArrayList<String> archivo = new ArrayList();
        // para leer los archivos
        try {
            Stream<String> lines = Files.lines(
                    Paths.get(System.getProperty("user.dir") + "\\src\\datos.txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(a -> archivo.add(a));
        } catch (IOException e) {
            System.out.println("Error!");
        }
        // se crea una variable de tipo calculadora con singleton
        Calculator calculator = Calculator.getInstance();
        System.out.println("Que implementacion de Stack desea?");
        System.out.println("1. Lista doblemente encadenada\n2. Lista Simplemente encadenada\n" +
                "3.Lista circular\n4.ArrayList\n5.Vector");

        Scanner input = new Scanner(System.in);
        String opcion = input.nextLine();

        //se instancia el Factory para crear los stack
        FactoryStack factoryStack = new FactoryStack();

        Stack pila = factoryStack.createStack(opcion);

        //este for es para leer cada operacion
        for (int a = 0; a < archivo.size(); a++){
            String[] caracteres = archivo.get(a).split(" ");
            ArrayList<String> operacion = new ArrayList();
            //para separar caracteres de cada operacion
            for (int i =0; i<caracteres.length;i++){
                operacion.add(caracteres[i]);
            }
            //Para confirma que se imprima el resultado en caso de division entre 0
            boolean print = true;
            System.out.println(operacion);
            //Para evaluar cada caracteres
            for (int car = 0;car < operacion.size();car++){
                int num;
                String caracter = operacion.get(car);
                //Donde se compara entre numeros u operandos
                try {
                    //si es numero se agrega al stack
                    num = Integer.parseInt(caracter);
                    pila.push(num);
                }catch (Exception e ){
                    //Si no es espacio se sacan del stack para operar
                    if (!caracter.equals(" ")){
                        int num1 = (int) pila.pop();
                        int num2 = (int) pila.pop();

                        int resultado;
                        //si es division entre 0 no imprime resultado por el boolean anterior
                        if (caracter.equals("/") && num1 == 0){
                            print=!print;
                        }else {
                            //hace la operacion si esta bien y mete el resultado al stack
                            resultado = calculator.calculate(num2,num1,caracter);
                            pila.push(resultado);
                        }
                    }
                }
            }
            //Si no hubo division entre 0 se imprime el resultado
            if (print) {
                System.out.println("resultado: " + pila.pop());
            }else {
                System.out.println("ERROR. Division dentro de 0");
            }
        }
    }
}
