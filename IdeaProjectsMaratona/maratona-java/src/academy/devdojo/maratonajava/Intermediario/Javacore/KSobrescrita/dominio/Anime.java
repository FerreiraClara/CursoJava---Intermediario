package academy.devdojo.maratonajava.Intermediario.Javacore.KSobrescrita.dominio;

public class Anime {
    private String name;

    public Anime(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Anime: " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
