public class StringSubsets {

    public static void main(String[] args) {

        String str = "FUN";
        int length = str.length();

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }
}
