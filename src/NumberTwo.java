public class NumberTwo {

    //2. Реализуйте сортировку выбором.

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int pos = i;
            int min = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    pos = j;
                    min = a[j];
                }
            }
            a[pos] = a[i];
            a[i] = min;
        }
    }

    public static void main(String[] args) {

        Util.arrayLength();
        int[] array2 = new int[Util.getCountOne()];
        Util.arrayPull(array2);
        Util.arrayShow(array2);
        sort(array2);
        Util.arrayShow(array2);

    }
}
