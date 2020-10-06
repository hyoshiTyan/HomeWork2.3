package ru.geekbrains.java_2;

import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private HashMap<String, List<String>> book;

    public PhoneBook() {
        this.book = new HashMap<>();
    }

    public List<String> get(String name) {
        if (book.containsKey(name)) {
            return book.get(name);
        } else {
            System.out.println("\nИнформация отсутствует о: " + name);
            return new ArrayList<>();
        }
    }

    public void info(String name, String phone, String mail) {
        if (book.containsKey(name)) {
            List<String> personNumber = book.get(name);
            if (personNumber.add(phone + mail)) {
                System.out.println("Номер: " + phone + " и E-mail: " + mail + " Добавлен для: " + name);
            } else {
                book.put(name, new ArrayList<>(Arrays.asList(phone, mail)));
                System.out.println("Данный номер: " + phone + " и E-mail: " + mail + " уже используется для: " + name);
            }
        } else {
            book.put(name, new ArrayList<>(Arrays.asList(phone, mail)));
            System.out.println("Номер: " + phone + " и E-mail: " + mail + " Добавлен для: " + name);

        }
    }
}
