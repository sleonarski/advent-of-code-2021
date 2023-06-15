package org.example.day1;

import static org.example.day1.PartOne.*;
import static org.example.day1.PartTwo.*;

public class Main {

    public static void main(String[] args) {

        String path = "src/main/resources/day1/input.txt";

        // Day One
        System.out.println(runPartOne(path, 1));
        System.out.println(runPartTwo(path, 3));
    }
}