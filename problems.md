### Recursion Practice Problems

Tackle the easy ones first to warm up your recursive muscle memory. After solving 5-10, reflect: What's the time complexity (often O(branching^depth))? How many calls hit the base case? Ping me when you're ready for solutions, walkthroughs, or the next challenge— you've got this! What's your first pick?## 🟢 EASY — Foundational Recursion (30 problems)


| # | Problem | Short description | Core concept / technique |
| --- | --- | --- | --- |
| 1 | Print numbers 1 → N | Recursively print integers from 1 up to N. | Index recursion (forward) |
| 2 | Print numbers N → 1 | Recursively print integers from N down to 1. | Index recursion (post-call) |
| 3 | Sum of first N naturals | Return sum 1 + 2 + ... + N using recursion. | Return-based recursion |
| 4 | Factorial (n!) | Compute factorial of n recursively. | Return-based recursion |
| 5 | Power xⁿ (naïve) | Compute x raised to n by repeated multiplication. | Return-based recursion |
| 6 | Count digits | Count number of digits in positive integer. | Numeric recursion (divide by 10) |
| 7 | Reverse digits (numeric) | Produce integer with digits reversed. | Parameterized state / stack unwinding |
| 8 | String length | Compute length of string without built-in methods. | Index recursion on string |
| 9 | Sum of digits | Return sum of all digits in integer. | Return/accumulator pattern |
| 10 | Product of digits | Return product of digits in integer. | Return-based recursion |
| 11 | Nth Fibonacci (naïve) | Compute F(n) with F(n)=F(n−1)+F(n−2). | Tree recursion (inefficient) |
| 12 | Print first N Fibonacci terms | Print sequence up to N recursively. | Sequential recursion |
| 13 | Max in array | Find maximum element of array recursively. | Divide & conquer / index recursion |
| 14 | Min in array | Find minimum element recursively. | Divide & conquer / index recursion |
| 15 | Count occurrences in array | Count occurrences of value in array recursively. | Index recursion with accumulator |
| 16 | Check array sorted | Return true if array elements non-decreasing. | Index recursion (pairwise check) |
| 17 | Linear search (recursive) | Return index of target or −1 recursively. | Index recursion |
| 18 | Decimal → binary (string) | Convert integer to binary string via recursion. | Divide recursion (base conversion) |
| 19 | Binary representation (list of bits) | Return list/array of bits for n. | Return & merge (divide) |
| 20 | GCD (Euclidean) | Compute greatest common divisor via gcd(a,b)=gcd(b,a%b). | Tail recursion / mathematical recursion |
| 21 | LCM using GCD | Compute LCM using recursive GCD helper. | Composition of recursive functions |
| 22 | Triangular number | Compute T(n) = 1 + 2 + ... + n recursively. | Return-based recursion |
| 23 | Replace char in string | Return new string with all occurrences replaced. | String recursion (rebuild) |
| 24 | Remove char from string | Return string with a character removed. | Filter recursion |
| 25 | Count vowels in string | Count vowels (case-insensitive) recursively. | Index recursion on string |
| 26 | Count consonants in string | Count consonants recursively. | Index recursion on string |
| 27 | Sum of array elements | Return sum of all array elements recursively. | Index recursion with accumulation |
| 28 | Length of string | Same as #8 but in return style; compute and return length. | Return-based string recursion |
| 29 | Print string reverse | Print characters of string in reverse order. | Post-call recursion (stack unwinding) |
| 30 | Check palindrome (simple) | Check palindrome by comparing ends recursively. | Two-pointer recursion on string |

---

## 🟡 MEDIUM — Branching, State Passing, and Structured Results (30 problems)

| # | Problem | Short description | Core concept / technique |
| --- | --- | --- | --- |
| 1 | Generate subsets of string | Return all subsets (power set) of a string. | Include/Exclude recursion (return & merge) |
| 2 | Generate subsets of array | Return all subsets of an integer array. | Include/Exclude recursion |
| 3 | Generate all binary strings length N | Produce all 2ⁿ binary strings. | Build-as-you-go (partial state) |
| 4 | Permutations of string | Generate all permutations of distinct characters. | Backtracking (swap or used-array) |
| 5 | Permutations of array | Generate permutations for array of ints. | In-place swap + backtracking |
| 6 | Combinations (k of n) | Generate all k-sized combinations from n elements. | Recursive iteration with index |
| 7 | Power set of integers | Return all subsets for integer array. | Include/Exclude with collection parameter |
| 8 | Count all subsequences | Count subsequences of string (number of subsets). | Counting on recursion tree |
| 9 | Print all subsequences | Output all subsequences of a string. | Include/Exclude (build & collect) |
| 10 | String insert spaces permutations | Insert optional spaces between chars (e.g., "AB"→"A B","AB"). | Recursive insertion choices |
| 11 | Balanced parentheses (generate) | Generate all valid parentheses strings for n pairs. | Backtracking with constraint (open/close counts) |
| 12 | Count palindromic substrings (recursive) | Recursively count palindromic substrings (naïve). | Expand & check / recursive substring analysis |
| 13 | Keypad letter combinations | Map digits→letters and generate combos (phone). | Multi-branch recursion |
| 14 | Tower of Hanoi moves | Print moves to transfer n disks using recursion. | Classic divide & conquer |
| 15 | Remove consecutive duplicates | Collapse consecutive equal chars recursively. | Local-check recursion |
| 16 | Binary search (recursive) | Search sorted array using recursion. | Divide recursion (half-splitting) |
| 17 | Reverse array in-place | Reverse array using recursion and two indices. | Two-pointer recursion / in-place swap |
| 18 | Exponentiation by squaring | Compute xⁿ using divide-and-conquer power method. | Logarithmic recursion (divide & conquer) |
| 19 | Sum of digits (tail) | Sum digits using accumulator parameter. | Tail recursion / accumulator |
| 20 | Count vowels (tail) | Count vowels passing current index & accumulator. | Parameterized recursion |
| 21 | Merge two sorted lists | Recursively merge two sorted linked lists into one. | Return-based recursion on lists |
| 22 | Max element in binary tree | Return maximum node value recursively. | Tree recursion (post-order combine) |
| 23 | Paths in grid (right/down only) | Print or return all paths from top-left to bottom-right. | Grid DFS (limited moves) |
| 24 | Count grid paths (right/down) | Count number of distinct right/down paths. | Combinatorial recursion / DP precursor |
| 25 | Subset sum (existence) | Return true if subset sums to target using recursion. | Include/Exclude with pruning |
| 26 | All subsets summing to target | Return all subsets whose sum equals target. | Include/Exclude collecting results |
| 27 | Coin change combinations | Generate combinations of coins to make amount. | Unbounded-choice recursion |
| 28 | Restore valid IP addresses | Segment string into 4 valid octets; return addresses. | Segmentation recursion with validation |
| 29 | Letter case permutations | Generate strings with every character upper/lower variations. | Binary branching per character |
| 30 | Word Break (pure recursion) | Determine if s can be segmented into dictionary words (without memo). | Recursive segmentation |

---

## 🔴 HARD — Backtracking, Pruning, and Complex State (30 problems)

| # | Problem | Short description | Core concept / technique |
| --- | --- | --- | --- |
| 1 | N-Queens (all solutions) | Place N queens so none attack each other; output all boards. | Backtracking with multi-constraint checks |
| 2 | Sudoku solver | Solve 9×9 Sudoku given partial board. | Constraint-satisfaction backtracking |
| 3 | Word search (2D grid) | Check / return paths for a word in letter grid (DFS). | Recursive DFS with visited-state backtracking |
| 4 | Rat in a maze (paths) | Find path(s) in grid from start to goal avoiding walls. | Backtracking with path collection |
| 5 | Knight’s Tour | Find path visiting each chessboard square once. | Backtracking with state tracking & ordering heuristics |
| 6 | Hamiltonian Path | Find Hamiltonian path in graph (visit all vertices once). | Graph backtracking |
| 7 | Count islands in grid | Count connected components of 1s using DFS flood-fill. | Recursive DFS flood-fill |
| 8 | Maze paths with obstacles | Return all possible paths in obstacle-filled grid. | DFS with pruning & backtracking |
| 9 | Unique permutations (duplicates) | Generate unique permutations when duplicates exist. | Backtracking with sorting & used-checks |
| 10 | Combination Sum (unlimited) | Generate combinations summing to target with repeats allowed. | Recursive choice + ordered recursion to avoid duplicates |
| 11 | Combination Sum II (unique) | Combinations summing to target using each number once. | Backtracking with duplicates pruning |
| 12 | Palindromic partitions | Partition string into palindromic substrings. | Backtracking + palindrome check |
| 13 | Palindromic permutations | Generate unique palindromic permutations if possible. | Count-based building + backtracking |
| 14 | Gray code generation | Generate n-bit Gray code sequence recursively. | Recursive binary sequence construction |
| 15 | Restore IPs (all) | Return all valid IPv4 addresses from string. | Segmentation & bounds checking |
| 16 | Decode Ways (count) | Count decode ways for digit string mapping to letters. | Recursive segmentation (DP precursor) |
| 17 | Generate all BSTs with n nodes | Return all structurally unique BSTs with values 1..n. | Recursive catalan-style construction |
| 18 | Count unique BSTs | Count number of structurally unique BSTs (Catalan). | Recursive counting / divide & conquer |
| 19 | Print all root→leaf paths | Return all root-to-leaf paths in a binary tree. | Tree traversal building paths |
| 20 | 0/1 Knapsack (recursive) | Return max value for capacity using include/exclude choices. | Recursive DP (exponential without memo) |
| 21 | Count subsets with difference D | Count subsets where difference between two partitions is D. | Subset-sum transformation & include/exclude |
| 22 | Recursive multiplication (no *) | Multiply two positive integers using addition and recursion. | Repeated-add recursion (optimize with doubling) |
| 23 | Recursive division (no /) | Compute integer quotient using subtraction recursion. | Repeated-subtract recursion with count |
| 24 | Generate sentences from dictionary | Return all valid sentences by splitting string into words. | Backtracking segmentation with collection |
| 25 | String compression recursively | Convert "aaabbc" → "a3b2c1" using recursion. | Run-length recursion (count runs) |
| 26 | Crossword fill (backtracking) | Fill words into crossword slots respecting crossings. | Constraint-satisfaction backtracking |
| 27 | Evaluate postfix expression | Evaluate mathematical postfix expression via recursion on stack-like calls. | Recursive evaluation (divide-and-conquer on tokens) |
| 28 | Optimized 8-Queens | Solve 8-queens with pruning (cols/diagonals bitsets). | Backtracking + pruning / bitmask optimization |
| 29 | Min steps to N (1→N via +1,*2,*3) | Minimize operations to reach target (pure recursion). | Recursive BFS-style exploration with pruning |
| 30 | Longest increasing subsequence (recursive) | Length of LIS via include/exclude recursion (exponential). | Recursive DP precursor (include/exclude with index & prev) |

---