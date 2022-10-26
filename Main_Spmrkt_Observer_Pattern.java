package Supermakt_Observer_Pattern;

public class Main_Spmrkt_Observer_Pattern {


    public static void main(String[] args) {
        Supermarkt penny = new Supermarkt();
        Privatperson denis = new Privatperson("Denis", penny);
        Unternehmen didact = new Unternehmen("Didact", "Albukerki", penny);
        penny.Action_Rabbat("Heya");
        System.out.println(denis.getKontostand());
        System.out.println(didact.getVermögen());
        System.out.println(penny.getVermögen());
    }


}
