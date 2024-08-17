# Puzzles-SlidingWindow

Find the maximum number of consecutive 1's when you can flip at most k 0's.

## Lesson Task Description (notes from video)

Suppose the interviewer gave you the following coding challenge.

They call it "Max Consecutive Ones".

Given a binary (integer) array `nums` and an integer `k`,
return the maximum number of consecutive `1`'s in the array
if you can flip at most `k` `0`'s.

Example 1:

Input: `nums` = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0] and `k` = `2`

Expect Output: `6`

Explanation: `nums` = [1, 1, 1, 0, 0, **1**, 1, 1, 1, 1, **1**]

Bolded numbers were flipped from `0` to `1`.

The longest subarray is from index `5` to index `10`, inclusive.

## Observations

The sliding window algorithm is new to me.

It is straight-forward.

However, without it, I would have fallen into the brute force trap, to solve the lesson task.

Its performance is O(n). We like this.

