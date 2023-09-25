package Part3Optional;

public class Part3Optinal {
    public static void printString(String s) {
        if (s.length() > 0) {
            System.out.println(s.charAt(0));
            printString(s.substring(1));
        }
    }

    public static void printReverseString(String s) {
        if (s.length() > 0) {
            printReverseString(s.substring(1));
            System.out.println(s.charAt(0));
        }
    }

    public static String reverseString(String s) {
        if (s.length() <= 1) {
            return s;
        } else {

            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }
    public static void main(String[] args) {
        String str = "It`s quite interesting method) ";

        System.out.println("Original string:");
        printString(str);

        System.out.println("Reverse string:");
        printReverseString(str);

        String reversed = reverseString(str);
        System.out.println("\nReversed String: " + reversed);
    }

}