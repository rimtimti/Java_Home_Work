package OOP_Seminar4;

public class Staff implements Weapon {

    @Override
    public Integer damage() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("\tStaff damage: %d", damage());
    }
}