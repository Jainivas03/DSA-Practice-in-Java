public class ConvertUppercase {

    // Convert first letter of each word to uppercase
    public static String convertToUppercase(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "hello world! i am jainivas.";
        System.out.println(convertToUppercase(sentence));
    }
}
