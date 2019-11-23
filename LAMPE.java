/*
 * Eine Lampe auf einem Fenster.
 * Das Fenster wird bei Bedarf generiert.
 * Das Koordinatensystem des Fensters ist ein Rastersystem mit Ursprung in der Mitte,
 * (0/0) bezeichnet das Feld rechts unterhalb des Ursprungs.
 * Die y-Achse zeigt nach unten
 */

import java.awt.*;
import javax.swing.*;

public class LAMPE
{
           
    /** Anzeigegröße für eine Lampe */
    private static final int groesse = OBERFLAECHE. RasterGroesseGeben ();

    JLayeredPane pane; 
    
    /** Interna */
    private static int radius = groesse / 4;
    private Farbe aktFarbe;
    private int x;
    private int y;
    private JPanel anzeige;

    /**
    * Standardkonstruktor für Objekte der Klasse LAMPE.
    * Er erzeugt eine scharze Lampe in der Zelle (0 / 0) des Fensters.
    * Das Fenster wird bei Bedarf angelegt.
    */
   
    public LAMPE ()
    {
        pane = OBERFLAECHE.FensterGeben();       
        anzeige = new JPanel () {
            // Stellt die Lampe auf dem Fenster dar.
            public void paint (Graphics g)
            {
                g. clearRect (0, 0, groesse, groesse);
                g. setColor (Color. black);
                g. drawRect (0, 0, groesse - 1, groesse - 1);
                g. setColor (aktFarbe. AWTFarbe ());
                g. fillOval (radius, radius, radius * 2, radius * 2);
                
            }

        };
        
        aktFarbe = Farbe. schwarz;
        anzeige. setVisible (true);
        anzeige. setSize (groesse, groesse);
        PositionSetzen (0, 0);
        //fenster.setLayout(null);
        //pane. add (anzeige);
                pane.add(anzeige,new Integer(JLayeredPane.DEFAULT_LAYER+100));
        Zeichne();
   }

    /**
     * Zeichnet die Lampe.
     */
    private void Zeichne ()
    {
        anzeige. invalidate ();
        anzeige. repaint ();
        pane.repaint();
    }

    /**
     * Setzt die Farbe der Lampe.
     * @param neueFarbe die neue Farbe der Lampe
     */
    public void FarbeSetzen (String neueFarbe)
    {
        try
        {
            aktFarbe = Farbe. valueOf (aktFarbe. getDeclaringClass (), neueFarbe);
        }
        catch (Exception e)
        {
            aktFarbe = Farbe. weiss;
        }
        Zeichne ();
    }

    /**
     * Setzt die Position der Lampe. Der Ursprung liegt in der Mitte des
     * Fensters, die y-Achse zeigt nach unten. (x /y) bedeutet das
     * K&auml;stchen rechts unterhalb der Gitterlinien.
     * @param x x-Position
     * @param y y-Position
     */
    public void PositionSetzen (int x, int y)
    {
        this. x = x;
        this. y = y;
        anzeige. setLocation (OBERFLAECHE. FensterBreiteGeben () / 2 + x * groesse, OBERFLAECHE. FensterHoeheGeben () / 2 + y * groesse);
        Zeichne();
    }
    
    
    
    
    
    
    
    private enum Farbe { weiss, schwarz, rot, gruen, blau, gelb, magenta, cyan, grau;

        /**
        * Konvertiert die angegebene Farbe in ihr AWT-Pendant.
        * @return die entsprechende AWT-Farbe
        */
        java.awt.Color AWTFarbe()
        {
            java.awt.Color farbe;
            switch(this)
            {
                case weiss:
                        farbe = java.awt.Color.white;
                        break;
                case schwarz:
                        farbe = java.awt.Color.black;
                        break;
                case rot:
                        farbe = java.awt.Color.red;
                        break;
                case gruen:
                        farbe = java.awt.Color.green;
                        break;
                case blau:
                        farbe = java.awt.Color.blue;
                        break;
                case gelb:
                        farbe = java.awt.Color.yellow;
                        break;
                case magenta:
                        farbe = java.awt.Color.magenta;
                        break;
                case cyan:
                        farbe = java.awt.Color.cyan;
                        break;
                case grau:
                        farbe = java.awt.Color.gray;
                        break;
                default:
                        farbe = java.awt.Color.white;
            }
            return farbe;
        }
    }
}
