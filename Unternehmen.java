package Supermakt_Observer_Pattern;

public class Unternehmen implements Observer{

    private String name;
    private String firmensitz;
    private int vermögen;
    private Supermarkt supermarkt;
    private static final int anzahlAusgaben = 100;


    public int getVermögen() {
        return vermögen;
    }

    public void setVermögen(int vermögen) {
        this.vermögen = vermögen;
    }

    public Unternehmen(String name, String firmensitz, Supermarkt supermarkt) {
        this.name = name;
        this.firmensitz = firmensitz;
        vermögen = 10000;
        this.supermarkt = supermarkt;
        supermarkt.registrieren(this);
    }

    public void ausgabenBestellen() {
        vermögen = vermögen - supermarkt.products[1].getPrice() * anzahlAusgaben;
        supermarkt.setVermögen(supermarkt.getVermögen() + supermarkt.products[1].getPrice() * anzahlAusgaben);
    }
    @Override
    public void aktualisieren() {
        this.ausgabenBestellen();
    }
}