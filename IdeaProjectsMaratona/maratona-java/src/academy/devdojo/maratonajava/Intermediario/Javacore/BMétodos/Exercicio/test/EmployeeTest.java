package academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.Exercicio.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.Exercicio.dominio.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee01 = new Employee();

        employee01.name = "Clara";
        employee01.age = 18;
        employee01.salary = new double [] {1200, 987.32, 2000};

        System.out.println("Impressão 'com Array': \n");
        employee01.printData(employee01);
        //employee01.average(employee01);       -   o metodo foi chamado dentro do print

        System.out.println("----------");

        System.out.println("Impressão com VarArgs: \n");
        employee01.printData2(employee01, 1500, 1750, 1980);
        employee01.average2(1500, 1750, 1980);

    }
}
