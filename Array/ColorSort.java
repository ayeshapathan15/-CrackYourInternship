import java.util.Arrays;
public class ColorSort {
        public void sortColors(int[] nums) {
            int temp;
            for(int i=0;i<nums.length-1;i++){
                for(int j=0;j<nums.length-1-i;j++){
                    if(nums[j]>nums[j+1]){
                        temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                        
                    }
                }
            }
            System.out.println(Arrays.toString(nums));
            
        }
        public static void main(String[] args) {
            ColorSort s=new ColorSort();
           int nums[]={2,0,2,1,1,0};
           s.sortColors(nums);
        }
    }
    

