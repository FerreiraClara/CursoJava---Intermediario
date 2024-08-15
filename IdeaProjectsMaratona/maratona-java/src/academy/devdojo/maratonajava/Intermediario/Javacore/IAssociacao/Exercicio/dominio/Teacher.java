package academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.Exercicio.dominio;

import academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.AssociacaoBidirecional.dominio.Team;

public class Teacher {
    public String name;
    public String specialty;
    public Seminar[] seminars;

    public Teacher(String name, String specialty){
        this.name = name;
        this.specialty = specialty;
    }

    public Teacher(String name, String specialty, Seminar[] seminars){
        this.name = name;
        this.specialty = specialty;
        this.seminars = seminars;
    }

    public void print(){
        System.out.println("Dados Professor: ");
        System.out.println("    Nome: " + this.name);
        System.out.println("    Especialidade: " + this.specialty);
        System.out.println("    Seminários: ");
        if(seminars != null){
            for (Seminar seminar: seminars) {
                System.out.println("    - " + seminar.getTitle());
            }

        } else {
            System.out.println("Não há seminários!");
        }
        System.out.println("\n");
    }

    public void print2(){
        System.out.println("Dados Professor: ");
        System.out.println("    Nome: " + this.name);
        System.out.println("    Especialidade: " + this.specialty);
        System.out.println("    Seminários: ");
        if(seminars != null){
            for (Seminar seminar: seminars) {
                System.out.println("    - " + seminar.getTitle());
                System.out.println("        - " + seminar.getLocal().getAddress());
                System.out.println("        - Integrantes do grupo: ");

                for (Student student : seminar.getStudents()) {
                    System.out.print("           -- " + student.getName());
                    System.out.println(" (Idade: " + student.getAge() + ")");

                }

            }

        } else {
            System.out.println("    - Não há seminários");
        }
        System.out.println("\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
