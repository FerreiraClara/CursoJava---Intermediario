package academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.AssociacaoUnidirecionalMuitosParaUm.AssociacaoUnidirecionalUmParaMuitos.dominio;

public class Player {
    private String name;
    private Team team;

    public Player(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("-------------");
        System.out.println(this.name);
        if (team != null){
            System.out.println(team.getName());
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
