package academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.ArrayComObjetos.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.ArrayComObjetos.dominio.Player;

public class PlayerTest {
    public static void main(String[] args) {
        Player player01 = new Player("Pelé");
        Player player02 = new Player("Romário");
        Player player03 = new Player("Cafu");

        Player[] players = {player01, player02, player03};
//      Player[] players = new Player[3];                       // teria q definir os valores dos espaços ainda
//      Player[] players = new Player[]{player01, player02, player03};

        player01.setAge(30);
        player02.setAge(43);
        player03.setAge(29);

        for (Player player : players) {
            player.print();
        }

        // O objeto passa a ter duas referências:
        player01.print();
        players[0].print();

    }
}
