package academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.Exercicio.dominio;

public class EmployeeSemEstarAbertoAErros {
    public String name;
    public int age;
    public double[] salary;

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


        /*
               NAO POSSO FAZER DIRETO ENGLOBANDO O OUTRO METODO NO IF PORQUE O METODO É PUBLICO E NAO PRIVADO

        } else {
            System.out.println("\nMédia Salarial: 0  -  Nenhum salário foi definido");
        }

        */
    }

    public void average(EmployeeSemEstarAbertoAErros employee) {
        if (salary != null) {

            double media = 0;

            for (double cont2 : salary) {
                media += cont2;
            }
            media /= salary.length;

            System.out.println("\nMédia Salarial: " + media);
        }else {
            System.out.println("\nMédia Salarial: 0  -  Nenhum salário foi definido");
        }
    }
}
