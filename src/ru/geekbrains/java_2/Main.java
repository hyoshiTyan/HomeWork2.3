package ru.geekbrains.java_2;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> setOfWords = Arrays.asList
                (
                        "Япония", "Китай", "Аниме", "Азия", "Корея",
                        "Китай", "Рис", "Сакура", "Китай", "Java",
                        "Сакура", "Java", "Япония", "Сакура", "Азия",
                        "Аниме", "Китай", "Азия", "Япония", "Рис",
                        "Java", "Корея", "Япония", "Рис", "Корея",
                        "Аниме", "Сакура", "Азия", "Япония", "Рис"
                );

        HashSet<String> checkRepeat = new HashSet(setOfWords);
        System.out.println("Массив слов:\n ");
        System.out.println(setOfWords.toString());
        System.out.println("\nКол-во повторов слов:\n ");
        for (String outPut : checkRepeat) {
            System.out.println(outPut + " — " + Collections.frequency(setOfWords, outPut));
        }
    }
}

