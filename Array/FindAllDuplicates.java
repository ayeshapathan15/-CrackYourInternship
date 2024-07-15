
import java.util.*;
public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        FindAllDuplicates f = new FindAllDuplicates();
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums2 = {1};
        int[] nums3 = {1,1,2};

        System.out.println(f.findDuplicates(nums1)); 
        System.out.println(f.findDuplicates(nums2)); 
        System.out.println(f.findDuplicates(nums3));

    }
}


        
    
