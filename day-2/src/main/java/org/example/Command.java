package org.example;

public class Command {
    // forward 2
    private final String direction;
    private final int depth;
    private static int forwardValue = 0;
    private static int depthValue = 0;

    public Command(String input) {
        String[] splittedInput = input.split(" ");
        direction = splittedInput[0];
        depth = Integer.parseInt(splittedInput[1]);
    }

    public static void valid(Command command) {
        String direction = command.direction;

        switch (direction) {
            case "forward" -> {
                forwardValue += command.depth;
                System.out.println("forwardValue increased by: " + command.depth);
            }
            case "up" -> {
                depthValue -= command.depth;
                System.out.println("heightValue increased by: " + command.depth);
            }
            case "down" -> {
                depthValue += command.depth;
                System.out.println("heightValue decreased by: " + command.depth);
            }
            default -> System.out.println("unknown instruction: " + direction);

        }
            System.out.println("FV: " + forwardValue);
            System.out.println("HV: " + depthValue);
    }
}