public class NewYearChaos {

    static void minimumBribes(int[] q) {

        int count = 0;
        int temp = q[0];

            for (int j = 1; j < q.length / 2; j++) {
                if (temp > q[j]) {
                    count++;
                    temp = q[j];
                }else{
                    temp = q[j];
                }

        }
        System.out.println(count);
    }

    // 2 1 5 3 4

}
