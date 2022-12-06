package OOP_Seminar4;

public abstract class Warrior<T,S>  {
    private String name;
    private T weapon;
    private S shield;
    private Integer healthPoint;

    public Warrior(String name, Integer healthPoint, T weapon, S shield) {
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.healthPoint = healthPoint;
    }

    
    public Warrior(String name, Integer healthPoint, T weapon) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }

    public T getWeapon() {
        return weapon;
    }

    public S getShield() {
        return shield;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        if (this. shield == null){
            return String.format("%s\t%s\t\t\t\thealth: %d", name, weapon, healthPoint);
        }
        return String.format("%s\t%s\t%s\thealth: %d", name, weapon, shield, healthPoint);   
    }
}