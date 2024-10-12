package main

// containsDuplicate checks if there are any duplicate elements in the slice.
//
// Parameters:
//
//	nums []int: Slice of integers to check for duplicates.
//
// Returns:
//
//	bool: True if there is at least one duplicate element, False otherwise.
func containsDuplicate(nums []int) bool {
	// Create a map to keep track of the numbers we have seen
	seen := make(map[int]struct{})

	// Iterate through each number in the slice
	for _, num := range nums {
		// If the number is already in the map, it means we found a duplicate
		if _, exists := seen[num]; exists {
			return true
		}
		// Otherwise, add the number to the map
		seen[num] = struct{}{}
	}

	// If no duplicates were found, return false
	return false
}
