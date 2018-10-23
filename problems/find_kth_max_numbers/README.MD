# Find Kth largest element in array

### The time complexity of qsort version is O(n).

The main operation here is in partition,
first, n
second n/2
third n/4
...
final 1

plus all above is 2n - 1, so the complexity is O(n).
