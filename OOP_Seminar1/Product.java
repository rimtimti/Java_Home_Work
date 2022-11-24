package OOP_Seminar1;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this(name);
        this.price = price;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double value) {
        if (value <= 0) {
            return;
        }
        this.price = value;
    }

    @Override
    public String toString() {
        return String.format("Наимеование = %s \tЦена = %,.2f руб", this.name, this.price);
    }
}