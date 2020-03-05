public class SumCharAndPrintAsAString {

    public static String SumChar(String string) {
        char[] arr = string.toCharArray();
        int size = arr.length;
        int count = 1;
        String s = "";

        for (int i = 1; i < size; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
                if (i == arr.length - 1) {
                    s += (Character.toString(arr[i - 1]) + count);
                }
            } else {
                if (count != 1) {
                    s += (Character.toString(arr[i - 1]) + count);
                    count = 1;
                } else {
                    s += Character.toString(arr[i - 1]);
                }
            }
        }
        return s;
    }
}
