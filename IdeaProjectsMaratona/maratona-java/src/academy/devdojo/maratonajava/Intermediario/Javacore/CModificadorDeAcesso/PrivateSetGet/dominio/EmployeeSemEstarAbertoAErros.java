package academy.devdojo.maratonajava.Intermediario.Javacore.CModificadorDeAcesso.PrivateSetGet.dominio;

public class EmployeeSemEstarAbertoAErros {
    private String name;
    private int age;
    private double[] salary;
    private double average;

    public void printData(EmployeeSemEstarAbertoAErros employee) {
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);

        if (salary != null) {
            System.out.print("Salários: ");
            for (double cont : salary) {
                System.out.print(cont + "  ");
            }
        }
        average(employee);
    }

    private void average(EmployeeSemEstarAbertoAErros employee) {
        if (salary != null) {

            for (double cont : salary) {
                this.average += cont;
            }
            this.average /= salary.length;

            System.out.println("\nMédia Salarial: " + average);
        } else {
            System.out.println("\nMédia Salarial: 0  -  Nenhum salário foi definido");
        }
    }

    // alt + insert para criar os gets e os sets automaticamente


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalary() {
        return salary;
    }

    public double getMedia() {
        return average;
    }
}
