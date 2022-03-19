package sk.stuba.fei.uim.oop.player;

import sk.stuba.fei.uim.oop.card.actionCards.ActionCard;

import java.util.ArrayList;

public class Player {

    private String playerName;
    private int lives;
    private boolean alive;
    private ActionCard hand;


    public Player(String playerName){
        this.playerName = playerName;
        this.lives = 5;
        this.alive = true;
        this.hand = new ArrayList<>();
    }
}
