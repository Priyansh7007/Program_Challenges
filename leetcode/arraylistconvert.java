package priyansh.leetcode;







public class arraylistconvert {

    public int[] twoSum(int[] nums, int target) {
        //int sum =0;
        int temp[] = new int[2];
        for(int i =0 ; i<nums.length-1; ++i){
            for (int j = i+1; j < nums.length; ++j) {
                
                if(nums[i] + nums[j] == target){
                    temp[0] = i;
                    temp[1] = j;
                    break;
                }
            }
        }
        System.out.println("["+temp[0]+","+temp[1]+"]");
        return temp;
      }
      public static void main(String [] args){
        arraylistconvert obj = new arraylistconvert();
        
          
         
          int[] nums = {2,7,11,15};
          int target = 9;
          obj.twoSum(nums, target);
          
        
      }
    
}
