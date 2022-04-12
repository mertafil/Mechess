package pjv.mertafil.model.game;

import pjv.mertafil.model.players.Player;

public class GameSetup {
    private final Player whitePlayer;
    private final Player blackPlayer;

    public GameSetup(Player whitePlayer, Player blackPlayer) {
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
    }

    public Player getWhitePlayer() {
        return whitePlayer;
    }
    
    public Player getBlackPlayer() {
        return blackPlayer;
    }
}
