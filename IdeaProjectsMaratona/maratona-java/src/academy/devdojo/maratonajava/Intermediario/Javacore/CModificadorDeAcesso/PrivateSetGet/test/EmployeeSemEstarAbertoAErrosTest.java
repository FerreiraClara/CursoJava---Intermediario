package academy.devdojo.maratonajava.Intermediario.Javacore.CModificadorDeAcesso.PrivateSetGet.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.CModificadorDeAcesso.PrivateSetGet.dominio.EmployeeSemEstarAbertoAErros;

public class EmployeeSemEstarAbertoAErrosTest {
    public static void main(String[] args) {
        EmployeeSemEstarAbertoAErros employee01 = new EmployeeSemEstarAbertoAErros();

        employee01.setName("Akame");
        employee01.setAge(19);
        employee01.setSalary(new double[]{1200, 987.32, 2000});

        employee01.printData(employee01);


    }
}