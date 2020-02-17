import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(encrypt("asdasdqwe"));
    }

    public static StringBuffer encrypt(String text) {
        int number = text.length();

        StringBuffer result = new StringBuffer();

        for (char c:text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                char ch = (char) (((int) c +
                        number - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) c +
                        number - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
}
