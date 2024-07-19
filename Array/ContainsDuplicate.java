import java.util.*;
public class ContainsDuplicate {
        public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            boolean dupli=false;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                    dupli=true;

                }
            }
            return dupli;
            
        
    }
    public static void main(String[] args) {
        ContainsDuplicate s=new ContainsDuplicate();
        int nums[]={1,2,3};
        Boolean b=s.containsDuplicate(nums);
        System.out.println(b);

    }
    
}
