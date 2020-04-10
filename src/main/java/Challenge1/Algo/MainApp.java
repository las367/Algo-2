package Challenge1.Algo;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.jar.JarInputStream;

public class MainApp {

    public static void showMenu() {
        System.out.println("Console-Application: Exercise-1\n" +
                " 1. Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm subtraction\n" +
                " 2. Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm subtraction\n" +
                " 3. Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm division rest\n" +
                " 4. Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm division rest\n" +
                " 5. Sieve of Eratosthanes\n" +
                " 0. Exit\n" +
                " Please enter a number for an option:");
    }

    public static void useCommand(ICommand cmd) {
        cmd.execute();
        System.out.println(cmd.toString());
    }

    public static void main(String[] args) {

        LinkedList<ICommand> commands = new LinkedList<ICommand>();
        CommandFactory cmdFactory = new CommandFactory();

        commands.add(cmdFactory.createGCDSubRecCmd());
        commands.add(cmdFactory.createGCDSubItCmd());
        commands.add(cmdFactory.createGCDDivRestRecCmd());
        commands.add(cmdFactory.createGCDDivRestIteCmd());
        commands.add(new SiebDesEratos());

        Scanner in = new Scanner(System.in);
        int userInput = 6;


        while (userInput != 0) {
            showMenu();
            userInput = in.nextInt();

            switch (userInput) {
                case 1:
                    ICommand cmdOne = commands.get(0);
                    useCommand(cmdOne);
                    break;

                case 2:
                    ICommand cmdTwo = commands.get(1);
                    useCommand(cmdTwo);
                    break;

                case 3:
                    ICommand cmdThree = commands.get(2);
                    useCommand(cmdThree);
                    break;

                case 4:
                    ICommand cmdFour = commands.get(3);
                    useCommand(cmdFour);
                    break;

                case 5:
                    ICommand cmdFive = commands.get(4);
                    cmdFive.execute();

                case 6:
                    break;

                default:
                    System.out.println("Please enter another number");
                    break;
            }
        }
    }
}
