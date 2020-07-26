In base -2, integers are represented by sequences of bits in the following way: bits are ordered from the least to the most significant. A sequence B of N bits represents the number: sum{ B[i]*(-2)<sup>i</sup> for i = 0...N-1 }. The empty sequence represents 0. For example: 

100111  represents -23

001011  represents -12

10011   represents 9

001     represents 4,

because: 

Note that such a representation is suitable for both positive and negative integers.

Write a function: 

```java
class Solution { public int[] solution(int[] A); }
```

that, given an array A of M bits, containing a sequence representing some integer X, returns the shortest sequence of bits representing ceiling (X/2), where, ceiling(Y) is the smallest integer that is bigger than or equal to Y.

For example, given A = [1,0,0,1,1] (X=9), the function should return [1,0,1] (ceiling(X/2) = 5).
Given A = [](X = 0), the function should return [] (ceiling(X/2) = 0).

Write an efficient algorithm for the following assumptions: 
- M is an integer within the range [0..100,000];
- each element of array A is an integer that can have one of the following values: 0,1;
- if A is not empty then the last element of A is 1.
