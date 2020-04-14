package Challenge1.Algo;

import java.util.Scanner;

public class GCDSubRecCmd implements ICommand {

    int ergebnis;

    public int euclidSubstractionRecursive(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else if (a > b) {
            return euclidSubstractionRecursive(a - b, b);
        } else {
            return euclidSubstractionRecursive(a, b - a);
        }
    }

    @Override
    public void execute() {

        int[] nums = Console.askTwoInputs();
        ergebnis = euclidSubstractionRecursive(nums[0], nums[1]);
    }

    @Override
    public String toString() {
        return "Der GgT ist: " + ergebnis;
    }
}
