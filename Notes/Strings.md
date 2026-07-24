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

To be added later

---

## Problem 112A : Petya and Strings

### Pattern

Lexicographical String Comparison

### When to Think of This Pattern

- Compare two strings alphabetically (dictionary order).
- The problem asks whether one string is smaller, greater, or equal.
- Case-insensitive string comparison.

### Key Observation

The problem states that uppercase and lowercase letters should be treated as the same.

Instead of comparing characters manually, convert both strings to the same case (lowercase) and use Java's built-in `compareTo()` method.

### Formula 

compareTo()

Returns:
- Negative → First string is smaller
- Zero → Strings are equal
- Positive → First string is greater

Output:
- ans < 0 → -1
- ans == 0 → 0
- ans > 0 → 1

### Java Concepts Used

- String
- Scanner
- toLowerCase()
- compareTo()
- if-else

### Mistake I Made

Initially planned to compare characters one by one using loops.

Later realized Java already provides `compareTo()`, which is simpler and less error-prone.

### Lesson

Before implementing a common operation manually, think:
"Does Java already provide a built-in method for this?"

### Similar Problems

- Dictionary Order Problems

---

## 59A - Word

### Pattern

Counting + String Manipulation

### When to Think of This Pattern

- Need to compare the frequency of two types of characters.
- The final action depends on the counts.
- The problem asks to convert or modify the entire string after analysis.

### Key Observation

Traverse the string once and count uppercase and lowercase letters separately.

After counting, make one decision:

- Uppercase > Lowercase → convert entire string to uppercase.
- Otherwise → convert to lowercase.


### Java Concepts Used

- String
- char
- charAt()
- Character.isUpperCase()
- toUpperCase()
- toLowerCase()
- for loop

### Mistake I Made

Initially tried to use:

character.isUpperCase()

Learned that `char` is a primitive type.

The correct method is:

Character.isUpperCase(character)

### Lesson

Before modifying an entire string,
first collect all the information you need.

Then make a single decision.

### Similar Problems

- Codeforces 59A - Word
- Character Counting
- String Case Conversion
