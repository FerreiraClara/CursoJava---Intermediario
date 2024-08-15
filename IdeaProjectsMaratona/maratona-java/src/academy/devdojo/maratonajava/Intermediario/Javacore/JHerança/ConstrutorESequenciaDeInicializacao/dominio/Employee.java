package academy.devdojo.maratonajava.Intermediario.Javacore.JHerança.ConstrutorESequenciaDeInicializacao.dominio;

public class Employee extends Person {
    private double salary;

    static {
        System.out.println("Dentro do bloco de inic. estatico de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inic. de Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inic. de Funcionario 2");
    }

    public Employee(String name){
        super(name);
        System.out.println("Dentro do construtor de Funcionario(nome)");

    }

    public Employee(String name, String cpf){
        super(name, cpf);
        System.out.println("Dentro do construtor de Funcionario(nome, cpf)");

    }

    public void print(){
        super.print();
        System.out.println("Salário: " + this.salary);
    }
    public void paymentReport(){
        System.out.println("Eu, " + this.name + ", recebi o salário de R$ " + this.salary);
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
