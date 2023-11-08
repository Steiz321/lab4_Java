package org.example;

// Створити застосунок для видалення абонента і перегляду списку абонентів бібліотечної мережі.
// Початкові записи в списку абонентів (5 записів) створюються в програмному коді і є об'єктом класу HashMap.
// Ключем записи є номер телефону (типу Integer), а значенням - об'єкт Abonent,
// що містить три значення типу String: прізвище, ім'я та адреса.
// Передбачити можливість сортування по прізвищу за допомогою TreeMap.

import java.util.*;

public class Task14 {

    public static void main(String[] args) {
        Map<Integer, Member> members = new HashMap<>();
        members.put(1, new Member("Ivan", "Petrov", "Kiyv"));
        members.put(3, new Member("Petro", "Ivanov", "Lviv"));
        members.put(2, new Member("Mykola", "Azirov", "Odessa"));
        members.put(4, new Member("Oleg", "Balashov", "Kharkiv"));
        members.put(5, new Member("Andriy", "Lampreht", "Dnipro"));

        System.out.println("List of members");
        for (Map.Entry<Integer, Member> entry : members.entrySet()) {
            System.out.println("Number: " + entry.getKey() + " " + entry.getValue());
        }
        System.out.println();

        TreeMap<Member, Integer> sortedMembers = sortBySurname(members);

        System.out.println("List of members after sort by surname");
        for (Map.Entry<Member, Integer> entry : sortedMembers.entrySet()) {
            System.out.println("Number: " + entry.getValue() + ", " + entry.getKey());
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter member number to delete:");
        int number = scanner.nextInt();
        Member removedMember = deleteMember(members, number);

        if (removedMember == null) {
            System.exit(0);
        }

        System.out.println();
        System.out.println("List after member delete");
        for (Map.Entry<Integer, Member> entry : members.entrySet()) {
            System.out.println("Number: " + entry.getKey() + " " + entry.getValue());
        }
    }

    public static TreeMap<Member, Integer> sortBySurname(Map<Integer, Member> members) {
        TreeMap<Member, Integer> sortedMembers = new TreeMap<>(new SurnameComparator());

        for (Map.Entry<Integer, Member> entry : members.entrySet()) {
            sortedMembers.put(entry.getValue(), entry.getKey());
        }

        return sortedMembers;
    }

    public static Member deleteMember (Map<Integer, Member> members, int number) {
        Member removedMember = members.remove(number);

        return removedMember;
    }

}

class SurnameComparator implements Comparator<Member> {
    @Override
    public int compare(Member ab1, Member ab2) {
        return ab1.surname.compareTo(ab2.surname);
    }
}

class Member {
    public String name;
    public String surname;
    public String address;

    public Member(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    @Override
    public String toString() {
        return surname + " " + name + ", Address: " + address;
    }
}
