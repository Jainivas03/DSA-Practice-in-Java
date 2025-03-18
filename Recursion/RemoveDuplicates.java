public class RemoveDuplicates {
    public static String removeDuplicates(String str, int index, boolean[] seen) {
        if (index == str.length()) {
            return "";
        }
        char ch = str.charAt(index);
        if (seen[ch - 'a']) return removeDuplicates(str, index + 1, seen);
        seen[ch - 'a'] = true;
        return ch + removeDuplicates(str, index + 1, seen);
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("aabbccddeeff", 0, new boolean[26]));
    }
}
