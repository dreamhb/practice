public class LPS {
    public static void main(Stirng[] args) {
        String input = "xxxxxx";
        char[] ch = input.toCharArray();
        int length = input.length();
        int result = lps(ch, 0, n - 1);
        System.out.println("the length of the longest palindromic substring is " + result);
    }


    private static int lps(char[] ch, int i, int j) {
        //base case 1: has only one char
        if (i == j) {
            return 1;
        }
        
        //base case 2: has only two chars and same
        if (ch[i] == ch[j] && i + 1 == j) {
            return 2;
        }

        if (ch[i] == ch[j]) {
            return lps(ch, i + 1, j - 1) + 2;
        }

        return max(lps(i, j - 1), lps(i+1, j));
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}
