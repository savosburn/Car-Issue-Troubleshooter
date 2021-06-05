/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex23;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String output;
        String carSilent = myApp.initialPromptCarSilent();
        String corrodedTerminals;
        String slickingNoise;
        String crankUp;
        String engineStart;
        String fuelInjection;

        if (carSilent.equals("y")) {
            corrodedTerminals = myApp.batteryTerminals();
            output = myApp.corrodedTerminals(corrodedTerminals);
        }

        else {
            slickingNoise = myApp.slickingNoiseYesNo();

            if (slickingNoise.equals("y")) {
                output = myApp.slickingNoiseYes();
            }

            else {
                crankUp = myApp.doesCarCrank();

                if (crankUp.equals("y")) {
                    output = myApp.crankUpYes();
                }

                else {
                    engineStart = myApp.doesEngineStart();

                    if (engineStart.equals("y")) {
                        fuelInjection = myApp.hasFuelInjection();
                        output = myApp.fuelInjections(fuelInjection);
                    }

                    else {
                        output = myApp.engineStartNo();
                    }
                }
            }
        }

        myApp.printOutput(output);
    }

    public String initialPromptCarSilent() {
        System.out.print("Is the car silent when you turn the key? (Input: y/n) ");
        return in.nextLine().toLowerCase();
    }

    public String batteryTerminals() {
        System.out.print("Are the battery terminals corroded? (Input: y/n) ");
        return in.nextLine().toLowerCase();
    }

    public String corrodedTerminals(String decision) {
        if (decision.equals("y")) {
            return "Clean terminals and try starting again.";
        } else {
            return "Replace cables and try again.";
        }
    }

    public String slickingNoiseYesNo() {
        System.out.print("Does the car make a slicking noise? (Input: y/n) ");
        return in.nextLine().toLowerCase();
    }

    public String slickingNoiseYes() {
        return "Replace the battery.";
    }

    public String doesCarCrank() {
        System.out.print("Does the car crank up but fail to start? (Input: y/n) ");
        return in.nextLine().toLowerCase();
    }

    public String crankUpYes() {
        return "Check spark plug connections.";
    }

    public String doesEngineStart() {
        System.out.print("Does the engine start and then die? (Input: y/n) ");
        return in.nextLine().toLowerCase();
    }

    public String hasFuelInjection() {
        System.out.print("Does you car have fuel injection? (Input: y/n) ");
        return in.nextLine().toLowerCase();
    }

    public String fuelInjections(String fuel) {
        if (fuel.equals("y")) {
            return "Get it in for service.";
        } else {
            return "Check to ensure the choke is opening";
        }
    }

    public String engineStartNo() {
        return "This should not be possible.";
    }

    public void printOutput(String output) {
        System.out.print(output);
    }
}
