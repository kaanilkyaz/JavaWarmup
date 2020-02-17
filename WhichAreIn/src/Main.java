import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long count = strList.stream()
                .filter(x -> x.isEmpty())
                .count();
        long num = strList.stream()
                .filter(x -> x.length()> 3)
                .count();
        System.out.printf("List %s has %d strings of length more than 3 %n",
                strList, num);
        System.out.printf("List %s has %d empty strings %n", strList, count);
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        System.out.println(Arrays.toString(inArray(a,b)));
    }

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> result = new LinkedHashSet<>();
        String arr[];

        for (String s : array1)
            for (String i : array2)
                if (i.contains(s))
                    result.add(s);


        arr = new String[result.size()];
        return result.toArray(arr);
    }


    }

