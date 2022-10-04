package org.example;

import java.util.Arrays;
import java.util.List;

public class PlayerService {
    private List<Player> player = Arrays.asList(new Player(1, "Aditya", "Indian", 23),
            new Player(1, "Adesh", "Indian", 19),
            new Player(1, "Gourav", "Indian", 26),
            new Player(1, "Varun", "Indian", 20));

    public Player getPlayerByName(String name) {
        return player.stream().filter(s->s.getName().equals(name)).findFirst().get();
    }

    public Player getPlayerById(int id) {
        return player.stream().filter(s->s.getId()==id).findFirst().get();
    }
}


