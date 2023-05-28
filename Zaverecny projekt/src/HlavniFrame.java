import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HlavniFrame implements ActionListener {
    JFrame frame = new JFrame();
    Label l = new Label();
    Tlacitko t = new Tlacitko();

    /**
     * tady konstruktor pro frame a objekty ostatních tříd
     */
    public HlavniFrame() {
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setLocationRelativeTo(null);
        frame.setFocusable(true);
        frame.setTitle("Brick breaker");
        frame.setResizable(false);
        frame.setLayout(null);
        frame.add(l.label);
        frame.add(t.tlacitko);
        frame.add(t.tlacitko2);
        frame.add(t.tlacitko3);
        t.tlacitko3.addActionListener(this);
        t.tlacitko2.addActionListener(this);
        t.tlacitko.addActionListener(this);
        frame.setVisible(true);
    }

    /**
     * metoda na všechny čudlíky co jsou v hlavním menu
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == t.tlacitko3) {
            frame.dispose();
        } else if (e.getSource() == t.tlacitko2) {
            NastaveniFrame nF = new NastaveniFrame();
            frame.dispose();
        } else if (e.getSource() == t.tlacitko) {
            HraFrame hF = new HraFrame();
            frame.dispose();
        }
    }
}
