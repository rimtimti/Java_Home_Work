package OOP_Seminar4;

public class HeavyShield implements Shield {

    @Override
    public Integer absorption() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format("Shield absorption: %d", absorption());
    }
}