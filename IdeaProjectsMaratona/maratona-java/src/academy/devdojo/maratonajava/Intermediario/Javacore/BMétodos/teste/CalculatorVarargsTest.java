package academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.teste;

import academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.dominio.CalculatorVarargs;

public class CalculatorVarargsTest {
    public static void main(String[] args) {        // poderia ser String... args
        CalculatorVarargs calculator = new CalculatorVarargs();
        int [] numbers = new int[3];
        int [] numbers2 = {10, 6, 9};

        numbers [0] = 10;
        numbers [1] = 6;
        numbers [2] = 8;

        calculator.sumArray(numbers);
        calculator.sumArray(numbers2);
        calculator.sumArray(new int [] {10, 7, 9});

        System.out.println("------");
        calculator.sumVarArgs(numbers);
        calculator.sumVarArgs(1, 2, 6, 9, 7);       // sem limite

        System.out.println("-------");
        calculator.sumVarArgs2(1,2,3,4,5,6,7,8);
    }
}
