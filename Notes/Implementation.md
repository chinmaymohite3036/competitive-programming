# Implementation

---

## Team (Codeforces 231A)

### Pattern

Counting based on a condition.

### Observation

Since inputs are only 0 and 1,
adding them directly gives the number of people satisfying the condition.

### Algorithm

- Read n
- Repeat n times
- Read three numbers
- Add them
- If sum >= 2
  increase answer
- Print answer

### Mistake
Initially thought of using separate counters.

---

## Bit++ (Codeforces 282A)

### Problem:
282A - Bit++

### Platform:
Codeforces

### Topic:
Implementation

### Difficulty:
800

### Pattern:
String Inspection + Condition-Based Update

### Observation:
Instead of checking all four possible strings, inspect the second character.
If it is '+', increment.
Otherwise, decrement.

### Key Logic:
operation.charAt(1)

### Mistakes:
Tried to check only "++x" and "--x" condition and forgot about "x++" and "x--" possibilities.   
Uselessly tried to use 4 step if else ladder making program more complicated.

### Lesson:
Before comparing entire strings, check whether a single character or property is enough to determine the answer.

### Time Complexity:
O(n)

### Space Complexity:
O(1)

Forgot Java for-loop syntax.

### Lesson

Whenever values are binary (0/1),
their sum can often directly represent the count of true conditions.
