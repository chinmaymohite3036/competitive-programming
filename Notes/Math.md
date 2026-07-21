# Domino Piling (50A)

## Pattern

mathematical Observation

## When to Think of This Pattern

- Each object always occupies a fixed number of units.
- The arrangement doesn't affect the final count.
- The problem asks only for the maximum number, not the placement.

## Key Observation

A domino always covers exactly 2 squares.

Maximum dominoes = floor(total squares / 2).

## Formula

Maximum Dominoes = (M × N) / 2 (integer division)


## Mistake I Made

Initially, it looked like a simulation problem, but no simulation was needed.

## Lesson

Before simulating anything, ask:

"Can I derive the answer mathematically?"

## Similar Problems

- Codeforces 50A - Domino Piling
- Problems involving packing or grouping fixed-size objects
