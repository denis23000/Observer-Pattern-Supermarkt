package Supermakt_Observer_Pattern;

public class Product {

    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
                this.price = price;
        }


}