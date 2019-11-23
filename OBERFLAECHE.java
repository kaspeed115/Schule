import javax.swing.*;
import java.awt.*;


public class OBERFLAECHE 
{
    
    //Höhe des Anzeigefensters 
    private static final int hoeheFenster = 800;
    
    //Breite des Anzeigefensters 
    private static final int breiteFenster = 1000;
    
    
    
    //Einblenden eines Rasters zur Strukturierung der Kreuzung
    private static final int rasterGroesse = 20;
    
    //Umrechnung Meter in Pixel, für die Simulation der Autos  
    private static final float meter2pixel = 2.0f;
    
    JFrame fenster = null;
    private static OBERFLAECHE o = null;
    
    
    private static JLayeredPane pane;
 
        
    
    public OBERFLAECHE()
    {        
        fenster = new JFrame("Zeichenfläche");
        fenster.setSize(breiteFenster+10, hoeheFenster+40);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setVisible(true);
        fenster.setResizable(false); 
        fenster.setLayout(null);
        
        
        
        pane = new JLayeredPane();
        pane.setSize(new Dimension(breiteFenster, hoeheFenster));
        pane.setVisible(true);
        pane.setLocation(0,0);
        fenster.add(pane);
        
        
        
        
        //Erzeugen des Rasters als Hintergrundbild auf einem JPanel
        JPanel hintergrund = new JPanel(){
            
            public void paintComponent (Graphics g)
            {
                super.paintComponent(g);
                g. setColor (Color. lightGray);
                for (int i = 1; i <= hoeheFenster / (rasterGroesse * 2); i++)
                {
                    g. drawLine (0, hoeheFenster / 2 + i * rasterGroesse, breiteFenster - 1, hoeheFenster / 2 + i * rasterGroesse);
                    g. drawLine (0, hoeheFenster / 2 - i * rasterGroesse, breiteFenster - 1, hoeheFenster / 2 - i * rasterGroesse);
                }
                for (int i = 1; i <= breiteFenster / (rasterGroesse * 2); i++)
                {
                    g. drawLine (breiteFenster / 2 + i * rasterGroesse, 0, breiteFenster / 2 + i * rasterGroesse, hoeheFenster - 1);
                    g. drawLine (breiteFenster / 2 - i * rasterGroesse, 0, breiteFenster / 2 - i * rasterGroesse, hoeheFenster - 1);
                }
                g. setColor (Color. black);
                g. drawLine (0, hoeheFenster /2, breiteFenster - 1, hoeheFenster / 2);
                g. drawLine (breiteFenster / 2, 0, breiteFenster / 2, hoeheFenster - 1);
            }
        };
        
        pane.setLayout(null);
        hintergrund. setVisible (true);
        hintergrund.setOpaque(true);
        hintergrund. setSize (breiteFenster, hoeheFenster);
        hintergrund. setLocation (0, 0);
        hintergrund.repaint();
        
        pane.add(hintergrund,new Integer(JLayeredPane.DEFAULT_LAYER+1));
        fenster.add(pane);
        fenster.repaint();
     }
        
        
   /**
     * Gibt das Ausgabefenster zurück und erzeugt es gegebenenfalls.
     * @return Ausgabefenster
     */
    public static JLayeredPane FensterGeben ()
    {
     
        if (o == null)
        {
            o = new OBERFLAECHE ();
        }

        return o.pane;
    }

    /**
     * Gibt die Rastergr&ouml;&szlig;e zur&uuml;ck.
     * @return Ausgabefenster
     */
    public static int RasterGroesseGeben ()
    {
        return rasterGroesse;
    }

    /**
     * Gibt die Breite des Fensters zur&uuml;ck.
     * @return Fensterbreite
     */
    public static int FensterBreiteGeben ()
    {
        return breiteFenster;
    }

    /**
     * Gibt die H&ouml;he des Fensters zur&uuml;ck.
     * @return Fensterh&ouml;he
     */
    public static int FensterHoeheGeben ()
    {
        return hoeheFenster;
    }

    /**
     * Gibt die H&ouml;he des Fensters zur&uuml;ck.
     * @return Fensterh&ouml;he
     */
    public static float MeterAlsPixelGeben ()
    {
        return meter2pixel;
    }
     
    
    

    
    


}
