public class Main {

    public static void main(String[] args) {
        System.out.println(integerReversal(123455));

    }

    public static int integerReversal(int number) {
        if (number < 0) {
            number *= -1;
            return reverse(number)*-1;
            } else {
             return reverse(number);
        }
    }

    public static int reverse(int number){
        int remainder;
        String s = "";
        while (number > 0) {
            remainder = number % 10;
            number /= 10;
            s += remainder;
        }
        return Integer.parseInt(s);
    }
}
