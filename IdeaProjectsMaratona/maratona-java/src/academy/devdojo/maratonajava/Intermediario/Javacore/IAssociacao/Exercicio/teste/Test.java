package academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.Exercicio.teste;

import academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.Exercicio.dominio.Local;
import academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.Exercicio.dominio.Seminar;
import academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.Exercicio.dominio.Student;
import academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.Exercicio.dominio.Teacher;

public class Test {
    public static void main(String[] args) {
        Local local01 = new Local("Rua das laranjeiras");

        Student student01 = new Student("Luffy", 17);
        Student student02 = new Student("Matheus", 18);
        Student student03 = new Student("Pedro", 16);

        Student student04 = new Student("Maria", 17);
        Student student05 = new Student("Fernanda", 18);
        Student student06 = new Student("Sara", 16);

//        Seminar seminar01 = new Seminar("Onde achar one piece", local01);

        Teacher teacher01 = new Teacher("Barba Branca", "Pirata");
        Teacher teacher02 = new Teacher("Maria Pena", "Pirata2");

//        Seminar seminar02 = new Seminar("Cultura Brasileira", local01);


//        Seminar[] groupSeminar01 = {seminar01, seminar02};

        Student[] groupBoys = {student01, student02, student03};
        Student[] groupGirls = {student04, student05, student06};


//        teacher01.setSeminars(groupSeminar01);
//        local01.setSeminar(groupSeminar01);
//        student01.setSeminar(seminar01);
//        student02.setSeminar(seminar01);
//        student03.setSeminar(seminar01);
//        student04.setSeminar(seminar02);
//        student05.setSeminar(seminar02);
//        student06.setSeminar(seminar02);
//        seminar01.setStudents(groupBoys);
//        seminar02.setStudents(groupGirls);


        teacher01.print();
        student01.print();
        student02.print();
        student03.print();
        student04.print();
        student05.print();
        student06.print();
//        seminar01.print();
//        seminar02.print();
        local01.print();

        teacher01.print2();

        System.out.println("");

        teacher02.print2();

    }
}
