# Hashing problems

---

## Problem 242. Valid Anagram

### Pattern
Hashing / Frequency Counting

### When to Think of This Pattern
- Need to compare two strings.
- Order of characters doesn't matter.
- Frequency of each character matters.

### Key Observation
Anagrams must:
1. Have the same length.
2. Have the same frequency of every character.

### Formula
- If lengths differ → return false.
- Increase frequency for characters in `s`.
- Decrease frequency for characters in `t`.
- If every frequency becomes 0 → return true.

### Java Concepts Used
- String.length()
- String.charAt()
- int[] frequency array
- Enhanced for loop

### Mistake I Made
Initially thought of using a HashSet, but realized it only stores unique characters and loses frequency information.

### Lesson
Always ask:
> **What information do I need to preserve?**

- Presence only → HashSet
- Key → Value mapping → HashMap
- Frequency of fixed-range characters → Array

### Similar Problems
- Ransom Note
- Find All Anagrams in a String
- Group Anagrams
- Valid Palindrome
