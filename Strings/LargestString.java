public class LargestString {
    // Print the largest string from an array of strings
    public static String largestString(String[] words) {
        String largest = words[0];
        for (String word : words) {
            if (word.compareTo(largest) > 0) {
                largest = word;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "mango", "peach"};
        System.out.println("Largest string: " + largestString(words));
    }
}
