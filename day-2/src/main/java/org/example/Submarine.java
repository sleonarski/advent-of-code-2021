package org.example;

import java.util.List;

public class Submarine {
    private int forwardValue;
    private int depthValue;
    private int sumValue;

    private int aim;

    public Submarine(int forwardValue, int depthValue, int aim) {
        this.forwardValue = forwardValue;
        this.depthValue = depthValue;
        this.aim = aim;
    }

    public Submarine(List<Command> commands) {
        this.forwardValue = 0;
        this.depthValue = 0;

        for (Command command : commands) {
            calculate(command);
        }
        this.sumValue = forwardValue * depthValue;
    }

    private void calculate(Command command) {

        switch (command.getDirection()) {
            case "forward" -> forwardValue += command.getValue();
            case "up" -> depthValue -= command.getValue();
            case "down" -> depthValue += command.getValue();
            default -> System.out.println("unknown instruction: " + command.getDirection());
        }
    }

    public int getForwardValue() {
        return forwardValue;
    }

    public int getDepthValue() {
        return depthValue;
    }

    public int getSumValue() {
        return sumValue;
    }

    public int getAim() {
        return aim;
    }
}
