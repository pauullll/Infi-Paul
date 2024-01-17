package at.kpa.oop.Auto;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Garage {
    private int stellplaetze;
    private String Adresse;
    private int einfahrtshoehe;
    private double preisstunde;
   private ArrayList<Auto> autoListe;

    public Garage(int stellplaetze, String adresse, int einfahrtshoehe, double preisstunde) {
        this.stellplaetze = stellplaetze;
        this.Adresse = adresse;
        this.einfahrtshoehe = einfahrtshoehe;
        this.preisstunde = preisstunde;
        this.autoListe = new ArrayList<Auto>();


    }

    public int getStellplaetze() {
        return stellplaetze;
    }

    public void setStellplaetze(int stellplaetze) {
        this.stellplaetze = stellplaetze;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public int getEinfahrtshoehe() {
        return einfahrtshoehe;
    }

    public void setEinfahrtshoehe(int einfahrtshoehe) {
        this.einfahrtshoehe = einfahrtshoehe;
    }

    public double getPreisstunde() {
        return preisstunde;
    }

    public void setPreisstunde(float preisstunde) {
        this.preisstunde = preisstunde;
    }


    public int getAutosinGarage(){
        return this.autoListe.size();
    }


    public int getFreiePlaetze(){
        return this.stellplaetze - getAutosinGarage();
    }

    public void addAutoGarage(Auto auto){
        //Abfrage ist Auto höher als Garage höhe
            if (auto.getFahrzeughoehe() > this.einfahrtshoehe) {
                System.out.println("Hoi, hast a hohes Auto, leider ned in derra Garage!!!");
            }
            else if (this.getFreiePlaetze() > 0) {
            this.autoListe.add(auto);

        }else{
            System.out.println("Upps, Garage keinen Platz mehr frei, versuche es später noch einmal!");
        }
    }

    public void getAutoFarbe(String farbe){
        System.out.println("Folgende Auto mit Farbe " + farbe + "sind in der Liste");
        for (Auto a : autoListe) {
            if(a.getsFarbe().equals(farbe)) {
                System.out.println(a.getInfoAuto());
            }
        }
    }
    public int getGesamtFahrzeugeUebereinander(){
        int wert = 0;
        for (Auto a : autoListe) {
            wert += a.getFahrzeughoehe();
        }
        return wert;
    }

    //Wir suchen nach Autos mit Farbe x
    //Suche Autos mit Leistung von, bis

    public void getAutoLeistung(int lmin, int lmax) {
        //Falls lmin > lmax tausche die Werte
        if (lmin > lmax) {
            int ch = lmax;
            lmin = lmax;
            lmin = ch;
        }
    }
    public void loescheAutosFarbe(String farbe) {
        //Aus der Liste entfernen
        int counter = 0;
        for(int i = autoListe.size() -1; i>=0;i--){
            if (autoListe.get(i).getsFarbe().equals(farbe)) {
                autoListe.remove(i);
                counter++;
            }
        }
        System.out.println("Es wurden " + counter + " " + farbe + "Autos gelöscht!")
    }

}

