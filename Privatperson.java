package Supermakt_Observer_Pattern;

public class Privatperson implements Observer {

    private String name;
    private int kontostand;
    private Supermarkt supermarkt;

    public Privatperson(String name, Supermarkt supermarkt) {
        this.name = name;
        kontostand = 500;
        this.supermarkt = supermarkt;
        supermarkt.registrieren(this);
    }
    public void ausgabeKaufen() {
        kontostand = kontostand - supermarkt.products[1].getPrice();
        supermarkt.setVermögen(supermarkt.getVermögen() + supermarkt.products[1].getPrice());
    }
    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    public void aktualisieren() {
        this.ausgabeKaufen();
    }

}
