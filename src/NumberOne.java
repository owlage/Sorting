public class NumberOne {

    /*1. Given two one-dimensional arrays with different numbers of elements and a natural number k. Merge them into one array,
    including the second array between the k-th and (k+1) - m elements of the first one.
    */

    public int[] newArray(int[] sum, int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < sum.length; i++) {
            if (i < Util.getNaturalNum()) {
                sum[i] = arr1[count];
                count++;
            }
            if (i == Util.getNaturalNum()) {
                for (int j = 0; j < arr2.length; j++) {
                    sum[i++] = arr2[j];
                }
            }
            if (i > Util.getNaturalNum()) {
                sum[i] = arr1[count];
                count++;
            }
        }
        return sum;
    }


    public static void main(String[] args) {

        NumberOne numberOne = new NumberOne();
        System.out.println("Specify the length of the 1st array");
        int[] arr1 = new int[Util.arrayLength()];
        System.out.println("Specify the length of the 2nd array");
        int[] arr2 = new int[Util.arrayLength()];
        Util.naturalNumber();
        Util.arrayPull(arr1);
        Util.arrayOverflowCheck(arr1);
        System.out.print("Array 1: ");
        Util.arrayShow(arr1);
        Util.arrayPull(arr2);
        System.out.print("Array 2: ");
        Util.arrayShow(arr2);
        System.out.print("New: ");
        int[] sum = new int[arr1.length + arr2.length];
        Util.arrayShow(numberOne.newArray(sum, arr1, arr2));
    }
}
