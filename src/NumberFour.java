public class NumberFour {

    //4. Implement insertion sort.

    static void sortByInserts(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int z = i - 1;
            while (z >= 0 && array[z] > value) {
                array[z + 1] = array[z];
                z--;
            }
            array[z + 1] = value;
        }
    }

    public static void main(String[] args) {

        Util.arrayLength();
        int[] array4 = new int[Util.getCountOne()];
        Util.arrayPull(array4);
        Util.arrayShow(array4);
        sortByInserts(array4);
        Util.arrayShow(array4);

    }
}
