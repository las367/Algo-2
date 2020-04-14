package Challenge1.Algo;

public class GCDSubItCmd implements ICommand {

    private int ergebnis;

    public int euclidSubstractionIterative(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            while (b != 0) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }

            return a;
        }
    }

    @Override
    public void execute() {

        int[] nums = Console.askTwoInputs();
        ergebnis = euclidSubstractionIterative(nums[0], nums[1]);
    }

    @Override
    public String toString() {
        return "Der GgT ist: " + ergebnis;
    }
}
