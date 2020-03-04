public class Array2DFindMaxHourGlass {

    static int hourglassSum(int[][] arr) {

        int max = Integer.MIN_VALUE;
        int total = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 2; j++) {
                total = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (total > max) {
                    max = total;
                }
            }
        }
        return max;

    }
}

