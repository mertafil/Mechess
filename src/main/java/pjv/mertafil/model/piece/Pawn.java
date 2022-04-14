package pjv.mertafil.model.piece;

import pjv.mertafil.model.game.Color;

public class Pawn extends Piece {
    public Pawn(Color color) {
        super(color, 3);
    }

    @Override
    public String getSymbol() {
        return color == Color.WHITE ? "\u2659" : "\u265F";
    }

    @Override
    public Piece copy() {
        return new Pawn(color);
    }
}
