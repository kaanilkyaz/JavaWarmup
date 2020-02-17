import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(arrayIntersection(new int[]{1,2,3,4},new int[]{1,3,5,6}));
    }

    public static Set arrayIntersection(int[] array1, int[] array2){
        HashSet<Integer> set1 = new HashSet();
        HashSet<Integer> set2 = new HashSet();

        for(int i : array1){
            set1.add(i);
        }

        for (int i : array2){
            set2.add(i);
        }

        HashSet<Integer> intersection = new HashSet(set1);
        intersection.retainAll(set2);

        return intersection;
    }
}
