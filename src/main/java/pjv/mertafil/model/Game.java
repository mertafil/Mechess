package pjv.mertafil.model;

import java.util.ArrayList;
import java.util.List;

import pjv.mertafil.model.game.Color;
import pjv.mertafil.model.game.GameState;
import pjv.mertafil.model.move.Move;
import pjv.mertafil.model.player.Player;

public class Game {
    private final Player whitePlayer;
    private final Player blackPlayer;
    private final Board board;
    private List<Move> history;
    public Color onPlay;
    public GameState gameState;

    public Game(Player whitePlayer, Player blackPlayer) {
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
        this.board = new Board();
        this.history = new ArrayList<Move>();
        this.onPlay = Color.WHITE;
        this.gameState = GameState.IN_PROGRESS;
    }

    public void addMoveToHistory(Move move) {
        history.add(move);
    }

    public Player getWhitePlayer() {
        return whitePlayer;
    }

    public Player getBlackPlayer() {
        return blackPlayer;
    }

    public Board getBoard() {
        return board;
    }

    public List<Move> getHistory() {
        return history;
    }
}
