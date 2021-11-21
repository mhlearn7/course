package com.example.workshop01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {
    public static String decidingString() {
        String line1 = "Logic will get you from A to B. Imagination will take you everywhere.";
        String line2 = "There are 10 kinds of people. Those who know binary and those who don't.";
        String line3 = "There are two ways of constructing a software design. One way is to make it\n" +
                "so simple that there are obviously no deficiencies and the other is to make\n" +
                "it so complicated that there are no obvious deficiencies.";
        String line4 = "It's not that I'm so smart, it's just that I stay with problems longer.";
        String line5 = "It is pitch dark. You are likely to be eaten by a grue.";

        List<String> list = new ArrayList<>();
        list.add(line1);
        list.add(line2);
        list.add(line3);
        list.add(line4);
        list.add(line5);
        Random random = new Random(); //Create random class object
        int randomNumber = random.nextInt(list.size()); //Generate a random number (index) with the size of the list being the maximum
        System.out.println(list.get(randomNumber));
        String randomString = list.get(randomNumber);
        return randomString;
    }
}
