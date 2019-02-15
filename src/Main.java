import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main (String args []) {

        ArrayList<String> archivo = new ArrayList<String>();
        try {
            Stream<String> lines = Files.lines(
                    Paths.get(System.getProperty("user.dir") + "\\src\\datos.txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(a -> archivo.add(a));
        } catch (IOException e) {
            System.out.println("Error!");
        }

        Calculator calculator = Calculator.getInstance();
        System.out.println("Que implementacion de Stack desea?");
        System.out.println("1. Lista doblemente encadenada\n2. Lista Simplemente encadenada\n" +
                "3.Lista circular\n4.ArrayList\n5.Vector");

        Scanner input = new Scanner(System.in);
        String opcion = input.nextLine();

        FactoryStack factoryStack = new FactoryStack();

        Stack pila = factoryStack.createStack(opcion);

        for (int a = 0; a < archivo.size(); a++){
            String[] caracteres = archivo.get(a).split(" ");
            ArrayList<String> operacion = new ArrayList();
            for (int i =0; i<caracteres.length;i++){
                operacion.add(caracteres[i]);
            }
            System.out.println(operacion);
            for (int car = 0;car < operacion.size();car++){
                int num;
                String caracter = operacion.get(car);
                try {
                    num = Integer.parseInt(caracter);
                    pila.push(num);
                }catch (Exception e ){
                    if (!caracter.equals(" ")){
                        int num1 = (int) pila.pop();

                        int num2 = (int) pila.pop();

                        int resultado = calculator.calculate(num2,num1,caracter);

                        /*if (resultado<0){
                            System.out.println("Division dentro de cero");
                            break;
                        }else {
                            pila.push(resultado);
                        }*/
                        pila.push(resultado);
                    }
                }
            }
            System.out.println("resultado: "+ pila.pop());

        }


    }
}
