package org.example;

public class Command {

    private final String direction;
    private int value;

    public Command(String input) {
        String[] splittedInput = input.split(" ");
        this.direction = splittedInput[0];
        if (isDigit(splittedInput[1])) {
            this.value = Integer.parseInt(splittedInput[1]);
        }
    }

    public String getDirection() {
        return direction;
    }

    public int getValue() {
        return value;
    }

    private static boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
