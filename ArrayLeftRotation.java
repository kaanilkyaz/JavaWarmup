public class ArrayLeftRotation {
    static int[] rotLeft(int[] a, int d) {
        int size = a.length;
        for (int i = 0; i < d; i++) {
            int temp = 0;
            temp = a[0];
            for (int j = 0; j <size; j++) {
                a[size - (size - j)] = size - 1 == j ? temp : a[size - (size - (j + 1))];
            }
        }
        return a;

    }
}
