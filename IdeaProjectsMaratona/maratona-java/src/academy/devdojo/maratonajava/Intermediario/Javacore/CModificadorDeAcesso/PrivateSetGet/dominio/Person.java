package academy.devdojo.maratonajava.Intermediario.Javacore.CModificadorDeAcesso.PrivateSetGet.dominio;

public class Person {
    private String name;
    private int age;

    public void printDate(){
        System.out.println(getName());
        System.out.println(this.age);

        // não é aconselhável usar get para imprimir
        // this.nome e this.age têm que ser usados preferencialmente
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age < 0){
            System.out.println("Idade inválida");
            return;
        }
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
