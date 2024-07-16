import java.util.Arrays;
class MaxProductOfThreeNums {
    public int maximumProduct(int[] nums) {
        int product=0;

        Arrays.sort(nums);
        int n=nums.length;
        product=Math.max(nums[n-1] * nums[n-2] * nums[n-3], nums[0] * nums[1] * nums[n-1]);

        return product;
    }
    
    
    public static void main(String[] args) {
        MaxProductOfThreeNums s=new MaxProductOfThreeNums();
        int nums[]={1,2,3,4};
        int res=s.maximumProduct(nums);
        System.out.println(res);
    }
}

