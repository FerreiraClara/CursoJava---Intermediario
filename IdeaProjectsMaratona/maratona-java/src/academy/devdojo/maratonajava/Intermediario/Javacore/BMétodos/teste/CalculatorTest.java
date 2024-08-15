package academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.teste;

import academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.dominio.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Adição: ");
        calculator.sumOfTwoNumbers();
        System.out.println("");

        System.out.println("Subtração: ");
        calculator.subOfTwoNumbers();
        System.out.println("");

        int valor1 = 8;
        int num2 = 2;

        System.out.println("Multiplicação 1: ");
        calculator.multiplicationOfTwoNumbers(valor1, num2);

        System.out.println("Multiplicação 2: ");
        calculator.multiplicationOfTwoNumbers(10, 20.5F); //ao fazer isso, eu perdi o valor anterior que estava
        System.out.println("");                          // armazenado na multiplicationOfTwoNumbers

        System.out.println("Divisão 1: ");
        System.out.println(calculator.divisionOfTwoNumbers(valor1, num2));       //retorno sendo impresso
                                                                              // diretamente no console

        System.out.println("Divisão 2: ");
        int result = (int) calculator.divisionOfTwoNumbers(20, 0);             // relembrando uso do casting
        System.out.println(result);

        System.out.println("Divisão 3: ");
        calculator.divisionOfTwoNumbers3(20, 0);

        System.out.println("Divisão 4: ");
        calculator.divisionOfTwoNumbers3(20, 2);
    }
}