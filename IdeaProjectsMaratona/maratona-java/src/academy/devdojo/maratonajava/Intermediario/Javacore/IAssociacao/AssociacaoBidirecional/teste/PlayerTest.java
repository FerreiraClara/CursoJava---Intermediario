package academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.AssociacaoBidirecional.teste;

import academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.AssociacaoBidirecional.dominio.Player;
import academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.AssociacaoBidirecional.dominio.Team;

public class PlayerTest {
    public static void main(String[] args) {
        Player player01 = new Player("Cafu");
        Player player02 = new Player("Pelé");
        Team team01 = new Team("Seleção Brasileira");

        Player[] playersBrasil = {player01, player02};

        player01.setTeam(team01);
        player02.setTeam(team01);
        team01.setPlayers(playersBrasil);

        System.out.println("--- Player ---");
        player01.print();
        player02.print();

        System.out.println("--- Time ---");
        team01.print();

    }
}
