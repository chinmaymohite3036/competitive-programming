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

Forgot Java for-loop syntax.

Forgot Java requires public class Main.

### Lesson

Whenever values are binary (0/1),
their sum can often directly represent the count of true conditions.
