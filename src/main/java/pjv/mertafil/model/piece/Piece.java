package pjv.mertafil.model.piece;

import pjv.mertafil.model.game.Color;

public abstract class Piece {
    final protected Color color;
    final protected int value;

    public Piece(Color color, int value) {
        this.color = color;
        this.value = value;
    }

    public abstract String getSymbol();
    
    public abstract Piece copy();

    

    public Color getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }
}
