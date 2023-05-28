import javax.swing.*;
import java.awt.*;

public class Label {

    JLabel label = new JLabel();
    JTextArea textArea = new JTextArea();

    /**
     * tady konstruktor pro texty a objekty ostatních tříd
     */
    public Label() {
        label.setText("BRICK BREAKER");
        label.setForeground(Color.WHITE);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBounds(110, 35, 360, 115);
        label.setFont(new Font("Arial", Font.BOLD, 39));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setVisible(true);

        textArea.setText("Cílem hry je, zníčít všechny kostičky pomocí kuličky, kterou odrážíte pomocí desky." +
                "                                                                                                                       " +
                "Ovládání:" +
                "                                                                        " +
                "do leva -  A, šipka do leva                                               " +
                "do prava - D, šipka do prava");
        textArea.setForeground(Color.BLACK);
        textArea.setOpaque(true);
        textArea.setBounds(50, 100, 520, 300);
        textArea.setFont(new Font("Arial", Font.BOLD, 20));
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setVisible(true);


    }
}
