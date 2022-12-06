package OOP_Seminar4;

public class Mage extends Warrior<Staff, AverageShield> {
    private Integer range;
    private Integer mana;

    public Mage(String name, Integer healthPoint, Staff weapon, AverageShield shield, Integer range, Integer mana) {
        super(name, healthPoint, weapon, shield);
        this.range = range;
        this.mana = mana;
    }

    public Mage(String name, Integer healthPoint, Staff weapon, Integer range, Integer mana) {
        super(name, healthPoint, weapon);
        this.range = range;
        this.mana = mana;
    }

    public Integer getRange() {
        return range;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return String.format("Mage:   %s\trange: %d  mana: %d", super.toString(), range, mana);
    }
}