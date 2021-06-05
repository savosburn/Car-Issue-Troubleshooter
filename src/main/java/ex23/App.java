/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex23;

import java.util.Scanner;

/*
An expert system is a type of artificial intelligence program that uses a knowledge base and a set of rules to perform a
task that a human expert might do. Many websites are available that will help you self-diagnose a medical issue by
answering a series of questions. And many hardware and software companies offer online troubleshooting tools to help people
solve simple technical issues before calling a human.

Create a program that walks the user through troubleshooting issues with a car. Use the following decision tree to
build the system:

if (Is the car silent when you turn the key?) then (yes)
    if (Are the battery terminals corroded?) then (yes)
        :Clean terminals and try starting again.;
        stop
    else (no)
        :Replace cables and try again.;
        stop
    endif
else (no)
    if (Does the car make a slicking noise?) then (yes)
        :Replace the battery.;
        stop
    else (no)
        if (Does the car crank up but fail to start?) then (yes)
            :Check spark plug connections.;
            stop
        else (no)
            if (Does the engine start and then die?) then (yes)
                if (Does you car have fuel injection?) then (yes)
                    :Get it in for service.;
                    stop
                else (no)
                    :Check to ensure the choke is opening and closing.;
                    stop
                endif
            else (no)
                :This should not be possible.;
                stop
            endif
        endif
    endif
endif

Is the car silent when you turn the key? y
Are the battery terminals corroded? n
The battery cables may be damaged.
Replace cables and try again.
Constraint
Ask only questions that are relevant to the situation and to the previous answers. Don’t ask for all inputs at once.
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String output = myApp.decisionTree();
        myApp.printOutput(output);
    }

    public String decisionTree() {
        String decision = null;

        System.out.print("Is the car silent when you turn the key? (input: y/n) ");
        decision = in.nextLine().toLowerCase();

        if (decision.equals("y")) {
            System.out.print("Are the battery terminals corroded? (input: y/n) ");
            decision = in.nextLine().toLowerCase();

            if (decision.equals("y")) {
                return "Clean the terminals and try starting again.";

            } else {
                return "Replace cables and try again.";
            }
        } else {
            System.out.print("Does the car make a slicking noise? (input: y/n) ");
            decision = in.nextLine().toLowerCase();

            if (decision.equals("y")) {
                return "Replace the battery.";
            } else {
                System.out.print("Does the car crank up but fail to start? ");
                decision = in.nextLine().toLowerCase();

                if (decision.equals("y")) {
                    return "Check spark plug connections.";
                } else {
                    System.out.print("Does the engine start and then die? ");
                    decision = in.nextLine().toLowerCase();

                    if (decision.equals("y")) {
                        System.out.print("Does your car have fuel injection?");
                        decision = in.nextLine().toLowerCase();

                        if (decision.equals("y")) {
                            return "Get it in for service.";
                        } else {
                            return "Check to ensure the choke is opening and closing.";
                        }
                    } else {
                        return "This should not be possible.";
                    }
                }
            }
        }
    }

    public void printOutput(String output) {
        System.out.println(output);
    }
}
