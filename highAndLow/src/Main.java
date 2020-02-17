import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String a = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";

        /*System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        System.out.println(a.toCharArray());
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(maxSubArraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));*/
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {1056521,7,17,206847684,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        System.out.println(find(exampleTest1));
        System.out.println(find(exampleTest2));
        System.out.println(find(exampleTest3));

    }


    public static String highAndLow(String numbers) {
        String[] array = numbers.split(" ");
        int[] number = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            number[i] = (Integer.parseInt(array[i]));
        }
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (number[j] < number[j - 1]) {
                    temp = number[j];
                    number[j] = number[j - 1];
                    number[j - 1] = temp;
                }
            }
        }
        int highest = number[number.length - 1];
        int lowest = number[0];

        return String.valueOf(highest) + " " + String.valueOf(lowest);
    }

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    public static int maxSubArraySum(int a[]) {

        int max_so_far = 0, max_ending_here = 0;

        for (int i = 0; i < a.length; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_ending_here < 0)
                max_ending_here = 0;

            else if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;

        }
        return max_so_far;
    }

    public static int find(int[] integers) {
        int countEven = 0;
        int countOdd = 0;
        int number = 0;
        for (int i = 0; i < integers.length; i++) {

            if (integers[i] % 2 == 0) {
                countEven++;
                if (countEven == 1) {
                    number = integers[i];
                }
            }
            if (integers[i] % 2 == 1) {
                countOdd++;
                if (countOdd == 1) {
                    number = integers[i];
                }
            }

        }

        return number;
    }
}

