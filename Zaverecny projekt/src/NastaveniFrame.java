import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NastaveniFrame implements ActionListener {

    JFrame frame = new JFrame();
    Label l = new Label();
    Tlacitko t = new Tlacitko();

    /**
     * tady konstruktor pro frame a objekty ostatních tříd
     */
    public NastaveniFrame() {
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setLocationRelativeTo(null);
        frame.setFocusable(true);
        frame.setTitle("Brick breaker nastavení");
        frame.setResizable(false);
        frame.setLayout(null);
        frame.add(l.textArea);
        frame.add(t.tlacitko4);
        t.tlacitko4.addActionListener(this);
        frame.setVisible(true);
    }

    /**
     * metoda na zmáčknutí čudlíku, aby se spustilo hlavní menu
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == t.tlacitko4) {
            HlavniFrame hF = new HlavniFrame();
            frame.dispose();
        }
    }
}
