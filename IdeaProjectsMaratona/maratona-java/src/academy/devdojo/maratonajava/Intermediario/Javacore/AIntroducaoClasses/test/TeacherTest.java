package academy.devdojo.maratonajava.Intermediario.Javacore.AIntroducaoClasses.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.AIntroducaoClasses.dominio.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.name = "Ronaldo";
        teacher.age = 30;
        teacher.sex = 'M';

        System.out.println(teacher.name + " " + teacher.age + " " + teacher.sex);
    }
}
