package org.example.day2;

import java.util.List;

import static org.example.common.utils.DataReader.readFileAsList;
import static org.example.day2.utils.DataParser.parse;

public class PartTwo {

    private PartTwo(){}

    public static int solvePartTwo(String path) {
        return solvePartTwo(readFileAsList(path));
    }

    public static int solvePartTwo(List<String> dataList) {
        if (dataList.isEmpty()) {
            return 0;
        }
        AdvancedSubmarine advancedSubmarine = new AdvancedSubmarine();
        advancedSubmarine.run(parse(dataList));
        return advancedSubmarine.getDirection();
    }
}