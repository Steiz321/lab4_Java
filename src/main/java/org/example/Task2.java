package org.example;

import java.util.HashMap;
import java.util.Scanner;

// Створити застосунок для пошуку абонентів телефонної мережі.
// Початкові записи в списку (5 записів) створюються в програмному коді і є об'єктом класу HashMap.
// Ключем записи є семизначний номер телефону (типу String), а значенням - об'єкт Abonent,
// що містить три значення типу String: прізвище, ім'я та адреса. Передбачити можливість пошуку абонентів колекції по ключу.

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<String, Abonent> network = new HashMap<>();

        network.put("+380973841234", new Abonent("Daniil", "Fundament", "Vinnytsia"));
        network.put("+380933843534", new Abonent("Nick", "Pepsi", "Kiyv"));
        network.put("+380912844344", new Abonent("George", "Camel", "Lviv"));
        network.put("+380990976234", new Abonent("Woodie", "Bond", "Odessa"));
        network.put("+380964368894", new Abonent("Rick", "Rolton", "Chernigiv"));

        System.out.println("Enter user phone to find it: ");
        String number = scan.nextLine();

        Abonent currentUser = findAbonent(network, number);

        if(currentUser != null) {
            System.out.println(currentUser);
        } else {
            System.out.println("invalid user!");
        }

    }

    public static Abonent findAbonent(HashMap<String, Abonent> network, String number) {
        if (network.containsKey(number)) {
            return network.get(number);
        } else {
            return null;
        }
    }

}

class Abonent {
    public String name;
    public String surname;
    public String address;

    public Abonent(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    @Override
    public String toString() {
        return surname + " " + name + ", address: " + address;
    }
}
