package org.example;

import org.junit.jupiter.api.Test;
import org.example.Task8;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void getPersonBySurname1() {
        LinkedList<QueuePerson> queue = new LinkedList<>();

        queue.add(new QueuePerson("Petro", "Ivanov", "Sergiyovych", new AddressValue("Kiyv", "Maydan Nezalejnosti", 104, 4), 1));
        queue.add(new QueuePerson("Evgeniy", "Klopotenko", "Batkovych", new AddressValue("Kiyv", "Dniprovska", 145, 56), 2));
        queue.add(new QueuePerson("Petro", "Poroshenko", "Roshenovich", new AddressValue("Vinnytsia", "Ovodova", 4, 1), 3));
        queue.add(new QueuePerson("Volodymyr", "Petrov", "Ivanovych", new AddressValue("Kiyv", "Saksaganskogo", 57, 48), 4));
        queue.add(new QueuePerson("Mykola", "Voytiuk", "Dmitrovych", new AddressValue("Vinnytsia", "Politechnichna", 78, 78), 5));

        String surname = "Klopotenko";
        QueuePerson correct = queue.get(1);

        QueuePerson result = Task8.getPersonBySurname(queue, surname);

        assertEquals(correct, result);
    }

    @Test
    void getPersonBySurname2() {
        LinkedList<QueuePerson> queue = new LinkedList<>();

        queue.add(new QueuePerson("Petro", "Ivanov", "Sergiyovych", new AddressValue("Kiyv", "Maydan Nezalejnosti", 104, 4), 1));
        queue.add(new QueuePerson("Evgeniy", "Klopotenko", "Batkovych", new AddressValue("Kiyv", "Dniprovska", 145, 56), 2));
        queue.add(new QueuePerson("Petro", "Poroshenko", "Roshenovich", new AddressValue("Vinnytsia", "Ovodova", 4, 1), 3));
        queue.add(new QueuePerson("Volodymyr", "Petrov", "Ivanovych", new AddressValue("Kiyv", "Saksaganskogo", 57, 48), 4));
        queue.add(new QueuePerson("Mykola", "Voytiuk", "Dmitrovych", new AddressValue("Vinnytsia", "Politechnichna", 78, 78), 5));

        String surname = "";
        QueuePerson correct = null;

        QueuePerson result = Task8.getPersonBySurname(queue, surname);

        assertEquals(correct, result);
    }

    @Test
    void getPersonByPriority1() {
        LinkedList<QueuePerson> queue = new LinkedList<>();

        queue.add(new QueuePerson("Petro", "Ivanov", "Sergiyovych", new AddressValue("Kiyv", "Maydan Nezalejnosti", 104, 4), 1));
        queue.add(new QueuePerson("Evgeniy", "Klopotenko", "Batkovych", new AddressValue("Kiyv", "Dniprovska", 145, 56), 2));
        queue.add(new QueuePerson("Petro", "Poroshenko", "Roshenovich", new AddressValue("Vinnytsia", "Ovodova", 4, 1), 3));
        queue.add(new QueuePerson("Volodymyr", "Petrov", "Ivanovych", new AddressValue("Kiyv", "Saksaganskogo", 57, 48), 4));
        queue.add(new QueuePerson("Mykola", "Voytiuk", "Dmitrovych", new AddressValue("Vinnytsia", "Politechnichna", 78, 78), 5));

        int priority = 3;
        QueuePerson correct = queue.get(2);

        QueuePerson result = Task8.getPersonByPriority(queue, priority);

        assertEquals(correct, result);
    }

    @Test
    void getPersonByPriority2() {
        LinkedList<QueuePerson> queue = new LinkedList<>();

        queue.add(new QueuePerson("Petro", "Ivanov", "Sergiyovych", new AddressValue("Kiyv", "Maydan Nezalejnosti", 104, 4), 1));
        queue.add(new QueuePerson("Evgeniy", "Klopotenko", "Batkovych", new AddressValue("Kiyv", "Dniprovska", 145, 56), 2));
        queue.add(new QueuePerson("Petro", "Poroshenko", "Roshenovich", new AddressValue("Vinnytsia", "Ovodova", 4, 1), 3));
        queue.add(new QueuePerson("Volodymyr", "Petrov", "Ivanovych", new AddressValue("Kiyv", "Saksaganskogo", 57, 48), 4));
        queue.add(new QueuePerson("Mykola", "Voytiuk", "Dmitrovych", new AddressValue("Vinnytsia", "Politechnichna", 78, 78), 5));

        int priority = 6;
        QueuePerson correct = null;

        QueuePerson result = Task8.getPersonByPriority(queue, priority);

        assertEquals(correct, result);
    }

}