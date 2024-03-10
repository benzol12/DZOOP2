package Domain;

public class Product {
    private double price;
    private int place;
    private String name;

    public Product(double price, int place, String name) {

        if (price < 0){
            this.price = 100;
        } else {
            this.price = price;
        }

        this.place = place;
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            this.price = 100;
        } else {
            this.price = price;
        }
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", place=" + place +
                ", name='" + name + '\'' +
                '}';
    }


}


