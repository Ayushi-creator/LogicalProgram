public class StringDivisionBruteForce {


    public static void divideStringBruteForce(String str, int n) {
        int length = getLength(str);

        if (length % n != 0) {
            System.out.println("String cannot be divided into " + n + " equal parts");
            return;
        }

        int partSize = length / n;
        System.out.println("Original String: " + str);
        System.out.println("Dividing into " + n + " parts:\n");
        for (int i = 0; i < n; i++) {
            System.out.print("Part " + (i + 1) + ": ");
            int startIndex = i * partSize;
            int endIndex = startIndex + partSize;
            for (int j = startIndex; j < endIndex; j++) {
                System.out.print(getCharAt(str, j));
            }
            System.out.println();
        }
    }
    public static int getLength(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            count++;
        }
        return count;
    }
    public static char getCharAt(String str, int index) {
        char[] chars = str.toCharArray();
        return chars[index];
    }

    public static void main(String[] args) {
        String str = "HelloWorldJava";
        int n = 2;

        divideStringBruteForce(str, n);

    }
}