package org.example;

import java.util.List;

public class PartTwo {
    /*
    forward 5
    down 5
    forward 8
    up 3
    down 8
    forward 2
     */

    public static int solvePartTwo(String path) {

        List<String> dataList = DataReader.getDataFromFile(path);

        if (dataList.isEmpty()) {
            return 0;
        }
        return calculate(parse(dataList));
    }

    private static List<Command> parse(List<String> dataList) {
        return dataList.stream().map(Command::new).toList();
    }

    private static int calculate(List<Command> commands) {
        int forwardValue = 0;
        int depthValue = 0;
        int aim = 0;
        for (Command command : commands) {
            switch (command.getDirection()) {
                case "forward" -> {
                    forwardValue += command.getValue();
                    depthValue += aim * command.getValue();
                }
                case "up" -> aim -= command.getValue();
                case "down" -> aim += command.getValue();
                default -> System.out.println("unknown instruction: " + command.getDirection());
            }
        }
        return forwardValue * depthValue;
    }
}