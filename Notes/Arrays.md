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

## 405A - Gravity Flip

### Pattern

Sorting + Observation

### When to Think of This Pattern

- Elements represent positions, heights, or values that naturally rearrange.
- The final state depends only on relative order.
- A physical process described in the problem may have a simpler representation using sorting.

### Key Observation

Instead of simulating gravity block by block, observe the final arrangement.

When gravity acts in the required direction, the column heights end up in non-decreasing order.

Therefore, simply sort the array.

### Formula

None

### Java Concepts Used

- Arrays
- Arrays.sort()
- for loop
- Array input and traversal
- Output formatting

### Mistake I Made

Initially needed some time to recognize that the gravity process does not need to be simulated.

The final arrangement can be obtained directly by sorting.

### Lesson

Do not always simulate the process exactly as described.

Before simulating, ask:

"Can I directly determine the final state?"

Sometimes a physical process is just a sorting problem in disguise.

### Similar Problems

- Array sorting problems
- Problems involving rearranging elements
- Problems where simulation can be replaced by sorting
