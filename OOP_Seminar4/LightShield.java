package OOP_Seminar4;

public class LightShield implements Shield {

    @Override
    public Integer absorption() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Shield absorption: %d", absorption());
    }
}