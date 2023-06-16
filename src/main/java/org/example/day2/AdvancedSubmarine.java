package org.example.day2;

import java.util.List;

public class AdvancedSubmarine implements Submarine{

    private int forwardValue;
    private int depthValue;

    public AdvancedSubmarine() {
        this.forwardValue = 0;
        this.depthValue = 0;
    }

    //TODO extract this logic of method to another class
    @Override
    public int run(List<Command> commands) {

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
                //TODO: add exception here
            }
        }
        return forwardValue * depthValue;
    }
}