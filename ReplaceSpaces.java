public class ReplaceSpaces {

    public static String replaceSpacesCharArray(String str, char replacement) {
        if (str == null) return null;

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                chars[i] = replacement;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "Hello World Java Programming";

        System.out.println("Original: " + str);
        System.out.println("Replace with '_': " + replaceSpacesCharArray(str, '_'));

    }
}