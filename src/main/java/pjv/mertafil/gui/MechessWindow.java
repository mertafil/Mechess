package pjv.mertafil.gui;

import javax.swing.JFrame;

public class MechessWindow {
    private static MechessWindow singleInstance;
    public JFrame window;

    private MechessWindow() {
        window = new JFrame("Mechess");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1280, 720);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public static MechessWindow getWindow() {
        if (singleInstance == null) {
            singleInstance = new MechessWindow();
        }
        
        return singleInstance;
    }
}
