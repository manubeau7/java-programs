public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 25;
        String binary = "";

        if (num == 0) {
            binary = "0";
        }

        while (num > 0) {
            int rem = num % 2;
            binary = rem + binary;
            num = num / 2;
        }

        System.out.println("Binary: " + binary);
    }
}
