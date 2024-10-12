import unittest
import time
from solution import containsDuplicate

class TestContainsDuplicate(unittest.TestCase):
    """
    This class contains test cases to test the containsDuplicate function.
    """

    def test_contains_duplicate(self):
        """
        Test case where the array contains duplicates.
        """
        nums = [1, 2, 3, 1]
        self.assertTrue(containsDuplicate(nums))
        print("Test case with duplicates passed.")

    def test_no_duplicates(self):
        """
        Test case where the array does not contain any duplicates.
        """
        nums = [1, 2, 3, 4]
        self.assertFalse(containsDuplicate(nums))
        print("Test case without duplicates passed.")

    def test_empty_array(self):
        """
        Test case where the array is empty.
        """
        nums = []
        self.assertFalse(containsDuplicate(nums))
        print("Test case with empty array passed.")

    def test_single_element(self):
        """
        Test case where the array contains only one element.
        """
        nums = [1]
        self.assertFalse(containsDuplicate(nums))
        print("Test case with single element passed.")

    def test_large_input(self):
        """
        Test case with a larger input array to ensure function handles big inputs.
        """
        nums = list(range(10000)) + [1]
        self.assertTrue(containsDuplicate(nums))
        print("Test case with large input passed.")

if __name__ == '__main__':
    # Measure the time taken to run tests
    start_time = time.time()

    # Run the test cases
    unittest.main(verbosity=0)

    # Calculate and print the duration
    duration = (time.time() - start_time) * 1000
    print("All tests passed successfully!")
    print(f"Time taken to run tests: {duration:.4f} ms")
