package org.example;

import static org.example.DayTwoPartOne.solvePartOne;
import static org.example.DayTwoPartTwo.solvePartTwo;

//TODO: delete day-2 module, add Submarine class that can takes commands, try with collect/reduce
class DayTwo {

    public static void main(String[] args) {

        String path = ("day-2/src/main/resources/data.txt");

        System.out.println(solvePartOne(path));
        System.out.println(solvePartTwo(path));
    }
}