package academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.dominio;

public class StudentParametersReferenceTypesUsingThis {
    public String name;
    public int age;
    public char sex;

    public void printStudent() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);
        System.out.println("");
    }

}
