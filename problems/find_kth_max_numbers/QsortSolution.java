package find_kth_max_numbers;

public class QsortSolution {
    public int findKthMaxNumber(int[] arr, int k, int left, int right) {

        if (arr.length == 0) {
            return -1; 
        }
        
        if (k > 0 && k <= arr.length) {

            if (left < right) {
                //get pivot's index
                int index = lPart(arr, left, right);
                if (k - 1 == index) {
                    return arr[index];
                } else if (k - 1 > index) {
                    return findKthMaxNumber(arr, k , index + 1, right);
                } else {
                    return findKthMaxNumber(arr, k, left, index - 1);
                }
            } else {
                return arr[left];
            }
        } else {
            System.out.println("the value of K is invalid " + k);
            return -1;
        }
    }


    /**
     * pivot is not all at its final position 
     */
    private int oPart(int[] arr, int left, int right) {

        int pivot = arr[left];

        int i = left - 1;
        int j = right + 1;

        while (true) {
            //check left item less than pivot
            do {
                i++;
            } while (arr[i] > pivot);

            //check right item large than pivot, then swap them
            do {
                j--;
            } while (arr[j] < pivot);

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


    /**
     * every pivot is at its final position
     */
    private int lPart(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;

        for(int j = left; j < right; j++) {
            if (arr[j] > pivot) {
                if (i != j) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;

        return i;
    }
}
