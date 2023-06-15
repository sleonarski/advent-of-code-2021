package org.example.day2;

import static org.example.day2.PartOne.solvePartOne;
import static org.example.day2.PartTwo.solvePartTwo;

class Main {

    public static void main(String[] args) {

        String path = ("src/main/resources/day2/data.txt");

        System.out.println(solvePartOne(path));
        System.out.println(solvePartTwo(path));
    }
}