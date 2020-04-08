package Challenge1.Algo;

public class GCDDivRestRecCmd implements ICommand {

    int ergebnis;

    public int euclidDivisionRestIterative(int a, int b) {

        while (b != 0) {
            int h = a % b;
            a = b;
            b = h;
        }

        return  a;
    }

    @Override
    public void execute() {

        int[] nums = Console.input();
        ergebnis = euclidDivisionRestIterative(nums[0], nums[1]);
    }

    @Override
    public String toString() {
        return "Der GgT ist: " + ergebnis;
    }
}
