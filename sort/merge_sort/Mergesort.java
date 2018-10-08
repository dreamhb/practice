public class Mergesort {
    public void mergesort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergesort(arr, left, middle);
            mergesort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    /**
     * merge arr from left to middle and middle + 1 to right
     * */
    public void merge(int[] arr, int left, int middle, int right) {
        int lengthL = middle - left + 1;
        int lengthR = right - middle + 1;

        int[] l = new int[lengthL];
        int[] r = new int[lengthR];

        int i = 0;
        while (i < lengthL) {
            l[i] = arr[i + left];
            ++i;
        }

        int j = 0;
        while (j < lengthR) {
            r[j] = arr[j + middle + 1];
            j++;
        }

        int ii = 0;
        int jj = 0;
        int index = left;
        while (ii < lengthL && jj < lengthR) {
            if (l[ii] <= r[jj]) {
                arr[index] = l[ii];
                ii++;
            } else {
                arr[index] = r[jj];
                jj++;
            }
            index++;
        }

        //add rest of l
        while (ii < lengthL) {
            arr[index] = l[ii];
            ii++;
            index++;
        }

        //add rest of r
        while (jj < lengthR) {
            arr[index] = r[jj];
            index++;
            jj++;
        }

        //complete
    }
}
