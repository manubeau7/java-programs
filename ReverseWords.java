public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Java is powerful";
        String[] words = sentence.split(" ");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result = result + words[i];
            if (i != 0) {
                result = result + " ";
            }
        }

        System.out.println(result);
    }
}
