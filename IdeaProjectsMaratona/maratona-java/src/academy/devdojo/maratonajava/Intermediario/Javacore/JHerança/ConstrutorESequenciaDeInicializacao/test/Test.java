package academy.devdojo.maratonajava.Intermediario.Javacore.JHerança.ConstrutorESequenciaDeInicializacao.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.JHerança.ConstrutorESequenciaDeInicializacao.dominio.Address;
import academy.devdojo.maratonajava.Intermediario.Javacore.JHerança.ConstrutorESequenciaDeInicializacao.dominio.Employee;
import academy.devdojo.maratonajava.Intermediario.Javacore.JHerança.ConstrutorESequenciaDeInicializacao.dominio.Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Clara");
        Address address = new Address();

        address.setName("Rua 3");
        address.setCep("28.570-000");

        person.setCpf("15010659256");
        person.setAddress(address);

        System.out.println();
        person.print();

        Employee employee = new Employee("Miguel");
        employee.setCpf("14723655589");
        employee.setAddress(address);
        employee.setSalary(2500.00);

        System.out.println();
        employee.print();

    }
}
