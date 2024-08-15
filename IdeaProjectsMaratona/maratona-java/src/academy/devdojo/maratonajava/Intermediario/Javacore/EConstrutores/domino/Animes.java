package academy.devdojo.maratonajava.Intermediario.Javacore.EConstrutores.domino;

//O NOME É PASSADO OBRIGATORIAMENTE PELO CONSTRUTOR
public class Animes {
    private String name;
    private String type;
    private int episodes;
    private String genre;

    public Animes(String name){
        System.out.println("O Construtor é o primeiro a ser executado!!");
        this.name = name;
    }

    public void printDate(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.genre);
    }

//    Se eu usar String name como parametro, irá sobrescrever o nome definido pelo construtor
    public void start(String type, int episodes){
        this.type = type;
        this.episodes = episodes;
    }

    public void start(String type, int episodes, String genre){
        this.start(type, episodes);
        this.genre = genre;
    }
}
