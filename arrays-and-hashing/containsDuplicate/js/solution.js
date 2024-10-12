/**
 * Checks if an array contains any duplicate elements.
 *
 * @param {number[]} nums - An array of integers.
 * @returns {boolean} - Returns true if there is at least one duplicate element, false otherwise.
 */
function containsDuplicate(nums) {
  // Initialize an empty Set to keep track of the numbers we have seen.
  const seen = new Set();

  // Loop through each number in the array.
  for (const num of nums) {
    // If the number is already in the Set, it means we found a duplicate.
    if (seen.has(num)) {
      return true; // Duplicate found.
    }
    // Otherwise, add the number to the Set.
    seen.add(num);
  }

  // If no duplicates were found, return false.
  return false;
}

// Export the function for use in the test file.
module.exports = containsDuplicate;
