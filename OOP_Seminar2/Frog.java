package OOP_Seminar2;

public class Frog extends Animal implements SpeakAble, SwimAble {

    public Frog(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String speak(){
        return "Ква-ква!";
    }

    @Override
    public String swim() {
        return "2 km/h";
    }

}