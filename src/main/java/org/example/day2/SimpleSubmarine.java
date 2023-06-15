package org.example.day2;

import java.util.List;

public class SimpleSubmarine implements Submarine {

    private int forwardValue;
    private int depthValue;

    public SimpleSubmarine() {
        this.forwardValue = 0;
        this.depthValue = 0;
    }

    @Override
    public int run(List<Command> commands) {

        for (Command command : commands) {
            switch (command.getDirection()) {
                case "forward" -> forwardValue += command.getValue();
                case "up" -> depthValue -= command.getValue();
                case "down" -> depthValue += command.getValue();
                default -> System.out.println("unknown instruction: " + command.getDirection());
            }
        }
        return forwardValue * depthValue;
    }
}