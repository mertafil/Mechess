package pjv.mertafil.model.piece;

import pjv.mertafil.model.game.Color;

public class Bishop extends Piece {
    public Bishop(Color color) {
        super(color, 3);
    }

    @Override
    public String getSymbol() {
        return color == Color.WHITE ? "\u2657" : "\u265D";
    }

    @Override
    public Piece copy() {
        return new Bishop(color);
    }
}
