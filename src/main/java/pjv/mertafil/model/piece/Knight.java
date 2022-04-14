package pjv.mertafil.model.piece;

import pjv.mertafil.model.game.Color;

public class Knight extends Piece {
    public Knight(Color color) {
        super(color, 3);
    }

    @Override
    public String getSymbol() {
        return color == Color.WHITE ? "\u2658" : "\u265E";
    }

    @Override
    public Piece copy() {
        return new Knight(color);
    }
}
