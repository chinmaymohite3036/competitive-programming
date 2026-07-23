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
"Can I derive the answer mathematically?"

### Similar Problems

- Codeforces 50A - Domino Piling
- Problems involving packing or grouping fixed-size objects
