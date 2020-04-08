package Challenge1.Algo;

public class SiebDesEratos implements ICommand {

    private int[] ergebnis;
    private int index = 0;

    public int[] siebDesEratothenes(int a, int[] b) {

        ergebnis[index] = a;
        index++;
        int initialNumOfUnprime = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % a == 0) {
                b[i] = 0;
                initialNumOfUnprime++;
            }
        }

        int j = 0;
        int[] array = new int[b.length - initialNumOfUnprime];
        for (int i = 0; i < b.length; i++)  {
            if (b[i] != 0) {
                array[j] = b[i];
                j++;
            }
        }

        if (array.length > 0) {
            return siebDesEratothenes(array[0], array);
        } else return ergebnis;
    }

    @Override
    public void execute() {

        System.out.println("Bitte geben Sie zwei Zahlen ab 2 bis zu einer beliebigen Zahl ein. Die Zahl x soll kleiner als y sein");
        int[] nums = Console.input();
        if (nums[0] > nums[1]) {
            nums = Console.input();
        }

        int[] array = new int[nums[1] - nums[0] + 1];
        int j = 0;
        for (int i = nums[0]; i < nums[1]; i++) {
            array[j] = i;
            j++;
        }

        siebDesEratothenes(nums[0], array);
    }

    @Override
    public String toString() {
        return ergebnis.toString();
    }
}
