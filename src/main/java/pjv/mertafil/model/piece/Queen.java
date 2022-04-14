package pjv.mertafil.model.piece;

import pjv.mertafil.model.game.Color;

public class Queen extends Piece {
    public Queen(Color color) {
        super(color, 3);
    }

    @Override
    public String getSymbol() {
        return color == Color.WHITE ? "\u2655" : "\u265B";
    }

    @Override
    public Piece copy() {
        return new Queen(color);
    }
}
