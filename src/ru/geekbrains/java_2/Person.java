package ru.geekbrains.java_2;

public class Person {
    public static void main(String[] args) {
        PhoneBook PhoneBook = new PhoneBook();
        System.out.println("Список контаков:\n ");
        PhoneBook.info("Воронов", "88005553535","voronov1@email");
        PhoneBook.info("Котов", "88005553534", "kotov1@email");
        PhoneBook.info("Котов", "88005553533","kotov2@email");
        PhoneBook.info("Совин", "88005553532", "sovin@email");
        PhoneBook.info("Воронов", "88005553531", "voronov2@email");

        System.out.println(PhoneBook.get("Китов"));

        System.out.println("\nИнформация о:\n ");
        System.out.println("Воронов");
        System.out.println(PhoneBook.get("Воронов"));
        System.out.println("Котов");
        System.out.println(PhoneBook.get("Котов"));
        System.out.println("Совин");
        System.out.println(PhoneBook.get("Совин"));
    }
}