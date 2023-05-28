import javax.swing.*;
import java.awt.*;


public class Tlacitko {

    JButton tlacitko = new JButton();
    JButton tlacitko2 = new JButton();
    JButton tlacitko3 = new JButton();
    JButton tlacitko4 = new JButton();

    /**
     * tady konstruktor pro tlačitka a objekty ostatních tříd
     */
    public Tlacitko() {
        tlacitko.setText("Hrát");
        tlacitko.setForeground(Color.WHITE);
        tlacitko.setBackground(Color.BLACK);
        tlacitko.setBounds(140, 200, 300, 100);
        tlacitko.setFont(new Font("Arial", Font.BOLD, 40));
        tlacitko.setFocusable(false);
        tlacitko.setVisible(true);

        tlacitko2.setText("Pravidla");
        tlacitko2.setForeground(Color.WHITE);
        tlacitko2.setBackground(Color.BLACK);
        tlacitko2.setBounds(140, 350, 300, 100);
        tlacitko2.setFont(new Font("Arial", Font.BOLD, 40));
        tlacitko2.setFocusable(false);
        tlacitko2.setVisible(true);

        tlacitko3.setText("Konec");
        tlacitko3.setForeground(Color.WHITE);
        tlacitko3.setBackground(Color.BLACK);
        tlacitko3.setBounds(140, 500, 300, 100);
        tlacitko3.setFont(new Font("Arial", Font.BOLD, 40));
        tlacitko3.setFocusable(false);
        tlacitko3.setVisible(true);

        tlacitko4.setText("Zpět");
        tlacitko4.setForeground(Color.BLACK);
        tlacitko4.setBounds(140, 500, 300, 100);
        tlacitko4.setFont(new Font("Arial", Font.BOLD, 40));
        tlacitko4.setFocusable(false);
        tlacitko4.setVisible(true);
    }


}