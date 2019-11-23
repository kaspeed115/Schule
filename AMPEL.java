
/**
 * Write a description of class AMPEL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class AMPEL
{
   
    LAMPE lOben;
    LAMPE lMitte;
    LAMPE lUnten;
    String ampelphase;
    int posX;
    int posY;
    char ausrichtung;
    AMPEL()
    {
        lOben = new LAMPE();
        lMitte = new LAMPE();
        lUnten = new LAMPE();
        lOben.PositionSetzen(0,0);
        lMitte.PositionSetzen(0,1);
        lUnten.PositionSetzen(0,2);
        lOben.FarbeSetzen("rot");
        lMitte.FarbeSetzen("schwarz");
        lUnten.FarbeSetzen("schwarz");
        ampelphase = "rot";
        ausrichtung = 'S';
        }
    void RotSetzen()
    {
        lOben.FarbeSetzen("rot");
        lMitte.FarbeSetzen("schwarz");
        lUnten.FarbeSetzen("schwarz");
        ampelphase = "rot";
    }
    
    void RotgelbSetzen()
    {
        lOben.FarbeSetzen("rot");
        lMitte.FarbeSetzen("gelb");
        lUnten.FarbeSetzen("schwarz");
        ampelphase = "rotgelb";
    }
    
    void GruenSetzen()
    {
        lOben.FarbeSetzen("schwarz");
        lMitte.FarbeSetzen("schwarz");
        lUnten.FarbeSetzen("gruen");
        ampelphase = "gruen";
    }
    
    void GelbSetzen()
    {
        lOben.FarbeSetzen("schwarz");
        lMitte.FarbeSetzen("gelb");
        lUnten.FarbeSetzen("schwarz");
        ampelphase = "gelb";
    }
    void Weiterschalten()
    {
        if (ampelphase == "rot")
        {
            RotgelbSetzen();
        }
        else 
        {
            if (ampelphase == "rotgelb")
            {
                GruenSetzen();
            }
            else 
            {
                if (ampelphase == "gruen")
                {
                    GelbSetzen();
                }
                else
                {
                    RotSetzen();
                }
            }
            
        }
    }
    void PositionSetzen(int xNeu, int yNeu)
    {
        if (xNeu>=-8 && xNeu<=7 && yNeu>=-8 && yNeu<=7)
        {
          posX = xNeu;
          posY = yNeu;
          lOben.PositionSetzen(xNeu,yNeu);
          lMitte.PositionSetzen(xNeu,yNeu + 1);
          lUnten.PositionSetzen(xNeu,yNeu + 2);
        }
        else
        {
          System.out.println("Die Koordinaten sind außerhalb des zulässigen Bereichs!");
        }   
        }
    
    void AmpelAnordnen(char ausrichtung){
        switch (ausrichtung) {
            case 'S':
            lOben.PositionSetzen(posX,posY);
            lMitte.PositionSetzen(posX,posY +1);
            lUnten.PositionSetzen(posX,posY+2);
            ausrichtung = 'S';
            break;
            case 'W':
            lOben.PositionSetzen(posX,posY);
            lMitte.PositionSetzen(posX-1,posY);
            lUnten.PositionSetzen(posX-2,posY);
            ausrichtung = 'W';
            break;
            case 'N':
            lOben.PositionSetzen(posX,posY);
            lMitte.PositionSetzen(posX,posY-1);
            lUnten.PositionSetzen(posX,posY-2);
            ausrichtung = 'N';
            break;
            case 'O':
            lOben.PositionSetzen(posX,posY);
            lMitte.PositionSetzen(posX+1,posY);
            lUnten.PositionSetzen(posX+2,posY);
            ausrichtung = 'O';
            break;
        }
    }
}
       

   
    
            
            
            
            
            
            
            
            
    

 
