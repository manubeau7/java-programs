public class PrimeRange {
    public static void main(String[] args) {
        int start = 10;
        int end = 50;
        int count = 0;

        System.out.print("Prime numbers: ");
        for (int i = start; i <= end; i++) {
            if (i < 2) {
                continue;
            }

            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count: " + count);
    }
}
Output:
