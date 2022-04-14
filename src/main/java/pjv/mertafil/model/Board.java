package pjv.mertafil.model;

import java.util.Optional;

import pjv.mertafil.model.move.Move;
import pjv.mertafil.model.piece.Piece;

public class Board {
    public final static short SIZE = 8;
    private final Piece[][] board;
    
    public Board() {
        this.board = new Piece[SIZE][SIZE];
    }

    public Optional<Piece> getPiece(Position position) {
        return Optional.ofNullable(board[position.x][position.y]);
    }

    public void makeMove(Move move) {
        removePiece(move.getFromPosition());
        placePiece(move.getPiece(), move.getToPosition());
    }

    public Optional<Piece> removePiece(Position position) {
        Optional<Piece> toRemove = getPiece(position);
        board[position.x][position.y] = null;
        return toRemove;
    }

    public void placePiece(Piece piece, Position position) {
        board[position.x][position.y] = piece;
    }
}
