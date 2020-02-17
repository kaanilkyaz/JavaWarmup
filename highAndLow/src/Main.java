import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

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

}

