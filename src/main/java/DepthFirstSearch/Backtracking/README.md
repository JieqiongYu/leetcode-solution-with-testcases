# Backtracking

## Intuition

> As a reminder, backtracking is a general algorithm for finding all (or some) solutions to some 
> computational problems. The idea is that it **_incrementally_** builds candidates 
> to the solutions, and abandons a candidate ("backtrack") as soon as it determines 
> that this candidate cannot lead to a final solution.

## Example

- [39. Combination Sum](CombinationSum.java)

Specially, to our problem, we could incrementally build the combination, and once we find the current combination 
is not valid, we _backtrack_ and try another option. 

![image](https://user-images.githubusercontent.com/45551663/94921319-0c02b480-04f3-11eb-8ebb-817dcb6a8260.png)

