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
