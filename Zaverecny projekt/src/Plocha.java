import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Plocha implements KeyListener {
    private int poziceX = 260;


    public void setPoziceX(int poziceX) {
        this.poziceX = poziceX;
    }

    public int getPoziceX() {
        return poziceX;
    }

    public Plocha() {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_D) {
            if (poziceX > 505) {
                poziceX = 525;
            } else {
                poziceX = poziceX + 25;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (poziceX > 505) {
                poziceX = 525;
            } else {
                poziceX = poziceX + 25;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            if (poziceX < 25) {
                poziceX = 0;
            } else {
                poziceX = poziceX - 25;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (poziceX < 25) {
                poziceX = 0;
            } else {
                poziceX = poziceX - 25;
            }
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }

}
