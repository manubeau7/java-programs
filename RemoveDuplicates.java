public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};
        int[] result = new int[arr.length];
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < size; j++) {
                if (result[j] == arr[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[size] = arr[i];
                size++;
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
