package academy.devdojo.maratonajava.Intermediario.Javacore.FBlocosDeInicializacao.dominio;

public class Anime2 {
    private String name;
    private int[] episodes;

    {
        episodes = new int[50];
        for (int cont = 0; cont < episodes.length; cont++){
            episodes[cont] = cont + 1;
        }
    }


    public Anime2(String name){
        this.name = name;
        System.out.println(this.name);
    }
    public Anime2() {
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
