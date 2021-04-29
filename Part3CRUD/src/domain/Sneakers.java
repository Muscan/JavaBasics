package domain;

public class Sneakers {
    private String model;
    private double price;

    public Sneakers(){
        this.model = "";
        this.price = 0;
    }

    public Sneakers(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sneakers{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

}
