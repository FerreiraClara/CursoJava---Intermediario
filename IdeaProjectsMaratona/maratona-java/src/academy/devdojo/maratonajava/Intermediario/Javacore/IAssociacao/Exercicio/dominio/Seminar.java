package academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.Exercicio.dominio;

public class Seminar {
    private String title;
    private Local local;
    private Student[] students;

    public Seminar(String title){
        this.title = title;
    }

    public Seminar(String title, Local local){
        this.title = title;
        this.local = local;
    }

    public Seminar(String title, Local local, Student[] students){
        this.title = title;
        this.local = local;
        this.students = students;
    }

    public void print(){
        System.out.println("Dados Seminário: ");
        System.out.println("    Título: " + this.title);
        System.out.println("    Local: " + this.local.getAddress());

        if(students != null){
            System.out.println("    Grupo Responsável: ");
            for (Student student : students) {
                System.out.println("    - " + student.getName());
            }

        } else {
            System.out.println("    Este seminário ainda não possui integrantes responsáveis!");
        }
        System.out.println("\n");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
