package ATM;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Animation extends Thread {

    JLabel label;
    int dir;

    public Animation(JLabel label, int direction) {
        this.label = label;
        this.dir = direction;
    }

    public void run() {

        for (int i = 0; i < 12; i++) {
            label.setLocation(label.getX(), label.getY() + dir * (i ^ 2));
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(ATMMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        label.setVisible(false);
    }
}

