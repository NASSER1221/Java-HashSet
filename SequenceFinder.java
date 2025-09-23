import java.util.*;

public class SequenceFinder {
    /**
     * TO-DO: Find the length of the longest consecutive sequence of numbers in an array.
     * This must be implemented in O(n) time complexity.
     \*
     * @param nums An unsorted array of integers.
     * @return The length of the longest sequence.
     */
    public int longestConsecutiveSequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longestStreak = 0;
        // Your code here
        // For each number in the set...
        // Check if it is the start of a new sequence (i.e., num - 1 is NOT in the set).
        // If it is, start counting how many consecutive numbers (num + 1, num + 2, etc.) are in the set.
        // Keep track of the maximum count found.

        List<Integer> numbers = new ArrayList<>(numSet);

        Collections.sort(numbers);
        int thisStreak = 0;

        for (int i = 0; i < numbers.size(); i++) {

            if (i - 1 >= 0 && numbers.get(i) == numbers.get(i - 1) + 1) {
                thisStreak++;

                longestStreak = Math.max(longestStreak, thisStreak);
            } else thisStreak = 1;

        }


        return longestStreak;
    }

    public static void main(String[] args) {
        SequenceFinder finder = new SequenceFinder();

        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 1};
        int[] nums3 = {9, 1, 4, 4, 4, -1, 0, 5, 8, -1, 6};

        System.out.println("Test 1: " + finder.longestConsecutiveSequence(nums1)); // 4 -> [1,2,3,4]
        System.out.println("Test 2: " + finder.longestConsecutiveSequence(nums2)); // 9 -> [0,1,2,3,4,5,6,7,8]
        System.out.println("Test 3: " + finder.longestConsecutiveSequence(nums3)); // 7 -> [-1,0,1,3,4,5,6,7,8]
    }

}
