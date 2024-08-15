package academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.AssociacaoUnidirecionalMuitosParaUm.AssociacaoUnidirecionalUmParaMuitos.test;


import academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.AssociacaoUnidirecionalMuitosParaUm.AssociacaoUnidirecionalUmParaMuitos.dominio.Player;
import academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.AssociacaoUnidirecionalMuitosParaUm.AssociacaoUnidirecionalUmParaMuitos.dominio.Team;

public class PlayerTest {
    public static void main(String[] args) {
        Player player01 = new Player("Pelé");
        Player player02 = new Player("Romário");

        Team team01 = new Team("Vasco");
        Team team02 = new Team("Fluminense");
        player01.setTeam(team01);


      Player[] players = new Player[]{player01, player02};

        for (Player player : players) {
            player.print();
        }


    }
}
