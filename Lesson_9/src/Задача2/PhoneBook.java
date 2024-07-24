package Задача2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        phoneBook.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Gromov", "123456789");
        phoneBook.add("Gromov", "987654321");
        phoneBook.add("Pupkin", "555666777");
        phoneBook.add("Savronov", "111222333");
        phoneBook.add("Akinfeev", "111111111");

        System.out.println("Номера телефонов Громова: " + phoneBook.get("Gromov"));
        System.out.println("Номера телефонов Пупкина: " + phoneBook.get("Pupkin"));
        System.out.println("Номера телефонов Савронова: " + phoneBook.get("Savronov"));
        System.out.println("Номера телефонов Акинфеева: " + phoneBook.get("Akinfeev"));
    }
}