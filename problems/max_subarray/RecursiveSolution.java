package max_subarray;

public class RecursiveSolution {

    /**
     *
     * @return int[] contains left and right index and the sum
     **/
    public int[] find(int[] arr, int left, int right) {
        int[] result = new int[3];
        if (left == right) {
            result[0] = left;//left index
            result[1] = left;//right index
            result[2] = arr[left];//sum
            return result;
        }

        int mid = (right + left) / 2;

        int[] lResult = find(arr, left, mid);
        int[] rResult = find(arr, mid + 1, right);
        int[] cResult = findCrossMid(arr, left, mid, right);

        if (lResult[2] >= rResult[2] && lResult[2] >= cResult[2]) {
            //left one is the max
            return lResult;
        } else if (rResult[2] >= lResult[2] && rResult[2] >= cResult[2]) {
            //right one is the max
            return rResult;
        } else {
            //cross one is the max
            return cResult;
        } 
    }


    public int[] findCrossMid(int[] arr, int left, int mid, int right) {
        int[] result = new int[3];
        int leftSum = - Integer.MAX_VALUE;
        int lSum = 0;
        int l = 0;
        for (int i = mid; i >= left; i--) {
            lSum += arr[i];
            if (leftSum < lSum) {
                leftSum = lSum;
                l = i;
            }
        }
        result[0] = l;

        int rightSum = - Integer.MAX_VALUE;
        int rSum = 0;
        int r = 0;
        for (int j = mid + 1; j <= right; j++) {
            rSum += arr[j];
            if (rightSum < rSum) {
                rightSum = rSum;
                r = j;
            }
        }
        result[1] = r;

        result[2] = leftSum + rightSum;

        return result;
    }
}
