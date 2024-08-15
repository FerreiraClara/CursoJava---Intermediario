package academy.devdojo.maratonajava.Intermediario.Javacore.JHerança.IntroducaoESuper.dominio;

public class Employee extends Person{
    private double salary;

    public void print(){
        super.print();
        System.out.println("Salário: " + this.salary);
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
