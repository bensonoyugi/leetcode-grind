def containsDuplicate(nums):
    """
    This function checks if there are any duplicate elements in the array.

    Args:
    nums (List[int]): List of integers.

    Returns:
    bool: True if there is at least one duplicate element, False otherwise.
    """

    # Initialize an empty set to keep track of the numbers we have seen
    seen = set()

    # Loop through each number in the array
    for num in nums:
        # If the number is already in the set, it means we found a duplicate
        if num in seen:
            return True
        # Otherwise, add the number to the set
        seen.add(num)

    # If no duplicates were found, return False
    return False
