public class Mergesort {

    /**
     * divide array to single item
     *
     **/
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
        int lengthR = right - middle;

        int[] l = new int[lengthL];
        int[] r = new int[lengthR];

        // copy subarray item to subarray
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

        //merge two subarrays and sort
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

        //add rest of l if exist
        while (ii < lengthL) {
            arr[index] = l[ii];
            ii++;
            index++;
        }

        //add rest of r if exist
        while (jj < lengthR) {
            arr[index] = r[jj];
            index++;
            jj++;
        }

        //done
    }
}
