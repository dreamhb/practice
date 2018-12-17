public class BM {
    public int bm(char[] text, char[] pattern) {
        int[] bc = new int[26];
        bc = generateBc(pattern);

        int n = text.length;
        int m = pattern.length;
        int i = 0;
        while (i < n - m) {
            int j;

            for (j = m - 1; j >= 0; --j) {
                if (text[i + j] != pattern[j]) {
                    break;
                }
            }

            if (j < 0) {
                //match successfully, return first index
                return i;
            }

            i = i + (j - bc[(int)text[i+j]);

        }

        return -1;
    }


    private void generateBc(char[] pattern) {
        int[] a = new int[pattern.length];

        for(int i = 0; i < pattern.length; i++) {
            a[i] = -1;
        }

        for (int j = 0; j < pattern.length; j++) {
            a[int(pattern[j])] = j;
        }

        return a;
    }
}
