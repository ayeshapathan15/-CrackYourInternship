class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; 

        int k = 1; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; 
                k++;
            }
        }
        
        return k;
    }
    
    public static void main(String[] args) {
        RemoveDuplicates sol = new RemoveDuplicates();
        int[] nums = {0, 0, 1, 1, 1, 3};
        int k = sol.removeDuplicates(nums);
        System.out.print("["); 
        for (int i = 0; i < k; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(nums[i]);
        }
        System.out.print("]");
    }
}
