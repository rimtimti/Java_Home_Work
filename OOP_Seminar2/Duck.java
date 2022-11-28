package OOP_Seminar2;

public class Duck extends Animal implements SpeakAble,FlyAble,RunAble, SwimAble{

    public Duck(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String fly() {
        return "90 km/h";
    }

    @Override
    public String run() {
        return "10 km/h";
    }

    @Override
    public String speak() {
        return "Кря-кря!";
    }

    @Override
    public String swim() {
        return "5 km/h";
    }
}