/*public class ProductArrayPuzzle {
    
    public static void main(String[] args) {
        int nums[]={3,10,5,6,2};
        
        int product=1;
        for(int i=0;i<nums.length-1;i++){
    
            
            product=product*nums[i+1];
            }



        
        System.out.println(product);
        }
    }*/
    public class ProductArrayPuzzle {
        public static int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] left = new int[n];
            int[] right = new int[n];
            int[] product = new int[n];
            
            // Initialize left and right arrays
            left[0] = 1;
            right[n - 1] = 1;
            
            // Construct the left array
            for (int i = 1; i < n; i++) {
                left[i] = left[i - 1] * nums[i - 1];
            }
            
            // Construct the right array
            for (int j = n - 2; j >= 0; j--) {
                right[j] = right[j + 1] * nums[j + 1];
            }
            
            // Construct the product array
            for (int i = 0; i < n; i++) {
                product[i] = left[i] * right[i];
            }
            
            return product;
        }
        public static void main(String[] args) {
            int nums[] = {10, 3, 5, 6, 2};
            
            int[] product = productExceptSelf(nums);
            
            for (int num : product) {
                System.out.print(num + " ");
            }
        }
    }
    

        
	 
    
