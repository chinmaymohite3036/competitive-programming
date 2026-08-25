## Domino Piling (50A)

### Pattern

mathematical Observation

### When to Think of This Pattern

- Each object always occupies a fixed number of units.
- The arrangement doesn't affect the final count.
- The problem asks only for the maximum number, not the placement.

### Key Observation

A domino always covers exactly 2 squares.

Maximum dominoes = floor(total squares / 2).

### Formula

Maximum Dominoes = (M × N) / 2 (integer division)


### Mistake I Made

Initially, it looked like a simulation problem, but no simulation was needed.

### Similar Problems

- Codeforces 50A - Domino Piling
- Problems involving packing or grouping fixed-size objects

---
## 546A - Soldier and Bananas

### Pattern

Mathematical Observation / Arithmetic Series

### When to Think of This Pattern

- The values increase in a fixed pattern (k, 2k, 3k, ...).
- You need the total sum of a sequence.
- The problem asks for the total cost, distance, or quantity.

### Key Observation

The banana prices form an arithmetic series.

Instead of adding each banana's price using a loop, calculate the total directly using the sum of the first n natural numbers.

### Formula

Sum of first n natural numbers:

n × (n + 1) / 2

Total Cost:

k × w × (w + 1) / 2

Money to Borrow:

max(0, Total Cost − Initial Money)

### Java Concepts Used

- int
- Arithmetic Operators
- if-else
- Math.max() (optional)

### Mistake I Made

Initially thought a loop was required.

Later realized the total could be calculated directly using a mathematical formula.

### Lesson

Before writing a loop, ask:
"Am I repeatedly adding a known mathematical sequence?"

### Similar Problems

- Codeforces 546A - Soldier and Bananas
- Arithmetic Progression
- Sum Formula Problems

---

## 617A - Elephant

### Pattern

Ceiling Division / Mathematical Observation

### When to Think of This Pattern

- Find the minimum number of moves.
- Each move can cover at most K units.
- Minimum trips, boxes, groups, or jumps.

### Key Observation

The elephant should always take the maximum possible step (5).

If the remaining distance is not divisible by 5, one extra step is needed.

Instead of checking the remainder separately, use ceiling division.

### Formula

General Formula:

(x + k - 1) / k

For this problem:

(x + 4) / 5

### Java Concepts Used

- Integer Division
- Modulus (%)
- Arithmetic Operators

### Mistake I Made

Initially used:

(x / 5) + 1

This failed when x was already divisible by 5 (e.g., x = 5).

Learned that the extra step is required only when there is a remainder.

### Lesson

Whenever the problem asks for the minimum number of fixed-size moves, think of Ceiling Division.

### Similar Problems

- Codeforces 617A - Elephant
- Minimum Trips
- Minimum Groups
- Ceiling Division Problems
"Can I derive the answer mathematically?"

---

## 110A - Nearly Lucky Number

### Pattern

Digit Extraction + Counting

### When to Think of This Pattern

- Process every digit of a number.
- Count occurrences of specific digits.
- Reverse traversal of digits is acceptable.

### Key Observation

Extract digits using `% 10` and remove them using `/= 10`.

After counting lucky digits (4 or 7), check whether the count itself is lucky.

### Formula

digit = n % 10
n /= 10

### Java Concepts Used

- long
- while loop
- Modulo (%)
- Integer division (/)

### Mistake I Made

Initially thought every digit had to be lucky.

Also considered using int, but the constraints require long.

### Lesson

Read the problem statement carefully.

Sometimes the answer depends on the result of a count, not the original number.

Always choose the data type based on constraints.

### Similar Problems

- Codeforces 110A - Nearly Lucky Number
- Sum of Digits
- Count Digits
- Digit Frequency

---

## Problem: 200B - Drinks

### Pattern

Average / Arithmetic Mean

### When to Think of This Pattern

- The problem asks for the average of multiple values.
- Every value contributes equally to the final result.
- Individual values are not needed after processing them.

### Key Observation

The percentage of orange juice in the final mixture is the arithmetic mean of all given percentages.

Read each percentage, add it to a running sum, then divide the sum by `n`.

### Formula

Average = Sum of all values / Number of values

### Java Concepts Used

- Scanner
- for loop
- Running sum
- double
- Floating-point division

### Mistake I Made

none

### Lesson

Before storing input in an array, ask:

"Do I need each individual value later?"

If not, process it immediately using a running variable.

Also remember that integer division can lose the fractional part, so use a floating-point value when the answer can be decimal.

### Similar Problems

- Codeforces 200B - Drinks
- Average / Mean problems
- Running Sum problems

---

## Problem: 1742A - Sum

### Pattern

Conditional Logic + Mathematical Observation

### When to Think of This Pattern

- The problem asks whether one value can be represented using the other values.
- There are only a small number of possible relationships.
- The conditions can be checked directly without loops over the values.

### Key Observation

One of the three numbers must equal the sum of the other two.

Therefore, check all three possibilities:

a + b = c
a + c = b
b + c = a

If any condition is true, print YES. Otherwise, print NO.

### Formula

None

### Java Concepts Used

- Scanner
- int
- for loop
- Logical OR (`||`)
- Conditional statements

### Mistake I Made

Initially considered using `byte` because the constraints were only 0 to 20.

Realized that `int` is the standard and more convenient choice for small integer arithmetic in Competitive Programming.

### Lesson

Always check constraints before choosing a data type, but don't over-optimize unnecessarily.

For ordinary small integer calculations in CP, `int` is usually the practical default.

### Similar Problems

- Codeforces 1742A - Sum
- Codeforces 231A - Team
- Codeforces 1030A - In Search of an Easy Problem
