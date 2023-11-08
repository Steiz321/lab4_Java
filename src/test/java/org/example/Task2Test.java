package org.example;

import java.util.HashMap;
import org.example.Task2;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @org.junit.jupiter.api.Test
    void findAbonent1() {
        HashMap<String, Abonent> network = new HashMap<>();

        network.put("+380973841234", new Abonent("Daniil", "Fundament", "Vinnytsia"));
        network.put("+380933843534", new Abonent("Nick", "Pepsi", "Kiyv"));
        network.put("+380912844344", new Abonent("George", "Camel", "Lviv"));
        network.put("+380990976234", new Abonent("Woodie", "Bond", "Odessa"));
        network.put("+380964368894", new Abonent("Rick", "Rolton", "Chernigiv"));

        Abonent correct = network.get("+380973841234");

        Abonent result = Task2.findAbonent(network, "+380973841234");

        assertEquals(correct, result);
    }

    @org.junit.jupiter.api.Test
    void findAbonent2() {
        HashMap<String, Abonent> network = new HashMap<>();

        network.put("+380973841234", new Abonent("Daniil", "Fundament", "Vinnytsia"));
        network.put("+380933843534", new Abonent("Nick", "Pepsi", "Kiyv"));
        network.put("+380912844344", new Abonent("George", "Camel", "Lviv"));
        network.put("+380990976234", new Abonent("Woodie", "Bond", "Odessa"));
        network.put("+380964368894", new Abonent("Rick", "Rolton", "Chernigiv"));

        Abonent correct = null;

        Abonent result = Task2.findAbonent(network, "380973841234");

        assertEquals(correct, result);
    }

    @org.junit.jupiter.api.Test
    void findAbonent3() {
        HashMap<String, Abonent> network = new HashMap<>();

        network.put("+380973841234", new Abonent("Daniil", "Fundament", "Vinnytsia"));
        network.put("+380933843534", new Abonent("Nick", "Pepsi", "Kiyv"));
        network.put("+380912844344", new Abonent("George", "Camel", "Lviv"));
        network.put("+380990976234", new Abonent("Woodie", "Bond", "Odessa"));
        network.put("+380964368894", new Abonent("Rick", "Rolton", "Chernigiv"));

        Abonent correct = null;

        Abonent result = Task2.findAbonent(network, "+3845345");

        assertEquals(correct, result);
    }

    @org.junit.jupiter.api.Test
    void findAbonent4() {
        HashMap<String, Abonent> network = new HashMap<>();

        network.put("+380973841234", new Abonent("Daniil", "Fundament", "Vinnytsia"));
        network.put("+380933843534", new Abonent("Nick", "Pepsi", "Kiyv"));
        network.put("+380912844344", new Abonent("George", "Camel", "Lviv"));
        network.put("+380990976234", new Abonent("Woodie", "Bond", "Odessa"));
        network.put("+380964368894", new Abonent("Rick", "Rolton", "Chernigiv"));

        Abonent correct = null;

        Abonent result = Task2.findAbonent(network, "");

        assertEquals(correct, result);
    }
}