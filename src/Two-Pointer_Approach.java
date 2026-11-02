public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int writeIndex = 0; // Points to where the next non-zero element should go

        // Step 1: Move all non-zero elements to the front
        for (int readIndex = 0; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] != 0) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }

        // Step 2: Fill the remaining positions with zeros
        while (writeIndex < nums.length) {
            nums[writeIndex] = 0;
            writeIndex++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

        // Print the result
        System.out.print("Output: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
