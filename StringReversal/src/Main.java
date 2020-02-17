import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(stringReversal("asda"));
        System.out.println(stringReversal(new StringBuffer("asda")));
    }

    public static String stringReversal(String word){
        char[] ch = word.toCharArray();
        char temp;
        for(int i = 0; i<word.length()/2;i++){
            temp = ch[i];
            ch[i] = ch[word.length()-i-1];
            ch[word.length()-i-1] = temp;
        }

        return String.valueOf(ch);
    }

    public static StringBuffer stringReversal(StringBuffer word){
        return word.reverse();
    }
}
