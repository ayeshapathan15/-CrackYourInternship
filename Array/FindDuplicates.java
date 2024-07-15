import java.util.Arrays;
  class FindDuplicates {
    public int findDuplicate(int[] nums) {
        if (nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return nums[i]; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        FindDuplicates fp = new FindDuplicates();
        int res[] = {1, 3, 4, 3, 2};
        
        int k = fp.findDuplicate(res);
        if (k != -1) {
            System.out.println(k);
        } 
    }
}

