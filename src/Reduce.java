public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = 0;

        while (n != 0) {

            boolean b = (n % 2 == 0);
            if (b) {
                n /= 2;
            }
            else {
                n = n-1;
            }
            steps += 1;
        }
        System.out.println(steps);
    }
}
