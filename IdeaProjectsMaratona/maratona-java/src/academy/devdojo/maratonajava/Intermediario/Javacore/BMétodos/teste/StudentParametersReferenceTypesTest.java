package academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.teste;

import academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.dominio.PrintStudents;
import academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.dominio.StudentParametersReferenceTypes;

public class StudentParametersReferenceTypesTest {
    public static void main(String[] args) {
        StudentParametersReferenceTypes student01 = new StudentParametersReferenceTypes();
        StudentParametersReferenceTypes student02 = new StudentParametersReferenceTypes();
        PrintStudents printer = new PrintStudents();

        student01.name = "Fernanda";
        student01.age = 16;
        student01.sex = 'F';

        student02.name = "Fabrício";
        student02.age = 23;
        student02.sex = 'M';


        printer.printStudent(student01);
        printer.printStudent(student02);
    }
}