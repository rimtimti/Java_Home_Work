package OOP_Seminar4;

public class AverageShield implements Shield {

    @Override
    public Integer absorption() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format("Shield absorption: %d", absorption());
    }
}