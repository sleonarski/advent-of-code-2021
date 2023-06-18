package org.example.day2;

public class CommandInterpreter {
    public static int simpleInterpretCommands(SimpleSubmarine submarine) {
        int forwardValue = submarine.getForwardValue();
        int depthValue = submarine.getDepthValue();

        for (Command command : submarine.getCommands()) {
            switch (command.getDirection()) {
                case "forward" -> forwardValue += command.getValue();
                case "up" -> depthValue -= command.getValue();
                case "down" -> depthValue += command.getValue();
                default -> throw new RuntimeException();
            }
        }
        return forwardValue * depthValue;
    }

    public static int advancedInterpretCommands(AdvancedSubmarine submarine) {
        int forwardValue = submarine.getForwardValue();
        int depthValue = submarine.getDepthValue();
        int aim = 0;
        for (Command command : submarine.getCommands()) {
            switch (command.getDirection()) {
                case "forward" -> {
                    forwardValue += command.getValue();
                    depthValue += aim * command.getValue();
                }
                case "up" -> aim -= command.getValue();
                case "down" -> aim += command.getValue();
                default -> throw new RuntimeException();
            }
        }
        return forwardValue * depthValue;
    }
}
