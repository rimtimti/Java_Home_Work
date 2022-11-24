package OOP_Seminar1;

public class Chocolate extends Product {
    private Double cal;

    public Chocolate(String name) {
        super(name);
    }

    public Chocolate(String name, Double price) {
        super(name, price);
    }

    public Chocolate(String name, Double price, Double cal) {
        super(name, price);
        this.cal = cal;
    }

    public Double getCalories(){
        return this.cal;
    }

    @Override
    public String toString() {
        return String.format("%s \tКалорийность = %,.2f ккал",super.toString(), getCalories());
    }
}