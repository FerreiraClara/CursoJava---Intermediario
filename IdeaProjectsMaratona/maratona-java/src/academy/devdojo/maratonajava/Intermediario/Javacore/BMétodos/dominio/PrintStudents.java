package academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.dominio;

// não precisou importar o StudentParametersReferenceTypes pois está no mesmo pacote que o PrintStudents
public class PrintStudents {
    public void printStudent(StudentParametersReferenceTypes student){
        //student.name = "Clara";                -  Fabrício e Fernanda vão ficar perdidos na memória (sem recuperação)
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
        System.out.println("");
        /*student.name = "Clara";                -  Fabrício e Fernanda vão ser impressos, porém se eu imprimir de novo,
                                                  os valores Fabrício e Fernanda ficarão perdidos na memória e ambos
                                                  passarão a valer "Clara"
         */

    }
}
