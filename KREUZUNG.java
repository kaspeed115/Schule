
class KREUZUNG {
    AMPEL ampelNord;
    AMPEL ampelSued;
    AMPEL ampelOst;
    AMPEL ampelWest;
    FUSSGAENGERAMPEL fussgaengerampel1;
    FUSSGAENGERAMPEL fussgaengerampel2;
    FUSSGAENGERAMPEL fussgaengerampel3;
    FUSSGAENGERAMPEL fussgaengerampel4;
    FUSSGAENGERAMPEL fussgaengerampel5;
    FUSSGAENGERAMPEL fussgaengerampel6;
    FUSSGAENGERAMPEL fussgaengerampel7;
    FUSSGAENGERAMPEL fussgaengerampel8;
    int schaltphase;
    KREUZUNG() { 
        ampelNord = new AMPEL();
        ampelSued = new AMPEL();
        ampelOst = new AMPEL();
        ampelWest = new AMPEL();
        ampelNord.PositionSetzen(-2,-6);
        ampelNord.AmpelAnordnen('N');
        ampelNord.RotSetzen();
        ampelSued.PositionSetzen(1,5);
        ampelSued.AmpelAnordnen('S');
        ampelSued.RotSetzen();
        ampelOst.PositionSetzen(5,-2);
        ampelOst.AmpelAnordnen('O');
        ampelOst.GruenSetzen();
        ampelWest.PositionSetzen(-6,2);
        ampelWest.AmpelAnordnen('W');
        ampelWest.GruenSetzen();
        fussgaengerampel1 = new FUSSGAENGERAMPEL();
        fussgaengerampel2 = new FUSSGAENGERAMPEL();
        fussgaengerampel3 = new FUSSGAENGERAMPEL();
        fussgaengerampel4 = new FUSSGAENGERAMPEL();
        fussgaengerampel5 = new FUSSGAENGERAMPEL();
        fussgaengerampel6 = new FUSSGAENGERAMPEL();
        fussgaengerampel7 = new FUSSGAENGERAMPEL();
        fussgaengerampel8 = new FUSSGAENGERAMPEL();
        fussgaengerampel1.PositionSetzen(-3,-4);
        fussgaengerampel1.AmpelAnordnen('O');
        fussgaengerampel1.GruenSetzen();
        fussgaengerampel2.PositionSetzen(-4,-3);
        fussgaengerampel2.AmpelAnordnen('S');
        fussgaengerampel2.RotSetzen();
        fussgaengerampel3.PositionSetzen(-4,2);
        fussgaengerampel3.AmpelAnordnen('N');
        fussgaengerampel3.RotSetzen();
        fussgaengerampel4.PositionSetzen(-3,3);
        fussgaengerampel4.AmpelAnordnen('O');
        fussgaengerampel4.GruenSetzen();
        fussgaengerampel5.PositionSetzen(2,3);
        fussgaengerampel5.AmpelAnordnen('W');
        fussgaengerampel5.GruenSetzen();
        fussgaengerampel6.PositionSetzen(3,2);
        fussgaengerampel6.AmpelAnordnen('N');
        fussgaengerampel6.RotSetzen();
        fussgaengerampel7.PositionSetzen(3,-3);
        fussgaengerampel7.AmpelAnordnen('S');
        fussgaengerampel7.RotSetzen();
        fussgaengerampel8.PositionSetzen(2,-4);
        fussgaengerampel8.AmpelAnordnen('W');
        fussgaengerampel8.GruenSetzen();
        schaltphase = 1;
    }
    void rotrotgelbgelb (){
            ampelNord.RotSetzen();
            ampelSued.RotSetzen();
            ampelOst.GelbSetzen();
            ampelWest.GelbSetzen();
            fussgaengerampel1.GruenSetzen();
            fussgaengerampel4.GruenSetzen();
            fussgaengerampel5.GruenSetzen();
            fussgaengerampel8.GruenSetzen();
            fussgaengerampel2.RotSetzen();
            fussgaengerampel3.RotSetzen();
            fussgaengerampel6.RotSetzen();
            fussgaengerampel7.RotSetzen();
            schaltphase = 2;
    }
    void    rotgelbrotgelbrotrot (){
            ampelNord.RotgelbSetzen();
            ampelSued.RotgelbSetzen();
            ampelOst.RotSetzen();
            ampelWest.RotSetzen();
            fussgaengerampel1.RotSetzen();
            fussgaengerampel4.RotSetzen();
            fussgaengerampel5.RotSetzen();
            fussgaengerampel8.RotSetzen();
            fussgaengerampel2.GruenSetzen();
            fussgaengerampel3.GruenSetzen();
            fussgaengerampel6.GruenSetzen();
            fussgaengerampel7.GruenSetzen();
            schaltphase = 3;
    }
    void    gruengruenrotgelbrotgelb (){
            ampelNord.GruenSetzen();
            ampelSued.GruenSetzen();
            ampelOst.RotgelbSetzen();
            ampelWest.RotgelbSetzen();
            fussgaengerampel1.RotSetzen();
            fussgaengerampel4.RotSetzen();
            fussgaengerampel5.RotSetzen();
            fussgaengerampel8.RotSetzen();
            fussgaengerampel2.RotSetzen();
            fussgaengerampel3.RotSetzen();
            fussgaengerampel6.RotSetzen();
            fussgaengerampel7.RotSetzen();
            schaltphase = 4;
    }
    void    gelbgelbgruengruen(){
            ampelNord.GelbSetzen();
            ampelSued.GelbSetzen();
            ampelOst.GruenSetzen();
            ampelWest.GruenSetzen();
            fussgaengerampel1.RotSetzen();
            fussgaengerampel4.RotSetzen();
            fussgaengerampel5.RotSetzen();
            fussgaengerampel8.RotSetzen();
            fussgaengerampel2.RotSetzen();
            fussgaengerampel3.RotSetzen();
            fussgaengerampel6.RotSetzen();
            fussgaengerampel7.RotSetzen();
            schaltphase = 5;
    }
    void    rotrotgruengruen(){
            ampelNord.RotSetzen();
            ampelSued.RotSetzen();
            ampelOst.GruenSetzen();
            ampelWest.GruenSetzen();
            fussgaengerampel1.GruenSetzen();
            fussgaengerampel4.GruenSetzen();
            fussgaengerampel5.GruenSetzen();
            fussgaengerampel8.GruenSetzen();
            fussgaengerampel2.RotSetzen();
            fussgaengerampel3.RotSetzen();
            fussgaengerampel6.RotSetzen();
            fussgaengerampel7.RotSetzen();
            schaltphase = 6;
    }
 
    void Weiterschalten(){
        if (schaltphase == 1) {
           rotrotgelbgelb ();
        }
        else
        if (schaltphase == 2) {
           rotgelbrotgelbrotrot ();
        }
        else 
        if (schaltphase == 3) {
           gruengruenrotgelbrotgelb ();
        }
        else
        if (schaltphase == 4) {
            gelbgelbgruengruen();
        }
        else
        if (schaltphase == 5) {
            rotrotgelbgelb();
        }
        else
        if (schaltphase == 6) {
            rotrotgruengruen();
        }
    }
}

            
  
 
    
    