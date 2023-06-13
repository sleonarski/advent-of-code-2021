package org.example;

import static org.example.PartOne.*;
import static org.example.PartTwo.*;

//TODO: delete day-2 module, add Submarine class that can takes commands, try with collect/reduce
public class Main {

    public static void main(String[] args) {

        String dummyInput = """
                forward 5
                down 5
                forward 8
                up 3
                down 8
                forward 2""";

        String path = ("day-2/src/main/resources/data.txt");

        System.out.println(solvePartOne(path));
        System.out.println(solvePartTwo(path));
    }
}