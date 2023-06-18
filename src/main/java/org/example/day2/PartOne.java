package org.example.day2;

import java.util.List;

import static org.example.common.utils.DataReader.readFileAsList;
import static org.example.day2.utils.DataParser.parse;

public class PartOne {

    private PartOne() {}

    public static int solvePartOne(String path) {
        return solvePartOne(readFileAsList(path));
    }

    static int solvePartOne(List<String> dataList) {
        if (dataList.isEmpty()) {
            return 0;
        }
        SimpleSubmarine simpleSubmarine = new SimpleSubmarine(parse(dataList));
        simpleSubmarine.run();
        return simpleSubmarine.getDirection();
    }
}