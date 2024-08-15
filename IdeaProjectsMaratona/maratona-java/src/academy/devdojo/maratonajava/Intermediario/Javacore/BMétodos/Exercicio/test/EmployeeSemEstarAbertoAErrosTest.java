package academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.Exercicio.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.Exercicio.dominio.EmployeeSemEstarAbertoAErros;

public class EmployeeSemEstarAbertoAErrosTest {
    public static void main(String[] args) {
        EmployeeSemEstarAbertoAErros employee01 = new EmployeeSemEstarAbertoAErros();

        employee01.name = "Clara";
        employee01.age = 18;
        employee01.salary = new double [] {1200, 987.32, 2000};

        employee01.printData(employee01);


    }
}