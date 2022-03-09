import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {

        int thisArray[] = new int []{2, 4, 5, 10, 22};
        System.out.println(Arrays.toString(thisArray));

        System.out.println("The sum of all numbers contained in the array is: " + calculateSum(thisArray));

    }

    static public int calculateSum (int[] thisArray) {
        int sum = 0;

        for (int i = 0; i < thisArray.length; i++) {

            sum = sum + thisArray[i];
        }
        return sum;
    }
}




