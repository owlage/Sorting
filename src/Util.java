import java.util.Scanner;

public class Util {

    private static int countOne, naturalNum;

    public static int getCountOne() {
        return countOne;
    }

    public static void setCountOne(int countOne) {
        Util.countOne = countOne;
    }

    public static int getNaturalNum() {
        return naturalNum;
    }

    public static void setNaturalNum(int naturalNum) {
        Util.naturalNum = naturalNum;
    }

    public static int arrayLength() {
        System.out.println("Enter the length of the array");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            countOne = sc.nextInt();
            if (countOne < 2) {
                System.out.println("Please enter a number greater than 2");
                arrayLength();
            }
        } else {
            System.out.println("Enter an integer");
            arrayLength();
        }
        return countOne;
    }

    public static void naturalNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number");
        if (sc.hasNextInt()) {
            naturalNum = sc.nextInt();
            if (naturalNum < 1) {
                System.out.println("Please enter a number greater than 1");
                arrayLength();
            }
        } else {
            System.out.println("Enter an integer");
            arrayLength();
        }
    }

    public static void arrayOverflowCheck(int[] arr) {
        while (naturalNum > arr.length) {
            System.out.println("You entered a number greater than the array");
            naturalNumber();
        }
    }

    public static void arrayPull(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
    }

    public static void arrayShow(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
