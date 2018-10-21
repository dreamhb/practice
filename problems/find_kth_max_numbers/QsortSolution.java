package find_kth_max_numbers;

public class QsortSolution {
    public int findKthMaxNumber(int[] arr, int k, int left, int right) {

        if (arr.length == 0) {
            return -1; // no value
        }

        //get pivot's index
        int index = part(arr, left, right);
        if (k - 1 == index) {
            return arr[index];// value found
        } else if (k - 1 > index) {
            //means the kth number is in A[index+1, n-1]
            return findKthMaxNumber(arr, k - index - 1, index + 1, arr.length - 1);
        } else {
            // the kth number is arr[0, index - 1]
            return findKthMaxNumber(arr, k, 0, index - 1);
        }
    }


    private int part(int[] arr, int left, int right) {
        int pivot = arr[left];

        int i = left - 1;
        int j = right + 1;

        while (true) {
            //check left
            do {
                i++;
            } while (arr[i] < pivot);

            //check right
            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                //part done
                return j;
            }

            //swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
