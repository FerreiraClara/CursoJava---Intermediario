package academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.teste;

import academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.dominio.StudentParametersReferenceTypesUsingThis;

public class StudentParametersReferenceTypesUsingThisTest {
    public static void main(String[] args) {
        StudentParametersReferenceTypesUsingThis student01 = new StudentParametersReferenceTypesUsingThis();
        StudentParametersReferenceTypesUsingThis student02 = new StudentParametersReferenceTypesUsingThis();

        student01.name = "Fernanda";
        student01.age = 16;
        student01.sex = 'F';

        student02.name = "Fabrício";
        student02.age = 23;
        student02.sex = 'M';

        student01.printStudent();
        student02.printStudent();

    }
}