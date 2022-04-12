package pjv.mertafil;

import javax.swing.SwingUtilities;

import pjv.mertafil.controller.GameController;

public class Mechess implements Runnable {
    public static void main( String[] args ) {
        SwingUtilities.invokeLater(new Mechess());
    }

    @Override
    public void run() {
        // GameController gameController = new GameController();
    }
}
