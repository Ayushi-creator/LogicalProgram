public class StringDivisionMostOptimized {

    public static void divideStringMostOptimized(String str, int n) {
        char[] chars = str.toCharArray();
        int length = chars.length;

        if (length % n != 0) {
            System.out.println("String cannot be divided into " + n + " equal parts");
            return;
        }

        int partSize = length / n;
        System.out.println("Original String: " + str);
        System.out.println("Dividing into " + n + " parts:\n");

        for (int part = 0; part < n; part++) {
            System.out.print("Part " + (part + 1) + ": ");

            int start = part * partSize;
            int end = start + partSize;

            for (int i = start; i < end; i++) {
                System.out.print(chars[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String str = "abcdefghijkl";
        int n = 4;

        divideStringMostOptimized(str, n);

    }
}