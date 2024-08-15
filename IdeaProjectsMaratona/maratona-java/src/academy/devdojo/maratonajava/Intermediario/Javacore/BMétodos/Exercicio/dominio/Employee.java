package academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.Exercicio.dominio;

public class Employee {
    public String name;
    public int age;
    public double [] salary;

    public void printData(Employee employee){       // Employee employee, double [] salary
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        //System.out.println("Salario: " + this.salary);        -      Aparece o valor do espaço em memória

        for (double cont: salary) {
            System.out.println("Salário: " + cont);
        }

        average(employee);
    }
    public void printData2(Employee employee, double... salary){
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);

        for (double cont: salary) {
            System.out.println("Salário: " + cont);
        }
    }

    public void average(Employee employee){      //double [] salary
        double resultAverage = (salary [0] + salary [1] + salary [2]) / 3; // poderia ter feito igual fiz no average2
        System.out.println("Média Salarial: " + resultAverage);
    }

    public void average2(double... salary){
        double sum = 0;

        for (double cont2: salary) {
            sum += cont2;
        }
        double resultAverage = sum/ salary.length;

        System.out.println("Média Salarial: " + resultAverage);
    }
}
