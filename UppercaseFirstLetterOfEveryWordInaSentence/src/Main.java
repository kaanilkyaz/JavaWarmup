public class Main {

    public static void main(String[] args) {
    }

    public static String upperCaseFirstLetterOfSentence(String sentence) {

        if(sentence != "" || sentence != null) {

            String[] words = sentence.split(" ");

            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            }

            sentence = String.join(" ", words);

            return sentence;
        }
        return null;

    }

}
