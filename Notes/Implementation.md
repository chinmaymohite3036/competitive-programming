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

---

## Problem: 791A - Bear and Big Brother

### Pattern

Simulation using While Loop

### When to Think of This Pattern

- The number of iterations is unknown.
- Repeat an operation until a condition becomes true.
- Values change after every iteration.

### Key Observation

The answer is not calculated directly.

Instead, simulate each year until Limak becomes heavier than Bob.

### Formula

None

### Java Concepts Used

- while loop
- int
- Multiplication
- Counter Variable

### Mistake I Made

None.

Recognized that the number of iterations was unknown, so a while loop was the correct choice.

### Lesson

Ask yourself:
"When does this process stop?"

If the stopping point depends on changing values, think of a while loop.

### Similar Problems

- Population Growth
- Compound Interest Simulation
- Repeated Process Problems

---

## Problem: 69A - Young Physicist

### Pattern
Running Sum / Stream Processing

### When to Think of This Pattern
- Input is processed once.
- Previous values are never needed again.
- Problem asks for a final aggregate (sum/count/min/max).
- No sorting or revisiting elements is required.

### Key Observation
Instead of storing every input value, maintain running totals while reading the input.
For vectors, sum each component independently.

### Formula 
sumX += x
sumY += y
sumZ += z

Equilibrium exists only if:
sumX == 0 && sumY == 0 && sumZ == 0

### Java Concepts Used
- Scanner
- for loop
- Running sum variables
- Conditional (&&)

### Mistakes
Initially thought about storing vectors in an array.
Later realized the vectors are never needed after updating the sums.

### Lesson
Before using an array, ask:
1. Will I need this value later?
2. Do I need to sort it?
3. Can I update the answer while reading?

If yes to the third question, an array may be unnecessary.

### Similar Problems
- Codeforces 69A – Young Physicist
- Running sum problems
- Running count problems
- Prefix Sum (advanced version)

---

## 677A - Vanya and Fence

### Pattern

Single Pass Processing / Running Total

### When to Think of This Pattern

- Each input element contributes independently to the answer.
- Previous values are never needed again.
- No sorting or revisiting elements is required.
- The final answer can be updated while reading the input.

### Key Observation

Read one height at a time.

Immediately determine whether it contributes a width of `1` or `2`, update the total width, and discard the height.

There is no need to store all heights in an array.

### Formula

If `height > h
width += 2
Else
width += 1`


### Java Concepts Used

- Scanner
- for loop
- Temporary variables
- if-else
- Running total

### Mistake I Made

Initially wondered whether the heights should be stored in an array or read using `hasNextInt()`.

Later realized each height is used only once, so a temporary variable inside a `for` loop is sufficient.

### Lesson

Reading input is **not** the same as storing input.

Before creating an array, ask:
- Will I need this value later?
- Can I compute the answer immediately after reading it?

### Similar Problems

- Codeforces 677A - Vanya and Fence
- Codeforces 69A - Young Physicist
- Codeforces 734A - Anton and Danik
- Codeforces 266A - Stones on the Table

---

## Problem: 1030A - In Search of an Easy Problem

### Pattern

Early Termination / Flag Variable

### When to Think of This Pattern

- The answer can be determined before processing the entire input.
- A single value is enough to decide the output.
- Continuing after finding the answer does not change the result.

### Key Observation

As soon as a problem with type `1` is found, the answer is guaranteed to be `"HARD"`.

There is no need to continue checking the remaining inputs.

### Formula

None

### Java Concepts Used

- boolean
- for loop
- if statement
- break
- Scanner

### Mistake I Made

None.

Recognized the pattern immediately and solved it without requiring pen and paper.

### Lesson

When the answer becomes certain during traversal, stop immediately using `break`.

Do not continue unnecessary iterations.

### Similar Problems

- Codeforces 1030A - In Search of an Easy Problem
- Codeforces 96A - Football
- Codeforces 266A - Stones on the Table

---

## Problem: 271A - Beautiful Year

### Pattern

Brute Force Search + Digit Extraction

### When to Think of This Pattern

- Need to find the next/previous valid number.
- Each candidate can be checked independently.
- Digits need to be examined individually.

### Key Observation

Increment the year one by one.

For each year, extract its digits and check whether all digits are distinct.

The first valid year is the answer.

### Formula

Extract digits:

```java
a = year % 10
b = (year / 10) % 10
c = (year / 100) % 10
d = (year / 1000) % 10
```

Distinct condition:

```
a!=b
a!=c
a!=d
b!=c
b!=d
c!=d
```

### Java Concepts Used

- while(true)
- break
- Integer division
- Modulo
- Temporary copy variable

### Mistake I Made

Initially thought I needed to reconstruct the new year from the extracted digits.

Later realized the original `year` variable is continuously incremented, while the extracted digits are only used for checking.

### Lesson

Digit extraction is often only for verification.

Use a temporary copy when extracting digits so the original number remains unchanged.

### Similar Problems

- Codeforces 271A - Beautiful Year
- Codeforces 110A - Nearly Lucky Number
- Digit extraction problems
