package Supermakt_Observer_Pattern;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Supermarkt implements Subject {


    private List<Observer> abonnenten;
    public Product [] products;
    private int vermögen;
    private String ausgabe;


    public Supermarkt() {
        abonnenten = new ArrayList<>();
        vermögen = 0;
        ausgabe = "0";

        products = new Product[3];
        products[0] = new Product("Apfel", 12);
        products[1] = new Product("Schoko", 10);
        products[2] = new Product("Bier", 8);
    }
    public void Action_Rabbat(String ausgabe) {
        for( int i = 0 ; i < products.length; i++) {
            products[i].setPrice(products[i].getPrice()/2);
        }
        this.setAusgabe(ausgabe);
        this.benachrichtigen();
    }
    public int getVermögen() {
        return vermögen;
    }

    public void setVermögen(int vermögen) {
        this.vermögen = vermögen;
    }

    public String getAusgabe() {
        return ausgabe;
    }

    public void setAusgabe(String ausgabe) {
        this.ausgabe = ausgabe;
    }

    public void registrieren(Observer o) {
        abonnenten.add(o);
    }

    public void benachrichtigen() {
        for(Observer observer : abonnenten) {
            observer.aktualisieren();
        }

    }

}