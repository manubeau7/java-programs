public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        System.out.print("Duplicate elements: ");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean alreadyPrinted = false;

            // check if this number came before
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    alreadyPrinted = true;
                }
            }

            // count how many times it appears
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            if (count > 1 && alreadyPrinted == false) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
