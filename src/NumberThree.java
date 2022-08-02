public class NumberThree {

    //3. Реализуйте сортировку обменами.

    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Util.arrayLength();
        int[] array3 = new int[Util.getCountOne()];
        Util.arrayPull(array3);
        Util.arrayShow(array3);
        bubbleSort(array3);
        Util.arrayShow(array3);

    }
}
