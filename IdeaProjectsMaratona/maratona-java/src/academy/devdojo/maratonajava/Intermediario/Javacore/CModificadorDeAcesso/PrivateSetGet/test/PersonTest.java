package academy.devdojo.maratonajava.Intermediario.Javacore.CModificadorDeAcesso.PrivateSetGet.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.CModificadorDeAcesso.PrivateSetGet.dominio.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Jiraya");
        person.setAge(19);

        System.out.println("Usando o método printDate: ");
        person.printDate();

        System.out.println("Usando o método get: ");
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
