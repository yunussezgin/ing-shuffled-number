public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println(solution1(130));

        System.out.println(solution1(123456));
    }

    public static int solution1(int A) {
        String strA = String.valueOf(A);
        String strB = "";
        int loopCount = strA.length() / 2;

        for (int i = 0; i < loopCount; i++) {
            strB += strA.charAt(i);
            strB += strA.charAt(strA.length() - 1 - i);
        }

        if (strA.length() % 2 == 1) {
            strB += strA.charAt(strA.length() / 2);
        }

        return Integer.parseInt(strB);
    }
}