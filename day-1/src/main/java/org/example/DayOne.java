package org.example;

public class DayOne {

    public static void main(String[] args) {

        String path = "day-1/src/main/resources/input.txt";

        System.out.println(DayOnePartOne.runPartOne(path, 1));

        System.out.println(DayOnePartTwo.runPartTwo(path, 3));
    }
}