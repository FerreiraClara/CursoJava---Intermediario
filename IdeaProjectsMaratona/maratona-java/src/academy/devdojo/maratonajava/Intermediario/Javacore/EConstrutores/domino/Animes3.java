package academy.devdojo.maratonajava.Intermediario.Javacore.EConstrutores.domino;

//USANDO A SOBRECARGA DE CONSTRUTORES
public class Animes3 {
    private String name;
    private String type;
    private int episodes;
    private String genre;

    public Animes3(String name, String type, int episodes, String genre){
        System.out.println("O Construtor é o primeiro a ser executado!!");
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.genre = genre;
    }

    public Animes3(){

    }

    public void printDate(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.genre);
    }
}
