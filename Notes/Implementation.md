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
