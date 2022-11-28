package OOP_Seminar2;

public class Dog extends Animal implements SpeakAble,RunAble{

    public Dog(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String speak(){
        return "Гав!";
    }

    @Override
    public String run() {
        return "50 km/h";
    }
}