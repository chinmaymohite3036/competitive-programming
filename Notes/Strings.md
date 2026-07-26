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

---

## 281A - Word Capitalization

### Pattern

String Manipulation

### When to Think of This Pattern

- Only the first character needs modification.
- The remaining part of the string stays unchanged.
- The problem asks to capitalize or alter only the beginning of a string.

### Key Observation

There is no need to traverse the whole string.

Modify the first character if required and append the remaining substring unchanged.

### Formula (if applicable)

None

### Java Concepts Used

- charAt()
- Character.isLowerCase()
- Character.toUpperCase()
- substring()

### Mistake I Made

None.

### Lesson

Before using a loop, ask:

"Do I really need to inspect every character?"

Sometimes only a specific position matters.

### Similar Problems

- Codeforces 281A - Word Capitalization
- String Formatting
- First Character Manipulation

---

## Consecutive Streak Counting (96A - Football)

### Pattern

Consecutive Streak Counting

### When to Think of This Pattern

- Find consecutive equal characters.
- Continuous sequence.
- Adjacent repetition.
- Longest streak.

### Key Observation

Do not count equal pairs.

Count the length of the current consecutive streak.

When the character changes,
the new character starts a new streak of length 1.

If the streak reaches the required length,
the answer is already known.

### Logic

currentStreak = 1

if (current == previous)
    currentStreak++
else
    currentStreak = 1

### Java Concepts Used

- String
- charAt()
- for loop
- Early return

### Mistake I Made

Initially counted adjacent equal pairs.

Also reset the counter to 0 instead of 1 when the streak broke.

Checked the answer only after the loop instead of as soon as the streak reached 7.

### Lesson

Whenever the problem mentions "consecutive" or "continuous",
think in terms of the current streak, not the total count.

### Similar Problems

- Codeforces 96A - Football
- Longest Consecutive Sequence
- Consecutive Characters
