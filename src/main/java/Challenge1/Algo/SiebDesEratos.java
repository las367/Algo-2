package Challenge1.Algo;

import java.util.LinkedList;

public class SiebDesEratos implements ICommand {

    private LinkedList<Integer> ergebnis = new LinkedList<Integer>();
    private int von = 0;
    private int bis = 0;

    public void siebDesEratothenes(int[] array) {

        //try every number inside the array of array.
        for (int i = 0; i < array.length; i++) {
            //if a number inside array b is 0, that means the number is not a prime number
            if (array[i] != 0) {
                //if the next number is a prime number, add the number to the linked list ergebnis, then mark all of the composite
                //of the number as prime number
                ergebnis.add(array[i]);
                for (int j = i+1; j < array.length; j++) {
                    if (array[j] % array[i] == 0) {
                        array[j] = 0;
                    }
                }
            }
            //repeat until the end of the array
        }
    }

    public static int[] createAnArray(int a, int b) {

        int min, max;

        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }

        int[] array = new int[ max - min + 1];
        int index = 0;

        for (int i = min; i <= max; i++) {
            array[index] = i;
            index++;
        }

        return  array;
    }

    @Override
    public void execute() {

        System.out.println("Bitte geben Sie zwei Zahlen ein. Die Zahl kann nicht 1 sein. Der Algorithmus soll die Primzahlen zwischen den gegebenen Zahlen ausrechnen");
        int[] nums = Console.input();

        if (nums[1] == 0 || nums[0] == 0) {
            System.out.println("Bitte geben Sie die Zahlen erneut");
            nums = Console.input();
        } else if (nums[0] == nums[1]) {
            System.out.println("Bitte geben Sie die Zahlen erneut");
            nums = Console.input();
        } else {
            int[] array = createAnArray(nums[0], nums[1]);
            von = array[0];
            bis = array[array.length-1];
            siebDesEratothenes(array);
            System.out.println(toString());
        }
    }


    @Override
    public String toString() {
        String toReturn = ergebnis.toString();
        ergebnis.clear();
        return "Die Primzahlen von " + von + " bis " + bis + " sind: " + toReturn;
    }
}
