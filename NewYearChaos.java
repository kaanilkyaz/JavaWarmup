import java.util.HashMap;

public class NewYearChaos {

    static void minimumBribes(int[] q) {

        int count = 0;
        int total = 0;
        boolean caotic = false;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < q.length; j++) {
            int temp = q[j];
            for (int i = j; i < q.length; i++) {
                if (temp > q[i]) {
                    count++;
                    total++;
                    map.put(temp, total);

                } else {
                    total = 0;
                    map.put(temp, total);
                }
                if (map.get(temp) > 2) {
                    caotic = true;
                }
            }
        }
        if (caotic) {
            System.out.println("Too chaotic");

        } else {

            System.out.println(count);
        }
    }

    // 2 1 5 3 4

}
