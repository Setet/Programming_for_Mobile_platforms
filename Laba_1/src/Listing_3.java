import java.awt.*;
import java.awt.event.*;

public class Listing_3 extends Frame {
    Listing_3(String s) {
        super(s);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 30));
        g.drawString("ZA WARDO!!!!", 20, 100);
    }

    public static void main(String[] args) {
        Frame f = new Listing_3("Bebra");
        f.setSize(400, 150);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }
}
