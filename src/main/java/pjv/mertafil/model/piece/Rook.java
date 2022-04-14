package pjv.mertafil.model.piece;

import pjv.mertafil.model.game.Color;

public class Rook extends Piece {
    public Rook(Color color) {
        super(color, 3);
    }

    @Override
    public String getSymbol() {
        return color == Color.WHITE ? "\u2656" : "\u265C";
    }

    @Override
    public Piece copy() {
        return new Rook(color);
    }
}
