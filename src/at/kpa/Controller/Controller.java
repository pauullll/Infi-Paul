package at.kpa.Controller;

public class Controller {

    private String sModell;

    private int iPreis;

    private String sFarbe;
    private int iZustand;


    public Controller() {
        this.iPreis = 0;
        this.iZustand = 0;
        this.sModell = "keine Angabe";
        this.sFarbe = "keine Angabe";

    }


    public Controller(int iPreis, int iZustand, String sModell, String sFarbe) {
        this.iPreis = iPreis;
        this.iZustand = iZustand;
        this.sModell = sModell;
        this.sFarbe = sFarbe;


    }

    public String getsModell() {
        return sModell;
    }

    public void setsModell(String sModell) {
        this.sModell = sModell;
    }

    public int getiPreis() {
        return iPreis;
    }

    public void setiPreis(int iPreis) {
        this.iPreis = iPreis;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }

    public int getiZustand() {
        return iZustand;
    }

    public void setiZustand(int iZustand) {
        this.iZustand = iZustand;
    }

    public String getInfoAuto() {
        return "Der Controller ist ein  " + this.getsModell() +
                " mit der Farbe " + this.getsFarbe() +
                " der Preis beläuft sich auf " + this.getiPreis() +
                " bei einem Zustand von " + this.getiZustand() + "auf der Scala von 1 -10";

    }

}