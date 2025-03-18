public class BinaryString {
    public static void generateBinaryStrings(int n, String str, char lastChar) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        generateBinaryStrings(n - 1, str + "0", '0');
        if (lastChar != '1') {
            generateBinaryStrings(n - 1, str + "1", '1');
        }
    }

    public static void main(String[] args) {
        generateBinaryStrings(3, "", '0');
    }
}
