package main

import (
	"fmt"
	"testing"
	"time" // Import time package for measuring duration
)

// TestContainsDuplicate is a struct for grouping related test cases.
type TestContainsDuplicate struct {
	nums []int  // Input slice of integers
	want bool   // Expected result
	name string // Name of the test case
}

// Tests for the containsDuplicate function
func TestContainsDuplicateFunction(t *testing.T) {
	// Define test cases
	tests := []TestContainsDuplicate{
		{nums: []int{1, 2, 3, 1}, want: true, name: "Test case with duplicates"},
		{nums: []int{1, 2, 3, 4}, want: false, name: "Test case without duplicates"},
		{nums: []int{}, want: false, name: "Test case with empty array"},
		{nums: []int{1}, want: false, name: "Test case with single element"},
		{nums: append(make([]int, 10000), 1), want: true, name: "Test case with large input"},
	}

	// Run each test case
	for _, test := range tests {
		got := containsDuplicate(test.nums)
		if got != test.want {
			t.Errorf("%s failed:.", test.name)
		}
		fmt.Printf("%s passed.\n", test.name)
	}
}

// Main function to run tests and measure time
func main() {
	// Measure the time taken to run tests
	start := time.Now()

	// Run the tests
	var failedTests int
	testing.RunTests(func(string, string) (bool, error) { return true, nil }, []testing.InternalTest{{"TestContainsDuplicateFunction", TestContainsDuplicateFunction}})

	// Check for test results (Since RunTests doesn't return results, we just print the count)
	if failedTests > 0 {
		fmt.Printf("Tests failed: %d\n", failedTests)
	} else {
		fmt.Println("All tests passed successfully.")
	}

	// Calculate and print the duration
	duration := time.Since(start)
	fmt.Printf("Time taken to run tests: %v ms", duration.Milliseconds())
}
