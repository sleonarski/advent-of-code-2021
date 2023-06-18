package org.example.day2;

import java.util.ArrayList;
import java.util.List;

import static org.example.day2.CommandInterpreter.*;

public class SimpleSubmarine implements Submarine {

    private int forwardValue;
    private int depthValue;
    private List<Command> commands;
    private int direction;

    public SimpleSubmarine(List<Command> commands) {
        this.forwardValue = 0;
        this.depthValue = 0;
        this.commands = new ArrayList<>(commands);
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
    public void run() {
        setDirection(simpleInterpretCommands(this));
    }
}