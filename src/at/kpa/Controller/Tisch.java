package at.kpa.Controller;

import at.kpa.oop.Auto.Auto;

import java.util.ArrayList;


public class Tisch {
    private int iPlatz;
    private int iminZustand;
    private ArrayList<Tisch> tischliste;

    public Tisch(int iPlatz, int iminZustand) {
        this.iPlatz = iPlatz;
        this.iminZustand = iminZustand;
        this.tischliste = new ArrayList<Tisch>();
    }

    public int getiPlatz() {
        return iPlatz;
    }

    public void setiPlatz(int iPlatz) {
        this.iPlatz = iPlatz;
    }

    public int getIminZustand() {
        return iminZustand;
    }

    public void setIminZustand(int iminZustand) {
        this.iminZustand = iminZustand;
    }

    public ArrayList<Tisch> getTischliste() {
        return tischliste;
    }

    public void setTischliste(ArrayList<Tisch> tischliste) {
        this.tischliste = tischliste;
    }


    public int getControlleraufTisch() {
        return this.tischliste.size();
    }

    public int getFreiePlaetze() {
        return this.iPlatz - getControlleraufTisch();
    }


    public void addControllerTisch(Tisch tisch) {
        //Abfrage Zustand ist mindestens "5"
        if (Controller.getiZustand() < this.iminZustand) {
            System.out.println("Controller zu nasty!!!");
        } else if (this.getFreiePlaetze() > 0) {
            this.tischliste.add(tisch);

        } else {
            System.out.println("Upps, Garage keinen Platz mehr frei, versuche es später noch einmal!");
        }
    }
}


