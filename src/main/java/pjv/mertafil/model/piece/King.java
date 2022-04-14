package pjv.mertafil.model.piece;

import pjv.mertafil.model.game.Color;

public class King extends Piece {
    public King(Color color) {
        super(color, 3);
    }

    @Override
    public String getSymbol() {
        return color == Color.WHITE ? "\u2654" : "\u265A";
    }

    @Override
    public Piece copy() {
        return new King(color);
    }
}
