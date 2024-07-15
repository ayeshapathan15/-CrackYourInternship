public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
    
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
                }
            }
                return new int[]{};
            }
            public static void main(String...args){
                TwoSum s1=new TwoSum();
                int result[]=s1.twoSum(new int[]{3,2,4},6);
                if(result.length>0){
                    System.out.println("["+result[0]+","+result[1]+"]");
                }
                else{
                    System.out.println("result not found");
                }
            }
            
        }
    
    

