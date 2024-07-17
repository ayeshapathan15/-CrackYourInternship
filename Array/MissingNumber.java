public class MissingNumber {
    public int missingNumber(int[] nums){
        int total=0;
        int sum=0;
        int n=nums.length;
        /*for(int i=1;i<=nums.length;i++){
         total+=i;
        
        }*/
        total=n*(n+1)/2; 

        for(int j=0;j<nums.length;j++){
             sum += nums[j];
             
        }
        return total-sum;
    }
    public static void main(String[] args) {
        MissingNumber s=new MissingNumber();
        int nums[]={3,0,1};
        int res=s.missingNumber(nums);
        System.out.println(res);
    }
    
}
