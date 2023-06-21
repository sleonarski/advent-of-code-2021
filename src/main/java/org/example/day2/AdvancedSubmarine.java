package org.example.day2;

import java.util.List;

public class AdvancedSubmarine implements Submarine{

    private int forwardValue;
    private int depthValue;
    private List<Command> commands;
    private int direction;

    public AdvancedSubmarine() {
        this.forwardValue = 0;
        this.depthValue = 0;
        this.direction = 0;
    }

    public int getForwardValue() {
        return forwardValue;
    }

    public void setForwardValue(int forwardValue) {
        this.forwardValue = forwardValue;
    }

    public int getDepthValue() {
        return depthValue;
    }

    public void setDepthValue(int depthValue) {
        this.depthValue = depthValue;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    @Override
    public void run(List<Command> commands) {

        int aim = 0;
        for (Command command : commands) {
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
        setDirection(forwardValue * depthValue);
    }
}