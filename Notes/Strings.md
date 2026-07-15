---

## Problem: 71A - Way Too Long Words

### Pattern

Conditional Logic + String Manipulation

### When to Think of This Pattern

- You need to transform a string based on a condition.
- Only certain parts of the string are required.
- The output format differs from the input.

### Key Observation

Check the length first.
If the length is greater than 10, abbreviate the word by keeping the first and last characters and replacing the middle with its count.

### Formula

middleCount = word.length() - 2

### Java Methods Used

- length()
- charAt()
- next()

### Mistake I Made

- Initially tried `nextStr()` instead of `next()`.
- Forgot that Java needs string concatenation (`""`) when combining characters and numbers.

### Lesson

Before coding, ask:

1. What changes?
2. When does it change?
3. Can the transformation be expressed as one simple rule?

### Similar Problems

(Add here whenever you solve another problem that uses the same pattern.)
