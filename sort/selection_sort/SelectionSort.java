package selection_sort;

public class SelectionSort {
    //divide array to two parts
    //sorted part and unsorted part
    //choose minimum item from unsorted area and
    //append at the end of sorted part
   public void sort(int[] arr) {

       for (int i = 0; i < arr.length; i++) {
            
           int min = arr[i];
           for (int j = i + 1; j < arr.length - 1; j++) {
               if (min > arr[j]) {
                   min = arr[j];
               }
           }

           //append to the end
           arr[i] = min;

       }
   } 
}
