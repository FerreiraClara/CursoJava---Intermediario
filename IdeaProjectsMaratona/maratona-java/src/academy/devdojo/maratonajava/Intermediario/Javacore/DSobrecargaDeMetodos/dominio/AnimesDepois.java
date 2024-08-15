package academy.devdojo.maratonajava.Intermediario.Javacore.DSobrecargaDeMetodos.dominio;

public class AnimesDepois {
    private String name;
    private String type;
    private int episodes;
    private String genre;

    public void printDate(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.genre);
    }

    public void start(String name, String type, int episodes){
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

//    Ao modificar o codigo e acrescentar o genero, é preciso ou acrescentar o metodo através do set e get ou
//    criar um novo método porque se eu acrescentar o genero no metodo acima, vai quebrar o codigo e caso
//    o codigo seja tenha muitas linhas, vai dar ruim!

    public void start(String name, String type, int episodes, String genre){
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.genre = genre;
    }

/*    outra forma de fazer...

    public void start(String name, String type, int episodes, String genre){
        this.start(name, type, episodes);
        this.genre = genre;
    }

 */
}
