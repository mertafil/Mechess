package pjv.mertafil.model.move;


import pjv.mertafil.model.piece.Piece;
import pjv.mertafil.model.Position;

public class Move {
    private final Piece piece;
    private final Position fromPosition;
    private final Position toPosition;
    
    public Move(Piece piece, Position fromPosition, Position toPosition) {
        this.piece = piece;
        this.fromPosition = fromPosition;
        this.toPosition = toPosition;
    }

    public Position getToPosition() {
        return toPosition;
    }

    public Position getFromPosition() {
        return fromPosition;
    }

    public Piece getPiece() {
        return piece;
    }
}
