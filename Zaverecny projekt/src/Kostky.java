import java.awt.*;

public class Kostky {

    int[][] poleKostek = new int[5][8];
    public int tloustka = 60;
    public int vyska = 30;
    /**
     * 2D pole a proměné
     */
    private int pocetKostek = 5 * 8;

    /**
     * nastavení všeho v 2D poli na hodnotu 1
     */
    public Kostky() {
        for (int i = 0; i < poleKostek.length; i++) {
            for (int j = 0; j < poleKostek[0].length; j++) {
                poleKostek[i][j] = 1;
            }
        }
    }

    /**
     * metoda na vybarvení 2d pole
     */
    public void vymalovat(Graphics2D g) {
        for (int i = 0; i < poleKostek.length; i++) {
            for (int j = 0; j < poleKostek[0].length; j++) {
                if (poleKostek[i][j] > 0) {
                    g.setColor(Color.BLACK);
                    g.fillRect(j * tloustka + 55, i * vyska + 100, tloustka, vyska);
                    g.setStroke(new BasicStroke(2));
                    g.setColor(Color.WHITE);
                    g.drawRect(j * tloustka + 55, i * vyska + 100, tloustka, vyska);
                }
            }
        }
    }

    /**
     * metoda na změnu hodnoty kostiček z 1 na 0
     */
    public void metodaHodnotaKostky(int hodnotaKostky, int row, int col) {
        poleKostek[row][col] = hodnotaKostky;
    }


    public int getPocetKostek() {
        return pocetKostek;
    }

    /**
     * jen getter a setter
     */
    public void setPocetKostek(int pocetKostek) {
        this.pocetKostek = pocetKostek;
    }
}