package academy.devdojo.maratonajava.Intermediario.Javacore.HBlocoDeInicializacaoStatic.dominio;

public class Anime {
    private String name;
    private static int[] episodes; // vai fazer parte da / pertencer à classe Anime
                                // todos os objetos criados terão,obrigatoriamente, a mesma quantidade de episodios

    static {
        System.out.println("Bloco de inicialização static 1");
        episodes = new int[50];
        for (int cont = 0; cont < episodes.length; cont++){
            episodes[cont] = cont + 1;
        }
    }

    {
        System.out.println("Bloco de inicialização nao estático no meio dos estaticos");
    }

    static {
        System.out.println("Bloco de inicialização static 2");
    }

    static {
        System.out.println("Bloco de inicialização static 3");
    }

    {
        System.out.println("Bloco de inicialização nao estático");
    }


    public Anime(String name){
        this.name = name;
        System.out.println(this.name);
    }
    public Anime() {
        for (int cont : Anime.episodes){
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
