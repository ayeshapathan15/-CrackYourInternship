import java.util.Arrays;
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        // Move all the non-zero elements to the beginning of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }

        // Fill the remaining array with zeros
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }

        // Print the result
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        MoveZeroes s = new MoveZeroes();
        s.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}
