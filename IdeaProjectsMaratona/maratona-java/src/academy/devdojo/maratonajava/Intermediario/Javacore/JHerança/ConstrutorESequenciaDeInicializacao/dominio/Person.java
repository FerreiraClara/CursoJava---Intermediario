package academy.devdojo.maratonajava.Intermediario.Javacore.JHerança.ConstrutorESequenciaDeInicializacao.dominio;

public class Person {
    protected String name;
    protected String cpf;
    protected Address address;

    static {
        System.out.println("Dentro do bloco de inic. estatico de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inic. de Pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inic. de Pessoa 2");
    }

    public Person(String name){
        super(); // lembrando que a superclasse é o Object / chamada implicita
        this.name = name;
        System.out.println("Dentro do construtor de Pessoa(nome)");
    }

    public Person(String name, String cpf){
        this(name);
        this.cpf = cpf;
        System.out.println("Dentro do construtor de Pessoa(nome, cpf)");

    }

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
