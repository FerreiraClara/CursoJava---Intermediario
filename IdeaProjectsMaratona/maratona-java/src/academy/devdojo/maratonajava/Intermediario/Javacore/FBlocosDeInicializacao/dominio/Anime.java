package academy.devdojo.maratonajava.Intermediario.Javacore.FBlocosDeInicializacao.dominio;

public class Anime {
    private String name;
    private int[] episodes;

    public Anime(String name){
        this.name = name;
    }
    public Anime(){
        episodes = new int[50];
        for (int cont = 0; cont < episodes.length; cont++){
            episodes[cont] = cont + 1;
        }
        for (int cont : this.episodes){
            System.out.print(cont + " ");
        }
        System.out.println();
    }

    public String getName() {
        return this.name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
