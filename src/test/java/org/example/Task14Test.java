package org.example;

import org.junit.jupiter.api.Test;
import org.example.Task14;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @Test
    void deleteMember1() {
        Map<Integer, Member> members = new HashMap<>();
        members.put(1, new Member("Ivan", "Petrov", "Kiyv"));
        members.put(3, new Member("Petro", "Ivanov", "Lviv"));
        members.put(2, new Member("Mykola", "Azirov", "Odessa"));
        members.put(4, new Member("Oleg", "Balashov", "Kharkiv"));
        members.put(5, new Member("Andriy", "Lampreht", "Dnipro"));

        int number = 3;
        Member correct = members.get(number);

        Member result = Task14.deleteMember(members, number);

        assertEquals(correct, result);
    }

    @Test
    void deleteMember2() {
        Map<Integer, Member> members = new HashMap<>();
        members.put(1, new Member("Ivan", "Petrov", "Kiyv"));
        members.put(3, new Member("Petro", "Ivanov", "Lviv"));
        members.put(2, new Member("Mykola", "Azirov", "Odessa"));
        members.put(4, new Member("Oleg", "Balashov", "Kharkiv"));
        members.put(5, new Member("Andriy", "Lampreht", "Dnipro"));

        int number = 6;
        Member correct = null;

        Member result = Task14.deleteMember(members, number);

        assertEquals(correct, result);
    }
}