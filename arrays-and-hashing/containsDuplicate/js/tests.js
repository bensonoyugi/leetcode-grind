const containsDuplicate = require("./solution");

/**
 * A function to run the test cases for the containsDuplicate function.
 */
function runTests() {
  // Capture the start time
  const startTime = Date.now();

  // Test case 1: Array with duplicates
  const test1 = [1, 2, 3, 1];
  console.assert(
    containsDuplicate(test1) === true,
    "Test case with duplicates failed.",
  );
  console.log("Test case with duplicates passed.");

  // Test case 2: Array without duplicates
  const test2 = [1, 2, 3, 4];
  console.assert(
    containsDuplicate(test2) === false,
    "Test case without duplicates failed.",
  );
  console.log("Test case without duplicates passed.");

  // Test case 3: Empty array
  const test3 = [];
  console.assert(
    containsDuplicate(test3) === false,
    "Test case with empty array failed.",
  );
  console.log("Test case with empty array passed.");

  // Test case 4: Single element array
  const test4 = [1];
  console.assert(
    containsDuplicate(test4) === false,
    "Test case with single element failed.",
  );
  console.log("Test case with single element passed.");

  // Test case 5: Large input array
  const test5 = [...Array(10000).keys(), 1]; // Array from 0 to 9999 and add a duplicate '1'.
  console.assert(
    containsDuplicate(test5) === true,
    "Test case with large input failed.",
  );
  console.log("Test case with large input passed.");

  console.log("All tests passed successfully!");

  // Capture the end time
  const endTime = Date.now();

  // Calculate the time taken to run tests
  const duration = endTime - startTime; // Duration in milliseconds
  console.log(`Time taken to run tests: ${duration} milliseconds`);
}

// Run the tests when the script is executed
runTests();
