import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Panel extends JPanel implements ActionListener {

    Koule kou = new Koule();
    Plocha p = new Plocha();
    Label l = new Label();

    private Kostky poleKostek;

    /**
     * tady konstruktor pro panel a objekty ostatních tříd
     */

    public Panel() {
        setFocusable(true);
        this.addKeyListener(p);
        //Timer dělá to že za jak dlouhou dobu v milisekundách provede tu činost v tomhle případě hýbání s míčkem
        kou.setCasovac(new Timer(kou.getZpozdeni(), this));
        kou.getCasovac().start();
        poleKostek = new Kostky();

    }

    /**
     * metoda paint která vykresluje do framu věci co zadávám
     */
    public void paint(Graphics g) {
        /**
         * tohle je na vybarvení celého framu, aby třeba za kuličkou nezůstávala čára
         */
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 600, 700);

/**
 * vybarvení kuličky
 */
        g.setColor(Color.GREEN);
        g.fillOval(kou.getPoziceX(), kou.getPoziceY(), 20, 20);
/**
 *vybarvení odrazové desky
 */
        g.setColor(Color.BLUE);
        g.fillRect(p.getPoziceX(), 600, 60, 10);
/**
 * vyspsání bodů na obrazovku
 */
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 15));
        g.drawString("Body: " + body, 30, 630);
/**
 *vymalování kostiček a mezer mezi nimi
 */
        poleKostek.vymalovat((Graphics2D) g);
        /**
         *vypsání konce hry, když prohrajete
         */
        if (kou.getPoziceY() >= 640) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("KONEC HRY", 170, 335);
        }
        /**
         *vypsání výhry, když vyhrajete
         */
        if (poleKostek.getPocetKostek() <= 0) {
            g.setColor(Color.ORANGE);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("Vyhrál jsi", 185, 335);
        }
        /**
         * dispose se píše když už nepracujete s Graphics
         */
        g.dispose();

    }

    /**
     * nějaký proměnný pro další využití
     */
    private int poziceXKostky;
    private int poziceYKostky;
    private int body = 0;

    /**
     * metoda pro snímání klávesnice
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        /**
         *tímhle to všechno žačne bežet třeba ta kulička se začne používat
         */
        kou.getCasovac().start();
        repaint();
/**
 *pochyb kuličky
 */
        kou.setPoziceX(kou.getPoziceX() + kou.getSmerX());
        kou.setPoziceY(kou.getPoziceY() + kou.getSmerY());

        /**
         *zmeny směru kuličky při nárazu do stěny a ukončení hry při nárazu do spodku
         */
        if (kou.getPoziceY() <= 0) {
            kou.setSmerY(-kou.getSmerY());
        } else if (kou.getPoziceY() >= 640) {
            kou.getCasovac().stop();
        } else if (kou.getPoziceX() <= 0) {
            kou.setSmerX(-kou.getSmerX());
        } else if (kou.getPoziceX() >= 565) {
            kou.setSmerX(-kou.getSmerX());

            /**
             *změna směru kuličky při nárazu do odrážecí desky
             */
        } else if (new Rectangle(kou.getPoziceX(), kou.getPoziceY(), 20, 20).intersects(new Rectangle(p.getPoziceX(), 600, 60, 10))) {
            kou.setSmerY(-kou.getSmerY());
        }
        /**
         *tohle je pro odrážení kuličky od kostiček a také jejich mazání
         * funguje to tak, že když kuličky narazí do kostičky, tak se hodnota kostičky
         * změní na 0 a poté zmizí
         */
        for (int i = 0; i < poleKostek.poleKostek.length; i++) {
            for (int o = 0; o < poleKostek.poleKostek[0].length; o++) {
                if (poleKostek.poleKostek[i][o] > 0) {
                    poziceYKostky = i * poleKostek.vyska + 100;
                    poziceXKostky = o * poleKostek.tloustka + 55;
/**
 *tady je jen když se koule dotkne kostky tak že se změní ta hodnota přičtou se body a celkový počet kostek se zmeněí o 1
 */
                    if (new Rectangle(poziceXKostky, poziceYKostky, poleKostek.tloustka, poleKostek.vyska).intersects(new Rectangle(kou.getPoziceX(), kou.getPoziceY(), 20, 20))) {
                        poleKostek.metodaHodnotaKostky(0, i, o);
                        body++;
                        poleKostek.setPocetKostek(poleKostek.getPocetKostek() - 1);
/**
 * tohle fungje tak že když se kulička dotkne kostičky a její bod x který je vlevo na kostičce nedotkne kostičky tak je jasné že je potřeba změnit směr x a pak se změní
 */
                        if (kou.getPoziceX() + 19 <= poziceXKostky || kou.getPoziceX() + 1 >= poziceXKostky + poleKostek.tloustka) {
                            kou.setSmerX(-kou.getSmerX());
                        } else {
                            kou.setSmerY(-kou.getSmerY());
                        }
                    }
                }
            }
        }
/**
 *když je 0 kostiček zastaví se hra
 */
        if (poleKostek.getPocetKostek() <= 0) {
            kou.getCasovac().stop();

        }
    }


}
