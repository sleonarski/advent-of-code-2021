package org.example;

import static org.example.PartOne.*;
import static org.example.PartTwo.*;

public class Main {

    public static void main(String[] args) {

        String path = ("src/main/resources/data.txt");

        System.out.println(solvePartOne(path));
        System.out.println(solvePartTwo(path));
    }
}