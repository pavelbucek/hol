package service;

import java.util.ServiceLoader;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Iterable<StarFighter> fighters = ServiceLoader.load(StarFighter.class);

        fighters.forEach(System.out::println);
    }
}
