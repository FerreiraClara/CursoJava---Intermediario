package academy.devdojo.maratonajava.Intermediario.Javacore.JHerança.Protect.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.JHerança.Protect.dominio.Address;
import academy.devdojo.maratonajava.Intermediario.Javacore.JHerança.Protect.dominio.Employee;
import academy.devdojo.maratonajava.Intermediario.Javacore.JHerança.Protect.dominio.Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Address address = new Address();

        address.setName("Rua 3");
        address.setCep("28.570-000");

        person.setName("Clara");
        person.setCpf("15010659256");
        person.setAddress(address);

        person.print();

        Employee employee = new Employee();
        employee.setName("Miguel");
        employee.setCpf("14723655589");
        employee.setAddress(address);
        employee.setSalary(2500.00);

        System.out.println();
        employee.print();

    }
}
