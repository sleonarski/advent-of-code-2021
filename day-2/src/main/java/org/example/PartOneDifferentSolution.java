package org.example;

import java.util.List;

public class PartOneDifferentSolution {
    /*
    forward 5
    down 5
    forward 8
    up 3
    down 8
    forward 2
     */

    public static int solvePartOne(String path) {

        List<String> dataList = DataReader.getDataFromFile(path);

        if (dataList.isEmpty()) {
            return 0;
        }

        dataList.stream().map(Command::new).forEach(Command::valid);

        dataList.forEach(System.out::println);

        return 0;
    }
}