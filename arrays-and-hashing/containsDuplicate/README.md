
# Contains Duplicate Problem

## Task Description
The task is:

**Problem Statement**:
> Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

For example, given the input:
```python
nums = [1, 2, 3, 1]
```
The function should return `true` because the number `1` appears twice.

---

## Approaches to Solve the Problem

### 1. **Brute Force Approach**

In this approach, we compare every pair of elements in the array to check for duplicates. We use two nested loops where the outer loop iterates through each element, and the inner loop checks if that element is duplicated later in the array.

#### Code Example (Python):
```python
def containsDuplicate(nums):
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] == nums[j]:
                return True
    return False
```

#### Time Complexity:
- **O(n²)** (Quadratic)
- We are comparing every pair, which leads to `n * (n-1) / 2` comparisons, making it inefficient for large arrays.

#### Space Complexity:
- **O(1)** (Constant space)
- The space used is minimal since we're only using a few variables for the loops.

### 2. **Sorting Approach**

In this approach, we first sort the array, and then we check for consecutive duplicates. If the array is sorted, any duplicates will be next to each other, making it easy to check.

#### Code Example (Python):
```python
def containsDuplicate(nums):
    nums.sort()
    for i in range(1, len(nums)):
        if nums[i] == nums[i - 1]:
            return True
    return False
```

#### Time Complexity:
- **O(n log n)** (Logarithmic time)
- Sorting the array takes `O(n log n)` time, and iterating through the array afterward takes `O(n)` time.

#### Space Complexity:
- **O(1)** (if sorting is done in place)
- No extra space is needed besides a few variables, though sorting in place modifies the original array.

### 3. **HashSet Approach (Optimal Solution)**

This is the most efficient solution, where we use a **hashset** to track the elements we’ve seen as we iterate through the array. The idea is simple: for each number in the array, we check if it is already in the set. If it is, we return `true`, as it indicates a duplicate. If not, we add it to the set and continue.

#### Code Example (Python):
```python
def containsDuplicate(nums):
    seen = set()
    for num in nums:
        if num in seen:
            return True
        seen.add(num)
    return False
```

#### Time Complexity:
- **O(n)** (Linear time)
- We only pass through the array once, and checking if an element is in a set and inserting an element both take **O(1)** time on average.

#### Space Complexity:
- **O(n)** (Linear space)
- We are storing up to `n` elements in the hashset, one for each number in the array.

---

## Why HashSet is the Optimal Solution

- **Time Efficiency**: The brute force approach takes quadratic time, and the sorting approach takes logarithmic time. In contrast, the hashset approach only takes linear time, which is the most efficient solution in terms of time complexity.

- **Space Efficiency**: Although the hashset uses linear space, this is generally acceptable for most real-world applications. While the sorting approach can achieve constant space if done in place, it modifies the original array, which may not always be desirable.

- **Clarity and Simplicity**: The hashset approach is both concise and easy to understand. It immediately conveys the idea of tracking what we've seen and quickly identifies duplicates. It balances performance with clarity, making it an ideal choice for solving the "Contains Duplicate" problem.

---

## Conclusion

Among the three approaches, the **hashset** approach is the best due to its linear time complexity and simplicity. It ensures we can efficiently detect duplicates without the overhead of sorting or excessive comparisons. This makes it the preferred solution for handling this type of problem, especially when working with large arrays.
