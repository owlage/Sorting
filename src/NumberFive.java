public class NumberFive {

    //5. Реализуйте сортировку Шелла.

    static void sortShella(int[] array) {
        int i, j, step;
        int tmp;
        for (step = Util.getCountOne() / 2; step > 0; step /= 2)
            for (i = step; i < Util.getCountOne(); i++) {
                tmp = array[i];
                for (j = i; j >= step; j -= step) {
                    if (tmp < array[j - step])
                        array[j] = array[j - step];
                    else
                        break;
                }
                array[j] = tmp;
            }
    }

    public static void main(String[] args) {

        Util.arrayLength();
        int[] array5 = new int[Util.getCountOne()];
        Util.arrayPull(array5);
        Util.arrayShow(array5);
        sortShella(array5);
        Util.arrayShow(array5);

    }
}
