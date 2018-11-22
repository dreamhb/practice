# Find Kth largest element in array

## quick sort solution:

### The time complexity of qsort version is O(n).

The main operation here is in partition,
    first, n  
    second n/2  
    third n/4  
    ...  
    final 1  

plus all above is 2n - 1, so the complexity is O(n).


## min heap solution

1> build the min heap, holding K max number  
2> scan item in array one by one, suppose the heap top is X,
   and get a Y from array  
3> if Y > X, we should replace X with Y  
4> rearrange the heap to meet min heap  
