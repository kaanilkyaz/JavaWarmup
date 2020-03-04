public class Main {

    public static void main(String[] args) {

    }
    static int jumpingOnClouds(int[] c) {
        int num_jumps = 0;
        int i = 0;

        while (i < c.length - 1) {
            if (i + 2 == c.length || c[i + 2] == 1) {
                i++;
                num_jumps++;
            } else {
                i += 2;
                num_jumps++;
            }
        }
        return num_jumps;
    }
}
