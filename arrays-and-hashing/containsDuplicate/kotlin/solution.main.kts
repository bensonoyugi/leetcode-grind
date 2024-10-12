#!/usr/bin/env kotlin

// Function to determine if an array contains any duplicate integers
fun containsDuplicate(nums: IntArray): Boolean {
    // Create a HashSet to store the unique elements we've seen so far
    val seen = HashSet<Int>()

    // Iterate through each number in the input array
    for (num in nums) {
        // If the number is already in the HashSet, we found a duplicate
        if (num in seen) {
            return true // Return true as we found a duplicate
        }
        // Otherwise, add the number to the HashSet
        seen.add(num)
    }
    // If we finish the loop without finding duplicates, return false
    return false
}

// Test function for checking if duplicates are found
fun testContainsDuplicate() {
    val nums = intArrayOf(1, 2, 3, 1) // Input array with a duplicate (1 appears twice)
    // Assert that the function returns true for this input
    assert(containsDuplicate(nums)) { "Test case with duplicates failed." }
    // Print success message for this test
    println("Test case with duplicates passed.")
}

// Test function for checking an array with no duplicates
fun testNoDuplicates() {
    val nums = intArrayOf(1, 2, 3, 4) // Input array with all unique elements
    // Assert that the function returns false for this input
    assert(!containsDuplicate(nums)) { "Test case without duplicates failed." }
    // Print success message for this test
    println("Test case without duplicates passed.")
}

// Test function for checking an empty array
fun testEmptyArray() {
    val nums = intArrayOf() // An empty input array
    // Assert that the function returns false, as there are no elements to duplicate
    assert(!containsDuplicate(nums)) { "Test case with empty array failed." }
    // Print success message for this test
    println("Test case with empty array passed.")
}

// Test function for checking an array with a single element
fun testSingleElement() {
    val nums = intArrayOf(1) // An array with a single element
    // Assert that the function returns false, as one element cannot be a duplicate
    assert(!containsDuplicate(nums)) { "Test case with single element failed." }
    // Print success message for this test
    println("Test case with single element passed.")
}

// Test function for checking an array with a large input
fun testLargeInput() {
    // Create a large input array where the first 10,000 integers are unique, followed by a duplicate (1)
    val nums = IntArray(10000) { it } + intArrayOf(1)
    // Assert that the function returns true, since 1 appears twice
    assert(containsDuplicate(nums)) { "Test case with large input failed." }
    // Print success message for this test
    println("Test case with large input passed.")
}

// Measure the time taken to run all tests
val startTime = System.currentTimeMillis() // Record the start time

// Execute all test functions
testContainsDuplicate()
testNoDuplicates()
testEmptyArray()
testSingleElement()
testLargeInput()

val endTime = System.currentTimeMillis() // Record the end time
val duration = endTime - startTime // Calculate the duration of the test execution

// Print summary of test results
println("All tests passed successfully!")
println("Time taken to run tests: $duration ms") // Print the total execution time
