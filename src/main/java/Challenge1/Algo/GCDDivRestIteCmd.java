package Challenge1.Algo;

public class GCDDivRestIteCmd implements ICommand {

    int ergebnis;

    public int euclidDivisionRestRecursive(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return euclidDivisionRestRecursive(b, a % b);
        }
    }

    @Override
    public void execute() {

        int[] nums = Console.input();
        ergebnis = euclidDivisionRestRecursive(nums[0], nums[1]);
    }

    @Override
    public String toString() {
        return "Der GgT ist: " + ergebnis;
    }
}
