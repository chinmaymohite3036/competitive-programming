# Arrays

---

## Problem: 158A - Next Round

### Pattern
Array Traversal + Counting Based on a Condition

### When to Think of This Pattern
- Scores are given in an array.
- Need to compare every element with a reference value.
- Final answer is the count of elements satisfying a condition.

### Key Observation
The k-th place score acts as the threshold.

A contestant advances only if:
- score >= threshold
- AND score > 0

### Formula
threshold = scores[k - 1]

### Java Concepts Used
- Arrays
- for loop
- Scanner
- if statement

### Mistake I Made
- Approached as setting a key as threshold and finding the elements greater or equal than it.
- forget to access the array elements while checking the condition. scores[i]

### Lesson
When the problem asks you to compare every element with one particular element, store that element first and then traverse the array.

### Similar Problems
....
