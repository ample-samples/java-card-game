package org.example.commands;

import java.util.List;
import java.util.Scanner;

public class Commands {
    final private Scanner scanner = new Scanner(System.in);

    public int displayChoices(List<String> choices) {
        for (int i = 0; i < choices.size(); i++) {
            System.out.println(i + " " + choices.get(i));
        }

        return getUserChoice(choices);
    }

    public int getUserChoice(List<String> choices) {
        int input = -1;
        while (input >= choices.size() || input < 0) {
            System.out.printf("Please enter a number between 0 and %d\n",
                    choices.size() - 1);
            input = scanner.nextInt();
        }
        return input;
    }

    public boolean isQuitRequested() {
        System.out.println("Press 'Q' to return to main menu...");
        String input = scanner.next().trim();
        return input.equalsIgnoreCase("Q");
    }

//    public int getUserChoice(List<String> choices) {
//        int input = -1;
//        while (input >= choices.size() || input < 0) {
//            input = scanner.nextInt();
//            if (input >= choices.size() || input < 0) {
//                System.out.printf("Please enter a number between 0 and %d",
//                        choices.size() - 1);
//            }
//        }
//        return input;
//    }



}