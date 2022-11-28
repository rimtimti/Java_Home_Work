package OOP_Seminar2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    public Zoo() {
        animals = new ArrayList<>(Arrays.asList(new Frog("Crazy","blue","blue", 2, 2),new Fish("Lucy","Zolotaja", "yellow", 0,4),new Cat("barsik","vislauh", "black", 4,6)
        ,new Dog("sedi","ratvailer", "brown", 4,2), new Duck("kru","rat", "white", 2,1)));
    }

    public void talk() {
        for (SpeakAble item :getSpeakAble()) {
            System.out.printf("%s\n",item.speak());
        }
    }
    public List<SpeakAble> getSpeakAble(){
        List<SpeakAble> result = new ArrayList<>();
        for (Animal speakItem:animals) {
            if (speakItem instanceof SpeakAble){
                result.add((SpeakAble) speakItem);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<RunAble> getRunAble(){
        List<RunAble> result = new ArrayList<>();
        for (Animal speakItem:animals) {
            if (speakItem instanceof RunAble){
                result.add((RunAble) speakItem);
            }
        }
        return result;
    }

    public List<FlyAble> getFlyAble(){
        List<FlyAble> result = new ArrayList<>();
        for (Animal speakItem:animals) {
            if (speakItem instanceof FlyAble){
                result.add((FlyAble) speakItem);
            }
        }
        return result;
    }

    public List<SwimAble> getSwimAble(){
        List<SwimAble> result = new ArrayList<>();
        for (Animal swimItem:animals) {
            if (swimItem instanceof SwimAble){
                result.add((SwimAble) swimItem);
            }
        }
        return result;
    }

    public void run() {
        for (RunAble item :getRunAble()) {
            System.out.printf("%s\t%s\t%s\n",item.toString(),item.getClass().getSimpleName(),item.run());
        }
    }

    public void fly() {
        for (FlyAble item :getFlyAble()) {
            System.out.printf("%s\t%s\t%s\n",item.toString(),item.getClass().getSimpleName(),item.fly());
        }
    }

    public void swim() {
        for (SwimAble item :getSwimAble()) {
            System.out.printf("%s\t%s\t%s\n",item.toString(),item.getClass().getSimpleName(),item.swim());
        }
    }
}