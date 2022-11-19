package Seminar6;

import java.util.HashSet;
import java.util.LinkedHashMap;

public class Notebook {
    String cpu;
    String ram;
    String hdd;
    String video;
    String mother;
    String color;
    String screen;

    public Notebook(
            String cpu,
            String ram,
            String hdd,
            String video,
            String mother,
            String color,
            String screen) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.video = video;
        this.mother = mother;
        this.color = color;
        this.screen = screen;
    }

    public static void findCPU(HashSet<Notebook> notebooks, String input, LinkedHashMap<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.cpu.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        }
    }

    public static void findRAM(HashSet<Notebook> notebooks, String input, LinkedHashMap<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.ram.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        }
    }

    public static void findHDD(HashSet<Notebook> notebooks, String input, LinkedHashMap<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.hdd.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        }
    }

    public static void findVideo(HashSet<Notebook> notebooks, String input, LinkedHashMap<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.video.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        }
    }

    public static void findMother(HashSet<Notebook> notebooks, String input, LinkedHashMap<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.mother.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        }
    }

    public static void findColor(HashSet<Notebook> notebooks, String input, LinkedHashMap<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.color.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        }
    }

    public static void findScreen(HashSet<Notebook> notebooks, String input, LinkedHashMap<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.screen.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("CPU: %s\nRAM: %s\nHDD: %s\nVideocard: %s\nMorherboard: %s\nColor: %s\nScreen: %s", cpu, ram, hdd, video, mother, color, screen);
    }
}
