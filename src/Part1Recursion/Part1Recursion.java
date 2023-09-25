package Part1Recursion;

public class Part1Recursion {
    public static void printNumberBackward(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            printNumberBackward(n - 1);
        }
    }

    public static void printNumber(int n) {
        if (n > 0) {
            printNumber(n - 1);
            System.out.print(n + " ");
        }
    }
    public static void recursiveMethod(int n){
        recursiveMethod(n);
    }

    public static void main(String[] args) {
        System.out.println("Numbers Backward: ");
        printNumberBackward(9);
        System.out.println();

        System.out.println("Numbers: ");
        printNumber(9);

        System.out.println("Error: ");
        recursiveMethod(1);
    }


}