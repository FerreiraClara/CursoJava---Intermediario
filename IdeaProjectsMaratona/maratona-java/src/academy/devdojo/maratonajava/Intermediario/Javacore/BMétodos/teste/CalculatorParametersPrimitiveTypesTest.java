package academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.teste;

import academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.dominio.CalculatorParametersPrimitiveTypes;

public class CalculatorParametersPrimitiveTypesTest {
    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 2;
        CalculatorParametersPrimitiveTypes calculator = new CalculatorParametersPrimitiveTypes();

        calculator.alterTwoNumbers(value1,value2);

        System.out.println("");
        System.out.println("Dentro CalculatorParametersPrimitiveTypesTest: ");
        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
    }
}
