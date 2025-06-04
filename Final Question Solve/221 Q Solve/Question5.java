package FInalQuestionSolve.Spring2022;

import java.util.ArrayList;
import java.util.Comparator;

class Player{
    int jersey;
    String name, type;

    public Player(int jersey, String name, String type){
        this.jersey = jersey;
        this.name = name;
        this.type = type;
    }
}

public class Question5 {
    public static void main(String[] args) {
        ArrayList<Player> list = new ArrayList<>();

        list.add(new Player(55, "Karim", "Bangladesh"));
        list.add(new Player(14, "Ponting", "Australia"));

        list.sort(new Comparator<Player>(){
            public int compare(Player p1, Player p2){
                return Integer.compare(p1.jersey, p2.jersey);
            }
        });
    }
}
