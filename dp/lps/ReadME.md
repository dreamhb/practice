# Longest Palindromic Substring

This is a typical dynamic programming problem.

* Optimal substructure
    Let L(0, n-1) be the X(0, n-1) 's longest palindromic substrings, which X(0,n-1) is the string of length n. If last char and the first char are the same, L(0, n-1) = L(1, n-2) + 2, otherwise L(0,n-1) = max(L(0, n-2), L(1, n-1))
* Overlapping 
