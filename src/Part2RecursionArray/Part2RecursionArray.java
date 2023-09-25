package Part2RecursionArray;
import java.util.Random;

public class Part2RecursionArray {
    public static void printArray(int[] array, int i) {
        if (i >= 0 && i < array.length) {
            System.out.print(array[i] + " ");
            printArray(array, i + 1);
        }
    }
    public static int[] randomArray(int length) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static int arraySum(int[] array, int i) {
        if (i >= 0 && i < array.length) {
            return array[i] + arraySum(array, i + 1);
        }
        return 0;


    }
    public static int findCountInArray(int[] array, int what, int i) {
        if (i >= 0 && i < array.length) {
            if (array[i] == what) {
                return 1 + findCountInArray(array, what, i + 1);
            } else {
                return findCountInArray(array, what, i + 1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] randomArray = randomArray(7);
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        System.out.println("Array elements:");
        printArray(randomArray, 0);

        int sum = arraySum(randomArray, 0);
        System.out.println("\nSum of elements: " + sum);

        int valueToFind = randomNumber;
        int count = findCountInArray(randomArray, valueToFind, 0);
        System.out.println("Number of elements equals to " + valueToFind + ": " + count);
    }

}


