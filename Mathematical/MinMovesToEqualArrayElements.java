import java.util.*;
public class MinMovesToEqualArrayElements {
    public int minMoves2(int[] nums){

        Arrays.sort(nums);
        int median=0;
        int moves=0;
        int len=nums.length;
        median=nums[len/2];
        
        for(int num:nums){
            moves+=Math.abs(num-median);
        }
        return moves;
}
    public static void main(String[] args) {
        MinMovesToEqualArrayElements s=new MinMovesToEqualArrayElements();
        int nums[]={1,10,2,9};
        int res=s.minMoves2(nums);
        System.out.println(res);
    }
    
}
