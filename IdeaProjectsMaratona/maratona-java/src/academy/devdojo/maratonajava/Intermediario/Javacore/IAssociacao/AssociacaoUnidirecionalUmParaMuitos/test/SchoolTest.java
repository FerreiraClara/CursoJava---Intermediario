package academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.AssociacaoUnidirecionalMuitosParaUm.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.AssociacaoUnidirecionalUmParaMuitos.dominio.School;
import academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.AssociacaoUnidirecionalUmParaMuitos.dominio.Teacher;

public class SchoolTest {
    public static void main(String[] args) {
        School school01 = new School("UICMA");

        Teacher teacher01 = new Teacher("Maurício");
        Teacher teacher02 = new Teacher("William");
        Teacher teacher03 = new Teacher("Renata");
        Teacher teacher04 = new Teacher("Eduardo");
        Teacher teacher05 = new Teacher("Fernanda");

        Teacher[] teachersUICMA = {teacher01, teacher04};
        Teacher[] teachersSEI = {teacher02, teacher03, teacher05};

        School school02 = new School("SEI", teachersSEI);

        school01.setTeachers(teachersUICMA);

        school01.print();
        school02.print();
    }
}
