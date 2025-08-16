### Assignment 3: [[DONE](/assignments/assignment_3)]

You are given a list of integers representing a sequence of moves in a game.

- Each integer represents a move (like a key)
- You need to keep track of how many times each move has appeared using a HashMap.
- After processing the whole list, remove all moves from the map whose frequency is less than the average frequency of all moves
- Return the list of remaining moves sorted by their frequencies in descending order
- If frequencies are equal, sort by the move value ascending

#### Example:

```
Input: [2, 3, 2, 4, 3, 2, 5, 4]
```

#### Frequencies

```
2 → 3 times
3 → 2 times
4 → 2 times
5 → 1 time
```

- Average frequency = (3 + 2 + 2 + 1) / 4 = 2
- Remove moves with frequency < 2 → remove move 5
- Remaining: 2, 3, 4
- Sort by frequency desc and then move asc → [2 (3), 3 (2), 4 (2)]

```
Output: [2, 3, 4]
```

<b>Submission:<b> 17/08/2025
