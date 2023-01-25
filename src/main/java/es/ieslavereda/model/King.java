package es.ieslavereda.model;

import es.ieslavereda.tad.Lista;

public abstract class King extends Piece{

    private boolean moved;

    public King(PieceType shape, Cell cell) {
        super(shape, cell);
        moved=false;
    }

    public boolean isMoved() {
        return moved;
    }

    @Override
    public Lista getNextMovements() {
        return new Lista();
    }
}
