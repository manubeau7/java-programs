public class ArmstrongRange {
    public static void main(String[] args) {
        int start = 100;
        int end = 1000;

        for (int i = start; i <= end; i++) {
            int temp = i;
            int digits = 0;

          
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            temp = i;
            int sum = 0;
            while (temp > 0) {
                int d = temp % 10;
                int power = 1;
                for (int p = 0; p < digits; p++) {
                    power = power * d;
                }
                sum = sum + power;
                temp = temp / 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
