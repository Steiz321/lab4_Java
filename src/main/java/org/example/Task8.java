package org.example;

// Створити застосунок для перегляду списку черговиків і зміни пріоритету черговиків в черзі.
// Початкові записи в списку (5 записів) створюються в програмному коді і є об'єктом класу LinkedList.
// Запис списку є об'єктом QueuePerson, що містить поля прізвища, імені та по батькові черговика (типу String),
// поле типу AddressValue для адреси черговика і пріоритет черговика (типу int).
// У свою чергу, поле типу AddressValue містить три поля типу String: найменування міста,
// найменування вулиці та номер будинку, а також поле типу int - номер квартири
// (якщо номер квартири дорівнює 0, будинок, в якому проживає черговик, не має квартир).
// Записи в черзі упорядковуються відповідно до пріоритету, і черговик додається останнім в чергу свого пріоритету.

import java.util.LinkedList;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        LinkedList<QueuePerson> queue = new LinkedList<>();

        queue.add(new QueuePerson("Petro", "Ivanov", "Sergiyovych", new AddressValue("Kiyv", "Maydan Nezalejnosti", 104, 4), 1));
        queue.add(new QueuePerson("Evgeniy", "Klopotenko", "Batkovych", new AddressValue("Kiyv", "Dniprovska", 145, 56), 2));
        queue.add(new QueuePerson("Petro", "Poroshenko", "Roshenovich", new AddressValue("Vinnytsia", "Ovodova", 4, 1), 3));
        queue.add(new QueuePerson("Volodymyr", "Petrov", "Ivanovych", new AddressValue("Kiyv", "Saksaganskogo", 57, 48), 4));
        queue.add(new QueuePerson("Mykola", "Voytiuk", "Dmitrovych", new AddressValue("Vinnytsia", "Politechnichna", 78, 78), 5));

        System.out.println("queu persons list:");
        for (QueuePerson queuePerson : queue) {
            System.out.println(queuePerson);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter surname to change priority:");
        String surname = scanner.nextLine();
        System.out.println("enter new priority:");
        int newPriority = scanner.nextInt();

        try {
            changePriority(queue, surname, newPriority);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("queuePersons list after changes:");
        for (QueuePerson queuePerson1 : queue) {
            System.out.println(queuePerson1);
        }
    }

    public static QueuePerson getPersonBySurname(LinkedList<QueuePerson> queue, String surname) {
        QueuePerson queuePerson = null;
        for (QueuePerson person : queue) {
            if (person.surname.equals(surname)) {
                queuePerson = person;
                break;
            }
        }
        return queuePerson;
    }

    public static QueuePerson getPersonByPriority(LinkedList<QueuePerson> queue, int priority) {
        QueuePerson queuePerson = null;
        for (QueuePerson person : queue) {
            if (person.priority == priority) {
                queuePerson = person;
                break;
            }
        }
        return queuePerson;
    }

    public static void changePriority(LinkedList<QueuePerson> queue, String surname, int newPriority) throws Exception {
        QueuePerson queuePerson = getPersonBySurname(queue, surname);
        if (queuePerson == null) {
            System.out.println("Invalid surname");
            throw new Exception("Invalid surname");
        }

        QueuePerson oldPriorityPerson = getPersonByPriority(queue, newPriority);

        if (oldPriorityPerson == null) {
            System.out.println("Invalid surname");
            throw new Exception("Invalid surname");
        }

        oldPriorityPerson.priority = queuePerson.priority;
        queuePerson.priority = newPriority;

        queue.sort((a, b) -> a.priority - b.priority);
    }
}

class AddressValue {
    public String city;
    public String street;
    public int houseNumber;
    public int flatNumber;

    public AddressValue(String city, String street, int houseNumber, int flatNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        if (flatNumber == 0) {
            return city + ", " + street + ", " + houseNumber;
        } else {
            return city + ", " + street + ", " + houseNumber + ", Flat: " + flatNumber;
        }
    }
}

class QueuePerson {
    public String name;
    public String surname;
    public String lastname;
    public AddressValue address;
    public int priority;

    public QueuePerson(String name, String surname, String lastname, AddressValue address, int priority) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.address = address;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Name: " + surname + " " + name + " " + lastname + ", Address: " + address + ", Priority: " + priority;
    }
}
