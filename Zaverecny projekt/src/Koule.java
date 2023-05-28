import javax.swing.Timer;
import java.util.Random;

public class Koule {

    private Timer casovac;
    private int zpozdeni = 5;

    Random r = new Random();
    /**
     * proměnný a  random aby nebyla každá hra stejná tak se mění rychlost koule a také začátečnická pozice koule
     */
    private int poziceX = r.nextInt(400) + 100;
    private int poziceY = r.nextInt(200) + 400;

    private int smerX = r.nextInt(3) - 3;

    private int smerY = r.nextInt(3) - 3;

    /**
     * když je směr koule 0 tak se nehejbe takže proto kdyžtak změněna na 1
     */
    public Koule() {
        if (smerX == 0) {
            smerX = 1;
        }
    }

    /**
     * gettery a settery
     */
    public int getPoziceX() {
        return poziceX;
    }

    public void setPoziceX(int poziceX) {
        this.poziceX = poziceX;
    }

    public int getPoziceY() {
        return poziceY;
    }

    public void setPoziceY(int poziceY) {
        this.poziceY = poziceY;
    }

    public int getSmerX() {
        return smerX;
    }

    public void setSmerX(int smerX) {
        this.smerX = smerX;
    }

    public int getSmerY() {
        return smerY;
    }

    public void setSmerY(int smerY) {
        this.smerY = smerY;
    }

    public Timer getCasovac() {
        return casovac;
    }

    public void setCasovac(Timer casovac) {
        this.casovac = casovac;
    }

    public int getZpozdeni() {
        return zpozdeni;
    }

    public void setZpozdeni(int zpozdeni) {
        this.zpozdeni = zpozdeni;
    }
}
