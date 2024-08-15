package academy.devdojo.maratonajava.Intermediario.Javacore.JHerança.IntroducaoESuper.dominio;

public class Person {
    private String name;
    private String cpf;
    private Address address;

    public void print() {
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.address.getName() + " - " + this.address.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
