package academy.devdojo.maratonajava.Intermediario.Javacore.AIntroducaoClasses.test;


import academy.devdojo.maratonajava.Intermediario.Javacore.AIntroducaoClasses.dominio.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();         // variável de referência do tipo Student
        Student student2 = new Student();

        //outra forma de fazer
        academy.devdojo.maratonajava.Intermediario.Javacore.AIntroducaoClasses.dominio.Student student3 = new Student();


        //Inicializacão padrão

        System.out.println("Inicializacão padrão");

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);

        System.out.println("");

        //Acrescentando valores

        System.out.println("Valores acrescentados");

        student.name = "Luiz";
        student.age = 20;
        student.sex = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
        System.out.println(student);            // mostra o espaço de memória que foi armazenado

        System.out.println("");

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.sex);

        System.out.println("");

        student2.name = "Clara";
        student2.age = 19;
        student2.sex = 'F';

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.sex);

    }
}
