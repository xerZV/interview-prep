Given a `6x6` 2D Array, `arr`:
<pre>
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
</pre>

We define an hourglass in `A` to be a subset of values with indices falling in this pattern in `arr`'s graphical representation:
<pre>
a b c
  d
e f g
</pre>

There are `16` hourglasses in `arr`, and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in `arr`, then print the maximum hourglass sum.

For example, given the 2D array:
<pre>
-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
</pre>

We calculate the following `16` hourglass values:
<pre>
-63, -34, -9, 12, 
-10, 0, 28, 23, 
-27, -11, -2, 10, 
9, 17, 25, 18
</pre>

Our highest hourglass value is `28` from the hourglass:
<pre>
0 4 3
  1
8 6 6
</pre>

Function Description

Complete the function hourglassSum in the editor below. It should return an integer, the maximum hourglass sum in the array.

hourglassSum has the following parameter(s):

 - arr: an array of integers

**Input Format**

Each of the `6` lines of inputs `arr[i]` contains `6` space-separated integers `arr[i][j]`.

**Output Format**

Print the largest (maximum) hourglass sum found in `arr`.

**Sample Input**
<pre>
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
</pre>

**Sample Output**
<pre>19</pre>

**Explanation**
<pre>
2 4 4
  2
1 2 4
</pre>