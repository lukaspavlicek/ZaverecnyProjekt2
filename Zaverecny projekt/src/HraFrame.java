import javax.swing.*;

public class HraFrame {
    JFrame frame = new JFrame();
    Label l = new Label();
    Panel p = new Panel();

    /**
     * tady konstruktor framu s hrou a objekty ostatních tříd
     */

    public HraFrame() {
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Brick breaker");
        frame.setResizable(false);
        frame.add(p);
        frame.setVisible(true);

    }

}