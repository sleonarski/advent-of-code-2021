package org.example;

public class Main {

    public static void main(String[] args) {

        String path = "day-1/src/main/resources/input.txt";

        System.out.println(PartOne.runPartOne(path, 1));

        System.out.println(PartTwo.runPartTwo(path, 3));
    }
}