package selection_sort;

public class SelectionSort {
    //divide array to two parts
    //sorted part and unsorted part
    //choose minimum item from unsorted area and
    //append at the end of sorted part
   public void sort(int[] arr) {

       for (int i = 0; i < arr.length; i++) {
            
           int min = arr[i];
           int j = i + 1;
           int index = -1;
           for (; j < arr.length; j++) {
               if (min > arr[j]) {
                   min = arr[j];
                   index = j;
               }
           }

           //swap min and ...
           //because of this swap, it is not stable
           if (index != -1) {
               int temp = arr[i];
               arr[i] = min;
               arr[index] = temp;
           }
       }
   } 
}
