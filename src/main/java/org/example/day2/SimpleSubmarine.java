package org.example.day2;

import java.util.List;

public class SimpleSubmarine implements Submarine {

    private int forwardValue;
    private int depthValue;
    private List<Command> commands;
    private int direction;

    public SimpleSubmarine() {
        this.forwardValue = 0;
        this.depthValue = 0;
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

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    @Override
    public void run(List<Command> commands) {

        for (Command command : commands) {
            switch (command.getDirection()) {
                case "forward" -> forwardValue += command.getValue();
                case "up" -> depthValue -= command.getValue();
                case "down" -> depthValue += command.getValue();
                default -> throw new RuntimeException();
            }
        }
        setDirection(forwardValue * depthValue);
    }
}