import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] firstArray = new int[] {1, 2, 3, 4};
        System.out.println("Original order: " + Arrays.toString(firstArray));

        int[] newArray = reverse(firstArray);
        System.out.println("New order: " + Arrays.toString(newArray));

    }

    public static int[] reverse (int[] firstArray) {
        int[] newArray = new int[firstArray.length];

        for (int number = firstArray.length -1; number >= 0; number--) {

            newArray[firstArray.length -1 - number] = firstArray[number];

        }

        //System.out.println(Arrays.toString(newArray));

//        //while (newArray.length == firstArray.length) {
//            newArray
//        }
        return newArray;
    }

}


