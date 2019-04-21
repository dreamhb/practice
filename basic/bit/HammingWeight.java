public class HammingWeight {
    public static void main(String[] args) {
        HammingWeight hw = new HammingWeight();
        String input = args[0];
        int in = Integer.valueOf(input);
        String binary = Integer.toBinaryString(in);

        System.out.println(String.format("bit count of %s %s is %d", input, binary, hw.bitCount(in)));
        System.out.println(String.format("bit count v2 of %s %s is %d", input, binary, hw.bitCountV2(in)));
    }


    public int bitCount(int i) {
        if (i == 0) {
            return 0;
        }

        int count = 0;
        while (i != 0) {
            if ((i & 1) == 1) {
                count++;
            }

            i = i >>> 1;
        }

        return count;
    }

    public int bitCountV2(int i) {
        if (i == 0) {
            return 0;
        }

        int count = 0;
        while (i != 0) {
            count++;
            i = i & (i-1);
        }

        return count;
    }
}
