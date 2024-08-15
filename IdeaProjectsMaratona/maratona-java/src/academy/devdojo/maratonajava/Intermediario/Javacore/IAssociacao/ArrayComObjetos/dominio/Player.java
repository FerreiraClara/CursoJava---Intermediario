package academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.ArrayComObjetos.dominio;

public class Player {
    private String name;
    private int age;

    public Player(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("-------------");
        System.out.println(this.name);
        System.out.println("Idade: " + this.age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
