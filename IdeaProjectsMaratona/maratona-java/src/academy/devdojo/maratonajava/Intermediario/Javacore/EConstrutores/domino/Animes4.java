package academy.devdojo.maratonajava.Intermediario.Javacore.EConstrutores.domino;

//USANDO A SOBRECARGA DE CONSTRUTORES PART2
public class Animes4 {
    private String name;
    private String type;
    private int episodes;
    private String genre;
    private String studio;

    public Animes4(String name, String type, int episodes, String genre){
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.genre = genre;
    }

    public Animes4(String name, String type, int episodes, String genre, String studio){
//        NAO É POSSÍVEL USAR A SINTAXE DA LINHA 20 EM UM MÉTODO, É APENAS PARA CONSTRUTORES
//        A LINHA QUE CHAMA OUTRO CONSTRUTOR (LINHA 20, POR EXEMPLO) PRECISA SER, OBRIGATÓRIAMENTE, A PRIMEIRA LINHA

        this(name, type, episodes, genre);
        this.studio = studio;
    }

    public Animes4(){
        System.out.println("Construtor sem argumentos");
    }

    public void printDate(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.genre);
        System.out.println(this.studio);
    }
}
